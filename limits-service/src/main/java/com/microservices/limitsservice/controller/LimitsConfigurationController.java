package com.microservices.limitsservice.controller;

import com.microservices.limitsservice.Configuration;
import com.microservices.limitsservice.bean.Limits;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LimitsConfigurationController {

    final Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimitsFromConfigurations(){
        return new Limits(configuration.getMaximum(), configuration.getMinimum());
    }
}
