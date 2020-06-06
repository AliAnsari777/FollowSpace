package com.followspace.spaceshipinfo.Services;

import com.followspace.spaceshipinfo.Models.Spaceship;
import org.springframework.stereotype.Service;

@Service
public interface RequestInfo {
    public Spaceship getInfo();
}
