package com.ey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ey.dto.request.PaymentRequest;
import com.ey.dto.response.PaymentResponse;
import com.ey.entity.Payment;
import com.ey.mapper.PaymentMapper;
import com.ey.repository.PaymentRepository;

@Service
public class PaymentService {
   @Autowired
   private PaymentRepository repository;
   public PaymentResponse pay(PaymentRequest request) {
       Payment payment = PaymentMapper.toEntity(request);
       repository.save(payment);
       return new PaymentResponse("SUCCESS");
   }
   public List<Payment> history() {
       return repository.findAll();
   }
   public void refund(Long paymentId) {
       Payment payment = repository.findById(paymentId)
               .orElseThrow(() -> new RuntimeException("Payment not found"));
       payment.setStatus("REFUNDED");
       repository.save(payment);
   }
}