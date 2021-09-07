package com.fict.vh.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class NoteModel {
    private String firstName;
    private String login;
    private String email;
    private String phoneNumber;

    public NoteModel(NoteModel noteModel){
        this.firstName = noteModel.getFirstName();
        this.login = noteModel.getLogin();
        this.email = noteModel.getEmail();
        this.phoneNumber = noteModel.getPhoneNumber();
    }

    public String getModelNotes(){
        return "Noted: " + firstName + " " + login
                + " " + email + " " + phoneNumber;
    }
}