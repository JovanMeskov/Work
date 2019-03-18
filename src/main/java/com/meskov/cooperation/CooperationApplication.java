package com.meskov.cooperation;

import api.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = Users.class)
public class CooperationApplication {

    public static void main(String[] args) {
        SpringApplication.run(CooperationApplication.class, args);
    }

}
