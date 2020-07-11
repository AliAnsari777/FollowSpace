package com.followspace.spaceshipinfo.Controller;

import com.followspace.spaceshipinfo.Midelware.Jwiki;
import com.followspace.spaceshipinfo.Models.AllInformation;
import com.followspace.spaceshipinfo.Models.Crew;

import com.followspace.spaceshipinfo.Models.Location;
import com.followspace.spaceshipinfo.Models.Personnel;
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
    private List<Crew> listOfCrewInformation = new ArrayList<>();
    private Location location;
    private AllInformation allInformation;
    private SpaceshipImplementation spaceshipImplementation;

    @Autowired
    public SpaceshipController(RequestInfo requestInfo, Crew crew, Location location,
                               AllInformation allInformation, SpaceshipImplementation spaceshipImplementation) {
        this.requestInfo = requestInfo;
        this.crew = crew;
        this.location = location;
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

    @GetMapping("/{ID}/personnel")
    public List<Crew> getPersonnel(@PathVariable("ID") String ID){
        Personnel personnel = requestInfo.getPersonnel(ID);
        int crewSize = personnel.getPeople().size();
        Map<String, String> person;

        for (int i = 0; i < crewSize; i++) {
            Crew onePerson = new Crew();
            person = personnel.getPeople().get(i);
            onePerson.setName(person.get("name"));
            onePerson.setMember(person.get("craft"));
            onePerson.setNumber(personnel.getNumber());

            Jwiki jwiki = new Jwiki(person.get("name"));
            onePerson.setAbout(jwiki.getExtractText());
            onePerson.setProfilePic(jwiki.getImageURL());

            listOfCrewInformation.add(onePerson);
        }
        return listOfCrewInformation;
    }

    @PostMapping(path = "/{ID}/crew/post")
    public Crew postCrew(@RequestBody Crew crew){
        return spaceshipImplementation.postCrew(crew);
    }

}
