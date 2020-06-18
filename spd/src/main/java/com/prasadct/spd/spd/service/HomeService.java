package com.prasadct.spd.spd.service;

import com.prasadct.spd.spd.model.Home;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Controller
public class HomeService {
    public Home createHome(){
        Home home = new Home("Home Name", "Home Address");
        return home;
    }
}
