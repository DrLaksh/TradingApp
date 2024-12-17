package com.TradingApp.TradingProject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeContoller {

@GetMapping
    public String home()
    {
        return "First API Test ";
    }
}
