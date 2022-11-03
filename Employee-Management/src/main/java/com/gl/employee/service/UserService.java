package com.gl.employee.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.gl.employee.dto.UserRegistrationDto;
import com.gl.employee.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}