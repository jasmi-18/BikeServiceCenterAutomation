package com.ey.mapper;

import com.ey.dto.request.BookServiceRequest;
import com.ey.dto.response.ServiceResponse;
import com.ey.entity.ServiceRequest;

public class ServiceRequestMapper {
	   public static ServiceRequest toEntity(BookServiceRequest request) {
	       ServiceRequest sr = new ServiceRequest();
	       sr.setBikeId(request.getBikeId());
	       sr.setPickupAddress(request.getPickupAddress());
	       sr.setStatus("PICKUP_REQUESTED");
	       sr.setOtp(1234);
	       return sr;
	   }
	   public static ServiceResponse toResponse(ServiceRequest sr) {
	       return new ServiceResponse(
	               sr.getServiceRequestId(),
	               sr.getStatus()
	       );
	   }
	}