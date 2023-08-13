package com.vf.dev.msuniversidadrestryserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
@Component
public class MsuniversidadRestryServerApplication {


    public static void main(String[] args) {

        SpringApplication.run(MsuniversidadRestryServerApplication.class, args);
    }


}
