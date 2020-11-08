package com.burakkutbay.springbootheroku.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

/**
 * Created by Burak KUTBAY  on 8.11.2020.
 */
@RestController
public class ApplicationController {

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentTime() {

        return "Merhaba Dünya : https://blog.burakkutbay.com : \n"+ Instant.now().toString();
    }
}
