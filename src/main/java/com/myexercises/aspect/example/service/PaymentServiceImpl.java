/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myexercises.aspect.example.service;

import com.myexercises.aspect.example.aspects.Loggable;
import com.myexercises.aspect.example.dto.PaymentRequest;
import com.myexercises.aspect.example.dto.PaymentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author Acer
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    private final static Logger LOGGER = LoggerFactory.getLogger(PaymentServiceImpl.class);
    
    
    @Override
    @Loggable("this is payment")
    public PaymentResponse doPayment(PaymentRequest paymentRequest) {
        PaymentResponse resp = new PaymentResponse(paymentRequest.getRef(), "Ok");
        LOGGER.info("in doPayment request is: {}, response is {}", paymentRequest, resp);
        return resp;
    }
    
}
