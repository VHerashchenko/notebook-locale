package com.fict.vh.view;

import com.fict.vh.enums.InputMessages;
import com.fict.vh.enums.RegexInput;

import java.time.Instant;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    public static final ResourceBundle resourceBundle =
            ResourceBundle.getBundle(
                    InputMessages.BUNDLE_NAME.getValue(),
                    new Locale(Instant.now().getEpochSecond() % 2 == 0 ? "ua" : "en"));


    public void printMessage(String message){
        System.out.println(message);
    }

    public String appendSting(String... message){
        StringBuilder resultSting = new StringBuilder();
        for (String current : message){
            resultSting.append(current);
            resultSting.append(" ");
        }
        return new String(resultSting);
    }

    public void printInputMessage(InputMessages message){
        printMessage(appendSting(
                resourceBundle.getString(InputMessages.INPUT_DATA.getValue()),
                resourceBundle.getString(message.getValue())));
    }

    public void printWrongMessage(InputMessages message){
        printMessage(appendSting(
                resourceBundle.getString(InputMessages.WRONG_DATA.getValue()),
                resourceBundle.getString(InputMessages.INPUT_DATA.getValue()),
                resourceBundle.getString(message.getValue())));
    }

    public String getStringRegexFromLocale(RegexInput input){
        return resourceBundle.getString(input.getRegex());
    }

    public String getLoginInvalidMessage(){
        return resourceBundle.getString(InputMessages.ERROR_LOGIN_MESSAGE.getValue());
    }
}