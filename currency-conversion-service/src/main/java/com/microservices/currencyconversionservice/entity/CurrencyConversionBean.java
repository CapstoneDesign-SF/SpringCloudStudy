package com.microservices.currencyconversionservice.entity;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class CurrencyConversionBean {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private BigDecimal quantity;
    private BigDecimal totalCalculatedAmout;
    private int port;

    public CurrencyConversionBean(){super();}

    public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity, BigDecimal totalCalculatedAmout, int port) {
        super();
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        this.quantity = quantity;
        this.totalCalculatedAmout = totalCalculatedAmout;
        this.port = port;
    }
}
