package com.example;

import com.example.demo.EnvHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableOpenApi
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        String ip = EnvHelper.getIp();
        String port = EnvHelper.getPort(context);
        //swagger
        System.out.println("Swagger： " + "http://" + ip + ":" + port + "/swagger-ui/");
    }
}