package ${{  values.groupId }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ${{ values.appName }}Application {

	public static void main(String[] args) {
		SpringApplication.run(${{ values.appName }}Application.class, args);
	}

}
