/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myexercises.aspect.example;

import com.myexercises.aspect.example.dto.PaymentRequest;
import com.myexercises.aspect.example.dto.PaymentResponse;
import com.myexercises.aspect.example.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Acer
 */
@SpringBootApplication
public class Application {
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
    
    public static void main(String[] args) {
        System.setProperty("logging.level.com.myexercises.aspect.example","DEBUG");
        SpringApplication.run(Application.class, args);
    }
    
    @Bean
    public CommandLineRunner commandLineRunner(PaymentService paymentService) {
        CommandLineRunner runner = new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                PaymentRequest req = new PaymentRequest("20170508272772", "26202727272727", "26202828282828", 50.0);
                PaymentResponse resp = paymentService.doPayment(req);
                LOGGER.info("in commandLineRunner.run {}", resp);
            }
        };
        
        return runner;
    }
}
