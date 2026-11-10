package org.example.model.business;

import java.io.Serializable;

public class Survey implements Serializable {
    private User user;
    private String dateOfBirth;
    private String hearAboutUs;
    private String wantsUpdates;
    private String wantsEmail;
    private String contactVia;

    public Survey() {}

    public Survey(User user, String dateOfBirth, String hearAboutUs, String wantsUpdates, String wantsEmail, String contactVia) {
        this.user = user;
        this.dateOfBirth = dateOfBirth;
        this.hearAboutUs = hearAboutUs;
        this.wantsUpdates = wantsUpdates;
        this.wantsEmail = wantsEmail;
        this.contactVia = contactVia;
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getHearAboutUs() { return hearAboutUs; }
    public void setHearAboutUs(String hearAboutUs) { this.hearAboutUs = hearAboutUs; }

    public String getWantsUpdates() { return wantsUpdates; }
    public void setWantsUpdates(String wantsUpdates) { this.wantsUpdates = wantsUpdates; }

    public String getWantsEmail() { return wantsEmail; }
    public void setWantsEmail(String wantsEmail) { this.wantsEmail = wantsEmail; }

    public String getContactVia() { return contactVia; }
    public void setContactVia(String contactVia) { this.contactVia = contactVia; }
}