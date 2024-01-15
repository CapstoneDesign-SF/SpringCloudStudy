package com.microservices.currencyconversionservice;

import com.microservices.currencyconversionservice.entity.CurrencyConversionBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(name="currency-exchange", url="localhost:8000")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean retrieveExchangeValue(
            @PathVariable String from,
            @PathVariable String to);
}
