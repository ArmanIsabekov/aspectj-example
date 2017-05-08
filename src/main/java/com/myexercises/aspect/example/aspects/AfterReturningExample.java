/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myexercises.aspect.example.aspects;

import com.myexercises.aspect.example.dto.PaymentRequest;
import com.myexercises.aspect.example.dto.PaymentResponse;
import org.aspectj.lang.annotation.AfterReturning;
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
public class AfterReturningExample {
    private final static Logger LOGGER = LoggerFactory.getLogger(AfterReturningExample.class);
    @AfterReturning(value = "execution(* com.myexercises.aspect.example.service.PaymentService.doPayment(com.myexercises.aspect.example.dto.PaymentRequest)) && args(paymentRequest)",
            returning = "resp")//,argNames = "paymentRequest, resp"
            //argNames are not necessary
    public void doAfterPayment(PaymentRequest paymentRequest, PaymentResponse resp) {
        LOGGER.info("in doAfterPayment request: {} resp: {}", paymentRequest, resp);
    }
}
