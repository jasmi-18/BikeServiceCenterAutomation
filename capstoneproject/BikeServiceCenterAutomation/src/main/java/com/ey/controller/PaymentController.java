package com.ey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ey.dto.request.PaymentRequest;
import com.ey.dto.response.CommonResponse;
import com.ey.dto.response.PaymentResponse;
import com.ey.entity.Payment;
import com.ey.service.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
   @Autowired
   private PaymentService service;
   @PostMapping("/pay")
   public PaymentResponse pay(@RequestBody PaymentRequest request) {
       return service.pay(request);
   }
   @GetMapping("/history")
   public List<Payment> history() {
       return service.history();
   }
   @PostMapping("/refund/{paymentId}")
   public CommonResponse refund(@PathVariable Long paymentId) {
       service.refund(paymentId);
       return new CommonResponse("Refund initiated");
   }
}