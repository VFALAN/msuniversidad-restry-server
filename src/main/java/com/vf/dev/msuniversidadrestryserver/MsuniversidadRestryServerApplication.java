package com.vf.dev.msuniversidadrestryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsuniversidadRestryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsuniversidadRestryServerApplication.class, args);
	}

}
