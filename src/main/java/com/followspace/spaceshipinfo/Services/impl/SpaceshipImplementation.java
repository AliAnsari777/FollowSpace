package com.followspace.spaceshipinfo.Services.impl;

import com.followspace.spaceshipinfo.Models.Crew;
import com.followspace.spaceshipinfo.Models.Location;
import com.followspace.spaceshipinfo.Models.Personnel;
import com.followspace.spaceshipinfo.Repository.SpaceshipRepository;
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

    @Autowired
    private Personnel personnel;

    SpaceshipRepository spaceshipRepository;

    @Autowired
    public SpaceshipImplementation(SpaceshipRepository spaceshipRepository){
        this.spaceshipRepository = spaceshipRepository;
    }

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

    @Override
    public Personnel getPersonnel(String ID) {
        personnel = restTemplate.getForObject(crewURL, Personnel.class);
        return personnel;
    }

    public Crew postCrew(Crew crew){
        return spaceshipRepository.save(crew);
    }
}
