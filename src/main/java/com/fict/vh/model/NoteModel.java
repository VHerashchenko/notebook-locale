package com.fict.vh.model;

import lombok.Setter;

@Setter
public class NoteModel {
    private String firstName;
    private String login;
    private String email;
    private String phoneNumber;

    public String getModelNotes(){
        return "Noted: " + firstName + " " + login
                + " " + email + " " + phoneNumber;
    }
}