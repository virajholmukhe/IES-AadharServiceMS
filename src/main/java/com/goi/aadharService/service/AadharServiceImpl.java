package com.goi.aadharService.service;

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
