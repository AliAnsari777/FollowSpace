package com.followspace.spaceshipinfo.Models;

import org.springframework.beans.factory.annotation.Autowired;


public class AllInformation {

    @Autowired
    private Location location;

    @Autowired
    private Crew crew;

    public AllInformation() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }
}
