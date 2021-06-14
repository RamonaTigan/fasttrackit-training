package ro.fasttrackit.course3;

import java.util.Date;

public class Professor {
    private String lastName; // text value
    private String firstName; // text value
    private Date dateOfBirth;
    private Date dateOfHiring;
    private String emailAddress;
    private Boolean isPhd;

    public Professor(String lastName, String firstName, Date dateOfBirth, Date dateOfHiring, String emailAddress, Boolean isPhd) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.emailAddress = emailAddress;
        this.isPhd = isPhd;
    }

    public Professor() {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(Date dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getPhd() {
        return isPhd;
    }

    public void setPhd(Boolean phd) {
        isPhd = phd;
    }
}

