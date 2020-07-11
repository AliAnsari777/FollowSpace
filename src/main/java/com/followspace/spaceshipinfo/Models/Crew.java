package com.followspace.spaceshipinfo.Models;


import com.sun.istack.NotNull;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Entity
public class Crew {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer Id;

    private String image;
    private String message;
    private int number;
    private String expedition;


    private String name;
    private LocalDate date;
    private String about;
    private String member;
    private String profilePic;



    public Crew() {
    }

    public Crew(String image, String message, int number, List<Map<String, String>> people,
                String expedition, LocalDate date, String about, String member, String profilePic) {
        this.image = image;
        this.message = message;
        this.number = number;
//        this.people = people;
        this.expedition = expedition;
        this.date = date;
        this.about = about;
        this.member = member;
        this.profilePic = profilePic;
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
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

//    public List<Map<String, String>> getPeople() {
//        return people;
//    }
//
//    public void setPeople(List<Map<String, String>> people) {
//        this.people = people;
//    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getMember() {
        return member;
    }

    public void setMember(String member) {
        this.member = member;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
