package com.monirulmask.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by monir on 3/26/2019.
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.monirulmask"})
@EntityScan(basePackages = {"com.monirulmask"})
@ComponentScan(basePackages = {"com.monirulmask"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
