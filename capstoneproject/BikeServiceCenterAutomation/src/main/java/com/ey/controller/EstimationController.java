package com.ey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ey.dto.request.CreateEstimationRequest;
import com.ey.dto.response.CommonResponse;
import com.ey.dto.response.EstimationResponse;
import com.ey.service.EstimationService;

@RestController
@RequestMapping("/api/estimation")
public class EstimationController {
   @Autowired
   private EstimationService service;
   @PostMapping("/create")
   public CommonResponse create(@RequestBody CreateEstimationRequest request) {
       service.create(request);
       return new CommonResponse("Estimation created");
   }
   @GetMapping("/{serviceRequestId}")
   public EstimationResponse view(@PathVariable Long serviceRequestId) {
       return service.view(serviceRequestId);
   }
   @PostMapping("/approve/{serviceRequestId}")
   public CommonResponse approve(@PathVariable Long serviceRequestId) {
       service.approve(serviceRequestId);
       return new CommonResponse("Estimation approved");
   }
   @PostMapping("/reject/{serviceRequestId}")
   public CommonResponse reject(@PathVariable Long serviceRequestId) {
       service.reject(serviceRequestId);
       return new CommonResponse("Estimation rejected");
   }
}
