package com.followspace.spaceshipinfo;

import com.followspace.spaceshipinfo.Models.Crew;
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
    public Crew getCrew(){
        return new Crew();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpaceshipinfoApplication.class, args);
    }

}
