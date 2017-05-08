/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myexercises.aspect.example.service;

import com.myexercises.aspect.example.dto.PaymentRequest;
import com.myexercises.aspect.example.dto.PaymentResponse;

/**
 *
 * @author Acer
 */
public interface PaymentService {
    PaymentResponse doPayment(PaymentRequest paymentRequest);
}
