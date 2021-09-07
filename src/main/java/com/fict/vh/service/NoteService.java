package com.fict.vh.service;

import com.fict.vh.model.NoteModel;
import com.fict.vh.model.exception.LoginException;
import com.fict.vh.validator.NoteValidator;
import com.fict.vh.view.View;

import java.util.List;
import java.util.Scanner;

public interface NoteService {
    void enterFirstName(Scanner scanner, View view,
                        NoteValidator noteValidator, NoteModel noteModel);

    void enterLogin(Scanner scanner, View view,
                    NoteValidator noteValidator, NoteModel noteModel);

    void enterEmail(Scanner scanner, View view,
                    NoteValidator noteValidator, NoteModel noteModel);

    void enterPhone(Scanner scanner, View view,
                    NoteValidator noteValidator, NoteModel noteModel);

    void addNoteModel(NoteModel noteModel) throws LoginException;

    List<NoteModel> getAllNoteModel();
}