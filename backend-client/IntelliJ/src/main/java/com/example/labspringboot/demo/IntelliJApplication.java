package com.example.labspringboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(scanBasePackages = { "com.example.labspringboot.*" })
@ComponentScan({ "com.example.labspringboot.controller","com.example.labspringboot.converter","com.example.labspringboot.repository", "com.example.labspringboot.service" } )
@EntityScan("com.example.labspringboot.model")
@EnableJpaRepositories("com.example.labspringboot.repository")
public class IntelliJApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntelliJApplication.class, args);
    }

}
