package com.goi.aadharService.service;

import com.goi.aadharService.dto.UserRequest;
import com.goi.aadharService.dto.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface AadharService {
    public boolean validateUser(String aadharNumber) throws Exception;
}
