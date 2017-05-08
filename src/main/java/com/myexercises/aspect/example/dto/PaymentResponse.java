/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myexercises.aspect.example.dto;

import java.util.Objects;

/**
 *
 * @author Acer
 */
public class PaymentResponse {
    private String ref;
    private String status;

    public PaymentResponse() {
    }

    public PaymentResponse(String ref, String status) {
        this.ref = ref;
        this.status = status;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.ref);
        hash = 97 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaymentResponse other = (PaymentResponse) obj;
        if (!Objects.equals(this.ref, other.ref)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaymentResponse{" + "ref=" + ref + ", status=" + status + '}';
    }
}
