package com.followspace.spaceshipinfo.Models;


import java.util.List;
import java.util.Map;

public class Crew {
    private String image;
    private String message;
    private int number;
    private List<Map<String, String>> people;

    public Crew() {
    }

    public Crew(String message, String image, int number, List<Map<String, String>> people) {
        this.message = message;
        this.image = image;
        this.number = number;
        this.people = people;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Map<String, String>> getPeople() {
        return people;
    }

    public void setPeople(List<Map<String, String>> people) {
        this.people = people;
    }
}
