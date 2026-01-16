package com.ey.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ey.dto.request.AddBikeRequest;
import com.ey.dto.response.BikeResponse;
import com.ey.dto.response.CommonResponse;
import com.ey.service.BikeService;

@RestController
@RequestMapping("/api/bike")
public class BikeController {
   @Autowired
   private BikeService bikeService;
   @PostMapping("/add")
   public CommonResponse addBike(@RequestBody AddBikeRequest request) {
       bikeService.addBike(request);
       return new CommonResponse("Bike added successfully");
   }
   @GetMapping("/my-bikes")
   public List<BikeResponse> myBikes() {
       return bikeService.getMyBikes();
   }
   @GetMapping("/{bikeId}")
   public BikeResponse getBike(@PathVariable Long bikeId) {
       return bikeService.getBikeById(bikeId);
   }
   @PutMapping("/update/{bikeId}")
   public CommonResponse updateBike(
           @PathVariable Long bikeId,
           @RequestBody AddBikeRequest request) {
       bikeService.updateBike(bikeId, request);
       return new CommonResponse("Bike updated successfully");
   }
   @DeleteMapping("/delete/{bikeId}")
   public CommonResponse deleteBike(@PathVariable Long bikeId) {
       bikeService.deleteBike(bikeId);
       return new CommonResponse("Bike deleted successfully");
   }
   @GetMapping("/count")
   public Map<String, Long> count() {
       return Map.of("count", bikeService.countBikes());
   }
}