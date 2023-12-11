package com.tscinc.nextpospdfservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String Index(){
        return "Services are running.....";
    }
}
