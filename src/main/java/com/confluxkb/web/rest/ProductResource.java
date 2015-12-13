package com.confluxkb.web.rest;

import com.confluxkb.web.RequestMappings;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(RequestMappings.PRODUCT)
public class ProductResource {

    @RequestMapping("/version")
    public String version() {
        return "0.0.1-SNAPSHOT";
    }
}
