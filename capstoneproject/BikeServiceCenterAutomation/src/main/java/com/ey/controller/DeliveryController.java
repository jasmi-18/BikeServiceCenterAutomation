package com.ey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ey.dto.request.DeliveryRequest;
import com.ey.dto.response.CommonResponse;
import com.ey.dto.response.DeliveryResponse;
import com.ey.entity.Delivery;
import com.ey.service.DeliveryService;

@RestController
@RequestMapping("/api/service/delivery")
public class DeliveryController {
   @Autowired
   private DeliveryService service;
   @PostMapping("/home")
   public CommonResponse homeDelivery(@RequestBody DeliveryRequest request) {
       service.homeDelivery(request);
       return new CommonResponse("Home delivery selected");
   }
   @GetMapping("/{serviceRequestId}")
   public DeliveryResponse details(@PathVariable Long serviceRequestId) {
       return service.getDetails(serviceRequestId);
   }
   @PutMapping("/update-status")
   public CommonResponse updateStatus(
           @RequestParam Long serviceRequestId,
           @RequestParam String status) {
       service.updateStatus(serviceRequestId, status);
       return new CommonResponse("Delivery status updated");
   }
   @GetMapping("/pending")
   public List<Delivery> pending() {
       return service.pending();
   }
}