package com.mkm.proyect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MkmProyectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MkmProyectApplication.class, args);
	}

}
