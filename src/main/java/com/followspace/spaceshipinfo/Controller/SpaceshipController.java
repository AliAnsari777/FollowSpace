package com.followspace.spaceshipinfo.Controller;

import com.followspace.spaceshipinfo.Models.AllInformation;
import com.followspace.spaceshipinfo.Models.Crew;

import com.followspace.spaceshipinfo.Models.Location;
import com.followspace.spaceshipinfo.Services.RequestInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/followspace")
public class SpaceshipController {

    @Autowired
    private RequestInfo requestInfo;

    @Autowired
    private Crew crew;

    @Autowired
    private Location location;

    @Autowired
    private AllInformation allInformation;

    @GetMapping("/{ID}")
    public AllInformation getAllInformation(@PathVariable("ID") String ID){
        location = requestInfo.getLocation(ID);
        crew = requestInfo.getCrew(ID);
        allInformation.setCrew(crew);
        allInformation.setLocation(location);
        return allInformation;
    }

    @GetMapping("/{ID}/location")
    public Location getLocation(@PathVariable("ID") String ID){
        return requestInfo.getLocation(ID);
    }

    @GetMapping("/{ID}/crew")
    public Crew getCrew(@PathVariable("ID") String ID){
        return requestInfo.getCrew(ID);
    }

}
