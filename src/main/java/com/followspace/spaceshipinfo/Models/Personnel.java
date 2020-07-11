package com.followspace.spaceshipinfo.Models;

import java.util.List;
import java.util.Map;

public class Personnel {

//    @Id
//    @NotNull
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
    private String message;
    private int number;
    private List<Map<String, String>> people;

    public Personnel() {
    }

    public Personnel(String message, int number, List<Map<String, String>> people) {
        this.message = message;
        this.number = number;
        this.people = people;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
