package com.github.tobiasmiosczka.discordstats.web.dto;

import com.github.tobiasmiosczka.discordstats.web.dto.validation.ValidEmail;
import com.github.tobiasmiosczka.discordstats.web.dto.validation.ValidName;
import com.github.tobiasmiosczka.discordstats.web.dto.validation.ValidUsername;
import com.github.tobiasmiosczka.discordstats.model.platform.Gender;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

public class UserDto {
    @NotNull
    @Size(min = 1)
    @ValidUsername
    private String username;

    @NotNull
    @Size(min = 1)
    private String password;

    private Gender gender;

    @ValidName
    private String firstname;

    @ValidName
    private String lastname;

    @Past
    private Date birthdate;

    @NotNull
    @Size(min = 1)
    @ValidEmail
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}