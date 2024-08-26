from fastapi import FastAPI, Response, Request
from prometheus_client import Counter, generate_latest, CONTENT_TYPE_LATEST, Histogram
import time

app = FastAPI()

REQUESTS = Counter("requests_total", "Total HTTP requests.")
EXCEPTIONS = Counter("exceptions_total", "Total HTTP exceptions.")
LATENCY = Histogram('latency_seconds', 'HTTP request latency (seconds).')

@app.get("/")
async def root():
    REQUESTS.inc()
    return {"greeting": "Hello World!"}

@app.get("/metrics")
async def metrics():
    return Response(generate_latest(), media_type=CONTENT_TYPE_LATEST)

@app.exception_handler(Exception)
async def exceptions(request: Request, exc: Exception):
    EXCEPTIONS.inc()
    return exc

@app.middleware("http")
async def http_middleware(request: Request, call_next):
    start_time = time.time()
    response = await call_next(request)
    latency = time.time() - start_time
    LATENCY.observe(latency)
    response.headers["X-Process-Time"] = str(latency)
    return response