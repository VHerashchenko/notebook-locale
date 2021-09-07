package com.fict.vh.controller;

import com.fict.vh.model.NoteModel;
import com.fict.vh.model.exception.LoginException;
import com.fict.vh.service.NoteService;
import com.fict.vh.service.impl.InputNoteService;
import com.fict.vh.validator.NoteValidator;
import com.fict.vh.view.View;
import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public class AppController {
    private final View view;
    private final NoteModel noteModel;
    private final NoteValidator noteValidator = new NoteValidator();
    private final NoteService noteService = new InputNoteService();

    public void processUser(){
        Scanner scanner = new Scanner(System.in);

        addSomeUsersToRepo();

        noteService.enterFirstName(scanner, view, noteValidator, noteModel);
        noteService.enterLogin(scanner, view, noteValidator, noteModel);

        noteService.enterEmail(scanner, view, noteValidator, noteModel);
        noteService.enterPhone(scanner, view, noteValidator, noteModel);

        loginCatch(scanner);

        noteService.getAllNoteModel().stream()
                .map(NoteModel::getModelNotes)
                .forEach(view::printMessage);
    }

    private void loginCatch(Scanner scanner){
        try{
            noteService.addNoteModel(noteModel);
        } catch (LoginException loginException){
            view.printMessage(loginException.getMessage());
            noteService.enterLogin(scanner, view, noteValidator, noteModel);
            loginCatch(scanner);
        }
    }

    private void addSomeUsersToRepo(){
        noteService.addNoteModel(new NoteModel("John", "login1", "John@gmail.com", "+380679555499"));
        noteService.addNoteModel(new NoteModel("Nike", "login2", "Nike@gmail.com", "+380678989499"));
        noteService.addNoteModel(new NoteModel("Semen", "login3", "Semen@gmail.com", "+380464646499"));
        noteService.addNoteModel(new NoteModel("Ann", "login4", "Ann@gmail.com", "+380050402299"));
    }
}