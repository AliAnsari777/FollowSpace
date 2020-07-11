package com.followspace.spaceshipinfo.Controller;

import com.followspace.spaceshipinfo.Midelware.Jwiki;
import com.followspace.spaceshipinfo.Models.AllInformation;
import com.followspace.spaceshipinfo.Models.Crew;

import com.followspace.spaceshipinfo.Models.Location;
import com.followspace.spaceshipinfo.Models.People;
import com.followspace.spaceshipinfo.Repository.SpaceshipRepository;
import com.followspace.spaceshipinfo.Services.RequestInfo;
import com.followspace.spaceshipinfo.Services.impl.SpaceshipImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/followspace")
public class SpaceshipController {

    private RequestInfo requestInfo;
    private Crew crew;
    private List<Crew> crews = new ArrayList<>();
    private People people;
    private Location location;
    private AllInformation allInformation;
    private SpaceshipImplementation spaceshipImplementation;

    @Autowired
    public SpaceshipController(RequestInfo requestInfo, Crew crew, Location location, List<Crew> crews,
                               AllInformation allInformation, SpaceshipImplementation spaceshipImplementation) {
        this.requestInfo = requestInfo;
        this.crew = crew;
        this.location = location;
//        this.crews = crews;
        this.allInformation = allInformation;
        this.spaceshipImplementation = spaceshipImplementation;
    }


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

    @GetMapping("/{ID}/people")
    public List<Crew> getPeople(@PathVariable("ID") String ID){
        people = requestInfo.getPeople(ID);
        int crewSize = people.getPeople().size();
        Map<String, String> person;

        for (int i = 0; i < crewSize; i++) {
            Crew creww = new Crew();
            person = people.getPeople().get(i);
            String name = person.get("name");
            creww.setName(name);
            creww.setMember(person.get("craft"));

            Jwiki jwiki = new Jwiki(name);
            creww.setAbout(jwiki.getExtractText());
            creww.setProfilePic(jwiki.getImageURL());

            crews.add(creww);
        }
        return crews;
    }

    @PostMapping(path = "/{ID}/crew/post")
    public Crew postCrew(@RequestBody Crew crew){
        return spaceshipImplementation.postCrew(crew);
    }

}
