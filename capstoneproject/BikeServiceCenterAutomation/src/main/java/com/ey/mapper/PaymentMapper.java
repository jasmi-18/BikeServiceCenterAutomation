package com.ey.mapper;

import com.ey.dto.request.PaymentRequest;
import com.ey.entity.Payment;

public class PaymentMapper {
	   public static Payment toEntity(PaymentRequest request) {
	       Payment payment = new Payment();
	       payment.setServiceRequestId(request.getServiceRequestId());
	       payment.setAmount(request.getAmount());
	       payment.setStatus("PAID");
	       return payment;
	   }
	}