package com.fict.vh.controller;

import com.fict.vh.model.NoteModel;
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

        noteService.enterFirstName(scanner, view, noteValidator, noteModel);
        noteService.enterLogin(scanner, view, noteValidator, noteModel);

        noteService.enterEmail(scanner, view, noteValidator, noteModel);
        noteService.enterPhone(scanner, view, noteValidator, noteModel);

        view.printMessage(noteModel.getModelNotes());
    }
}
