package com.geekster.EcommerceAPI.controller;

import com.geekster.EcommerceAPI.model.Address;
import com.geekster.EcommerceAPI.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
     AddressService addressService;

    //creating address for user
    @PostMapping("/address")
    public String createAddress(@RequestBody Address address){
        return addressService.createAddress(address);
    }

}
