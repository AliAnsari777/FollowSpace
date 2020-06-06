package com.followspace.spaceshipinfo;

import com.followspace.spaceshipinfo.Models.AllInformation;
import com.followspace.spaceshipinfo.Models.Crew;
import com.followspace.spaceshipinfo.Models.Location;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpaceshipinfoApplication {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public Location getLocation(){
        return new Location();
    }

    @Bean
    public Crew getCrew(){
        return new Crew();
    }

    @Bean
    public AllInformation getAllInformation(){
        return new AllInformation();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpaceshipinfoApplication.class, args);
    }

}
