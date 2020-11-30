package com.example.paymentservice.Controller;

import com.example.paymentservice.Payment.Payment;
import com.example.paymentservice.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping(value = "/payment")
    public Payment pay(@RequestBody Payment payment){
        return paymentService.pay(payment);
    }

}
