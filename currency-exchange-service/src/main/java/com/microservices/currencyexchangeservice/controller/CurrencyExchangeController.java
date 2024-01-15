package com.microservices.currencyexchangeservice.controller;

import com.microservices.currencyexchangeservice.entity.ExchangeValue;
import com.microservices.currencyexchangeservice.repository.ExchangeValueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
public class CurrencyExchangeController {

    private final Environment environment;
    private final ExchangeValueRepository exchangeValueRepository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
        //ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65), 8000);
        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchangeValue;
    }
}
