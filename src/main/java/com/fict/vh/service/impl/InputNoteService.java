package com.fict.vh.service.impl;

import com.fict.vh.enums.InputMessages;
import com.fict.vh.enums.RegexInput;
import com.fict.vh.model.NoteModel;
import com.fict.vh.service.NoteService;
import com.fict.vh.validator.NoteValidator;
import com.fict.vh.view.View;

import java.util.Scanner;

public class InputNoteService implements NoteService {

    /**
     * This method prints message to terminal, gets the string
     * from it, checks it and puts to the model
     * view.getStringRegexFromLocale(RegexInput.REGEX.NAME)
     * need to convert string to take it from locale
     * message.properties, otherwise string will be taken from
     * enum class for name we have a lot of locales on other
     * languages, so we have different regex
     * @param scanner input scanner that we need to get string from terminal
     * @param view view need to print messages to the terminal
     * @param noteValidator validation rules that check input
     * @param noteModel model that we write in information
     */
    public void enterFirstName(Scanner scanner, View view,
                               NoteValidator noteValidator, NoteModel noteModel){
        view.printInputMessage(InputMessages.FIRST_NAME);
        noteModel.setFirstName(noteValidator.validator(scanner,
                view.getStringRegexFromLocale(RegexInput.REGEX_NAME), view, InputMessages.FIRST_NAME));
    }

    /**
     * This method prints message to terminal, gets the string from it
     * checks it and puts to the model
     * RegexInput.REGEX.NAME.getRegex() regex string will be taken from
     * enum class for login we have one regex so we can keep it in enum class
     * @param scanner input scanner that we need to get string from terminal
     * @param view view need to print messages to the terminal
     * @param noteValidator validation rules that check input
     * @param noteModel model that we write in information
     */
    public void enterLogin(Scanner scanner, View view,
                           NoteValidator noteValidator, NoteModel noteModel){
        view.printInputMessage(InputMessages.LOGIN_DATA);
        noteModel.setLogin(noteValidator.validator(scanner,
                RegexInput.REGEX_LOGIN.getRegex(), view, InputMessages.LOGIN_DATA));
    }

    public void enterEmail(Scanner scanner, View view,
                           NoteValidator noteValidator, NoteModel noteModel){
        view.printInputMessage(InputMessages.EMAIL_INPUT);
        noteModel.setEmail(noteValidator.validator(scanner,
                RegexInput.REGEX_EMAIL.getRegex(), view, InputMessages.EMAIL_INPUT));
    }

    public void enterPhone(Scanner scanner, View view,
                           NoteValidator noteValidator, NoteModel noteModel){
        view.printInputMessage(InputMessages.PHONE_INPUT);
        noteModel.setPhoneNumber(noteValidator.validator(scanner,
                view.getStringRegexFromLocale(RegexInput.REGEX_PHONE), view, InputMessages.PHONE_INPUT));
    }
}
