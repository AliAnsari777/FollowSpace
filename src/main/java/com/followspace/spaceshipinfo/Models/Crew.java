package com.followspace.spaceshipinfo.Models;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Crew {
    private String image;
    private String message;
    private int number;
    private List<Map<String, String>> people;
    private String expedition;
    private LocalDate date;
    private String about;
    private String stationMember;
    private String profilePic;

    public Crew() {
    }

    public Crew(String image, String message, int number, List<Map<String, String>> people,
                String expedition, LocalDate date, String about, String stationMember, String profilePic) {
        this.image = image;
        this.message = message;
        this.number = number;
        this.people = people;
        this.expedition = expedition;
        this.date = date;
        this.about = about;
        this.stationMember = stationMember;
        this.profilePic = profilePic;
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

    public String getExpedition() {
        return expedition;
    }

    public void setExpedition(String expedition) {
        this.expedition = expedition;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getStationMember() {
        return stationMember;
    }

    public void setStationMember(String stationMember) {
        this.stationMember = stationMember;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
