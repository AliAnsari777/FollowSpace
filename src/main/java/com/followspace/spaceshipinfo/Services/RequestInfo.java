package com.followspace.spaceshipinfo.Services;

import com.followspace.spaceshipinfo.Models.Crew;
import com.followspace.spaceshipinfo.Models.Location;
import com.followspace.spaceshipinfo.Models.People;
import org.springframework.stereotype.Service;

@Service
public interface RequestInfo {
    Location getLocation(String ID);

    Crew getCrew(String ID);

    People getPeople(String ID);
}
