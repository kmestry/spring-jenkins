package com.practise.springjenkins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class SpringJenkinsDemoProjectApplication {


    public static void main(String[] args) {

        SpringApplication.run(SpringJenkinsDemoProjectApplication.class, args);
		log.info("Application started successfully!");
    }

    @PostConstruct
    public void init() {
        log.info("Application is starting.. Inside Init method");
    }

}
