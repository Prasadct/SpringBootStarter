package com.prasadct.spd.spd.controller;

import com.prasadct.spd.spd.model.Home;
import com.prasadct.spd.spd.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @RequestMapping("/")
    public Home homeController(){
        return homeService.createHome();
    }
}
