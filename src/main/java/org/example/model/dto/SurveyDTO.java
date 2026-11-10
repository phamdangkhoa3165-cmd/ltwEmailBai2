package org.example.model.dto;

import java.io.Serializable;

public class SurveyDTO implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String hearAboutUs;
    private String wantsUpdates;
    private String wantsEmail;
    private String contactVia;

    public SurveyDTO() {}

    public SurveyDTO(String firstName, String lastName, String email, String dateOfBirth,
                     String hearAboutUs, String wantsUpdates, String wantsEmail, String contactVia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.hearAboutUs = hearAboutUs;
        this.wantsUpdates = wantsUpdates;
        this.wantsEmail = wantsEmail;
        this.contactVia = contactVia;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

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