package com.fict.vh.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InputMessages {
    BUNDLE_NAME ("messages"),
    INPUT_DATA ("input.string.data"),
    FIRST_NAME ("input.first.name"),
    LOGIN_DATA ("input.login"),
    WRONG_DATA ("input.wrong.data"),
    EMAIL_INPUT ("input.email"),
    PHONE_INPUT ("input.phone");

    private final String value;
}