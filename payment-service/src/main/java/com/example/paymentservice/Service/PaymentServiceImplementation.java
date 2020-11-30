package com.example.paymentservice.Service;

import com.example.paymentservice.Payment.Payment;
import com.example.paymentservice.Repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImplementation implements PaymentService {
    private PaymentRepo paymentRepo;

    @Autowired
    public PaymentServiceImplementation(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    @Override
    public Payment pay(Payment payment) {
        return paymentRepo.save(payment);
    }

}
