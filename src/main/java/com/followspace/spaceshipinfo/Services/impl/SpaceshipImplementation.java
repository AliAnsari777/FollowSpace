package com.followspace.spaceshipinfo.Services.impl;

import com.followspace.spaceshipinfo.Models.Crew;
import com.followspace.spaceshipinfo.Models.Location;
import com.followspace.spaceshipinfo.Services.RequestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpaceshipImplementation implements RequestInfo {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private Location location;

    @Autowired
    private Crew crew;

    @Value("${url.location}")
    private String locationURL;

    @Value("${url.crew}")
    private String crewURL;

    @Override
    public Location getLocation(String ID) {
         location = restTemplate.getForObject(locationURL, Location.class);
        return location;
    }

    @Override
    public Crew getCrew(String ID){
        crew = restTemplate.getForObject(crewURL, Crew.class);
        return crew;
    }
}
