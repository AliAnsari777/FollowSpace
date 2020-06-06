package com.followspace.spaceshipinfo.Models;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Spaceship {

    private String message;
    private String description;
    private Date timestamp;
    private Map<String, Double> iss_position = new HashMap<String, Double>();

    public Spaceship() {
    }

    public Spaceship(String message, String description, Date timestamp, Map<String, Double> iss_position) {
        this.message = message;
        this.description = description;
        this.timestamp = timestamp;
        this.iss_position = iss_position;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, Double> getIss_position() {
        return iss_position;
    }

    public void setIss_position(Map<String, Double> iss_position) {
        this.iss_position = iss_position;
    }
}
