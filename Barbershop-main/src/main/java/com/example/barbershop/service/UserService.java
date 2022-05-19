package com.example.barbershop.service;

import com.example.barbershop.model.User;
import com.example.barbershop.web.dto.UserRegistrarionDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrarionDto userRegistrarionDto);
}
