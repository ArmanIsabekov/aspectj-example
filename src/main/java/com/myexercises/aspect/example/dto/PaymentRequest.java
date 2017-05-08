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
public class PaymentRequest {
    private String ref;
    private String accFrom;
    private String accTo;
    private Double amount;

    public PaymentRequest() {
    }

    public PaymentRequest(String ref, String accFrom, String accTo, Double amount) {
        this.ref = ref;
        this.accFrom = accFrom;
        this.accTo = accTo;
        this.amount = amount;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getAccFrom() {
        return accFrom;
    }

    public void setAccFrom(String accFrom) {
        this.accFrom = accFrom;
    }

    public String getAccTo() {
        return accTo;
    }

    public void setAccTo(String accTo) {
        this.accTo = accTo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.ref);
        hash = 59 * hash + Objects.hashCode(this.accFrom);
        hash = 59 * hash + Objects.hashCode(this.accTo);
        hash = 59 * hash + Objects.hashCode(this.amount);
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
        final PaymentRequest other = (PaymentRequest) obj;
        if (!Objects.equals(this.ref, other.ref)) {
            return false;
        }
        if (!Objects.equals(this.accFrom, other.accFrom)) {
            return false;
        }
        if (!Objects.equals(this.accTo, other.accTo)) {
            return false;
        }
        if (!Objects.equals(this.amount, other.amount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" + "ref=" + ref + ", accFrom=" + accFrom + ", accTo=" + accTo + ", amount=" + amount + '}';
    }
}
