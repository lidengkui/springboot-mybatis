package com.har;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.har.dao")
@EntityScan(basePackages = "com.har.entity")
public class HarApplication {

    public static void main(String[] args) {
        SpringApplication.run(HarApplication.class, args);
    }
}
