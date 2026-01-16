package com.ey.mapper;

import com.ey.dto.request.RegisterRequest;
import com.ey.dto.response.ProfileResponse;
import com.ey.entity.User;

public class UserMapper {
	   public static User toEntity(RegisterRequest request) {
	       User user = new User();
	       user.setName(request.getName());
	       user.setEmail(request.getEmail());
	       user.setPassword(request.getPassword());
	       user.setRole(request.getRole());
	       return user;
	   }
	   public static ProfileResponse toProfileResponse(User user) {
	       return new ProfileResponse(
	               user.getUserId(),
	               user.getName(),
	               user.getEmail(),
	               user.getRole()
	       );
	   }
	}
