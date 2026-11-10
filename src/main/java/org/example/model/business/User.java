package org.example.model.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String hearFrom;
    private String wantsAnnouncements;
    private String contactVia;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dateOfBirth = "";
        hearFrom = "";
        wantsAnnouncements = "";
        contactVia = "";
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = "";
        this.hearFrom = "";
        this.wantsAnnouncements = "";
        this.contactVia = "";
    }

    public User(String firstName, String lastName, String email, String dateOfBirth,
                String hearFrom, String wantsAnnouncements, String contactVia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.hearFrom = hearFrom;
        this.wantsAnnouncements = wantsAnnouncements;
        this.contactVia = contactVia;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHearFrom() {
        return hearFrom;
    }

    public void setHearFrom(String hearFrom) {
        this.hearFrom = hearFrom;
    }

    public String getWantsAnnouncements() {
        return wantsAnnouncements;
    }

    public void setWantsAnnouncements(String wantsAnnouncements) {
        this.wantsAnnouncements = wantsAnnouncements;
    }

    public String getContactVia() {
        return contactVia;
    }

    public void setContactVia(String contactVia) {
        this.contactVia = contactVia;
    }
}