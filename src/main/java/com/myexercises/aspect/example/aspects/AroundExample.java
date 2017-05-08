/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myexercises.aspect.example.aspects;

import com.myexercises.aspect.example.dto.PaymentRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Acer
 */
@Aspect
@Component
public class AroundExample {
    private final static Logger LOGGER = LoggerFactory.getLogger(AroundExample.class);
    
    @Around(value = "execution(com.myexercises.aspect.example.dto.PaymentResponse com.myexercises.aspect.example.service.PaymentService.doPayment(com.myexercises.aspect.example.dto.PaymentRequest))")
    public Object doAroundPayment(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        if (args.length == 1 && args[0].getClass().equals(PaymentRequest.class)) {
            PaymentRequest request = (PaymentRequest) args[0];
            LOGGER.info("in doAroundPayment before proceed request is {}", request);
        } else {
            LOGGER.info("in doAroundPayment before proceed args are {}", args);        
        }
        Object ret = joinPoint.proceed();
        LOGGER.info("in doAroundPayment after proceed");
        return ret;
    }
}
