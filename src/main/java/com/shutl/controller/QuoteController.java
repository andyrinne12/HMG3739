package com.shutl.controller;

import com.shutl.model.Quote;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class QuoteController {

    @RequestMapping(value = "/quote", method = POST)
    @CrossOrigin(origins = "*")
    public @ResponseBody
    Quote quote(@RequestBody Quote quote) {
        Long price = Math.round(Math.abs((Long.valueOf(quote.getDeliveryPostcode(), 36) - Long.valueOf(quote.getPickupPostcode(), 36)) / 100000000) * (1 + quote.retrieveMarkup()));

        return new Quote(quote.getPickupPostcode(), quote.getDeliveryPostcode(), quote.getVehicle(), price);
    }
}
