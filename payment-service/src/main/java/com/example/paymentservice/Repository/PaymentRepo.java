package com.example.paymentservice.Repository;

import com.example.paymentservice.Payment.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo  extends MongoRepository<Payment,String> {
}
