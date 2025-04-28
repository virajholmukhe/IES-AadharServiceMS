package com.goi.aadharService.controller;

import com.goi.aadharService.service.AadharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class AadharServiceController {

    @Autowired
    AadharService aadharService;

    @GetMapping(value = "/validateUser/{aadharNumber}")
    public ResponseEntity<Boolean> validateUser(@PathVariable String aadharNumber) throws Exception {
        return new ResponseEntity<>(aadharService.validateUser(aadharNumber), HttpStatus.OK);
    }
}
