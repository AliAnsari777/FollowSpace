package com.followspace.spaceshipinfo.Models;


public class Crew {
    private String fullName;
    private String bio;
    private String image;

    public Crew() {
    }

    public Crew(String fullName, String bio, String image) {
        this.fullName = fullName;
        this.bio = bio;
        this.image = image;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
