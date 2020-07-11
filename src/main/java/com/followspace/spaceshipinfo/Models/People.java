package com.followspace.spaceshipinfo.Models;

import com.sun.istack.NotNull;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.Map;

public class People {

//    @Id
//    @NotNull
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
    private String message;
    private int number;
    private List<Map<String, String>> people;

    public People() {
    }

    public People(String message, int number, List<Map<String, String>> people) {
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
