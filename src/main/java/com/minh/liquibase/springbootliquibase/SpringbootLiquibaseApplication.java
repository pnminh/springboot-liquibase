package com.minh.liquibase.springbootliquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.minh")
public class SpringbootLiquibaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLiquibaseApplication.class, args);
    }

}
