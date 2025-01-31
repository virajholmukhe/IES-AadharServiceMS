package com.goi.aadharService.service;

import com.goi.aadharService.dto.UserRequest;
import com.goi.aadharService.dto.UserResponse;
import com.goi.aadharService.exception.AadharServiceException;
import com.goi.aadharService.exception.ExceptionConstants;
import org.springframework.stereotype.Service;

@Service
public class AadharServiceImpl implements AadharService {

    @Override
    public boolean validateUser(String aadharNumber) throws Exception {
        String state = getState(aadharNumber);
        return state.contains("Maharashtra");
    }

    public String getState(String aadharNumber) {
        return switch (aadharNumber.charAt(0)) {
            case '1' -> "Andhra Pradesh";
            case '2' -> "Telangana";
            case '3' -> "Maharashtra";
            case '4' -> "Bihar";
            case '5' -> "Karnataka";
            case '6' -> "Gujarat";
            default -> "";
        };
    }
}
