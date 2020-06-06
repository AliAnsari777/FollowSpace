package com.followspace.spaceshipinfo.Services.impl;

import com.followspace.spaceshipinfo.Models.Spaceship;
import com.followspace.spaceshipinfo.Services.RequestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RequestInfoImpl implements RequestInfo {


    @Autowired
    private RestTemplate restTemplate;


    @Override
    public Spaceship getInfo() {
         Spaceship spaceship = restTemplate.getForObject("http://api.open-notify.org/iss-now.json", Spaceship.class);
        return spaceship;
    }
}
