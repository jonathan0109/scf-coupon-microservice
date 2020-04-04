package mx.unnamed.scf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScfCouponMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScfCouponMicroserviceApplication.class, args);
	}

}
