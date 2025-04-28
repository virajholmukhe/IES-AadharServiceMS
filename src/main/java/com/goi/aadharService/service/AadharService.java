package com.goi.aadharService.service;

import org.springframework.stereotype.Service;

@Service
public interface AadharService {
    public boolean validateUser(String aadharNumber) throws Exception;
}
