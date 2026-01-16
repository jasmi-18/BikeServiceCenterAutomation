package com.ey.mapper;

import com.ey.dto.request.DeliveryRequest;
import com.ey.entity.Delivery;

public class DeliveryMapper {
	   public static Delivery toHomeDeliveryEntity(DeliveryRequest request) {
	       Delivery delivery = new Delivery();
	       delivery.setServiceRequestId(request.getServiceRequestId());
	       delivery.setDeliveryAddress(request.getDeliveryAddress());
	       delivery.setDeliveryType("HOME_DELIVERY");
	       delivery.setStatus("OUT_FOR_DELIVERY");
	       return delivery;
	   }
	}