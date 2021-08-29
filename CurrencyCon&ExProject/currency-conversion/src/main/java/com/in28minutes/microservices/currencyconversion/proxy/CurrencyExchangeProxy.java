package com.in28minutes.microservices.currencyconversion.proxy;

import com.in28minutes.microservices.currencyconversion.bean.CurrencyConversion;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange",url = "localhost:8000")
public interface CurrencyExchangeProxy {
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversion getExchangeValueProxy(@PathVariable String from,
                                               @PathVariable String to);
}
