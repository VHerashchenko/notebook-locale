package com.fict.vh.validator;

import com.fict.vh.enums.InputMessages;
import com.fict.vh.view.View;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NoteValidator {

    public String validator(Scanner scanner, String regex,
                            View view, InputMessages currentMessage){
        String inputString = scanner.nextLine();
        while(!Pattern.matches(regex, inputString)){
            view.printWrongMessage(currentMessage);
            inputString = scanner.nextLine();
        }
        return inputString;
    }
}
