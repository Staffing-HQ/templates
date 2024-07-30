package ${{  values.groupId }};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ${{ values.domainName }}ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(${{ values.domainName }}ServiceApplication.class, args);
	}

}
