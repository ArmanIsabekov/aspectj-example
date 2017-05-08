/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myexercises.aspect.example.aspects;

import com.myexercises.aspect.example.dto.PaymentRequest;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Acer
 */
@Aspect
@Component
public class BeforeExample {
    private final static Logger LOGGER = LoggerFactory.getLogger(BeforeExample.class);
    
    @Before(value = "execution(com.myexercises.aspect.example.dto.PaymentResponse com.myexercises.aspect.example.service.PaymentService.doPayment(com.myexercises.aspect.example.dto.PaymentRequest)) && args(paymentRequest)"
        ,argNames = "paymentRequest")
    public void preprocessPayment(PaymentRequest paymentRequest) {
        LOGGER.info("in preprocessPayment {}", paymentRequest);
    }
    
    @Before(value = "execution(* com.myexercises.aspect.example.service.PaymentService.doPayment(..)) && @annotation(loggable)")
    public void doAccessCheck(JoinPoint joinPoint, Loggable loggable) {
        LOGGER.info("{} in doAccessCheck {}", loggable.value(), Arrays.asList(joinPoint.getArgs()));
    }
}
