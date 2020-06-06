package com.followspace.spaceshipinfo.Controller;

import com.followspace.spaceshipinfo.Models.Crew;

import com.followspace.spaceshipinfo.Models.Spaceship;
import com.followspace.spaceshipinfo.Services.RequestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/followspace")
public class SpaceshipInfo {

    @Autowired
    private Crew crew;

    @Autowired
    private RequestInfo requestInfo;

    @GetMapping("/spaceship")
    public Spaceship getInfo(){
        return requestInfo.getInfo();
    }

    @RequestMapping("/vali")
    public String test(){
        System.out.println("this is test");
        return "this is for test";
    }
}
