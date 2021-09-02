package com.fict.vh.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RegexInput {
    REGEX_NAME("input.name.data.regexp"),
    REGEX_LOGIN("[A-Za-z0-9_-]{4,20}"),
    REGEX_EMAIL("([A-Za-z0-9_-]+\\.)*[A-Za-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}"),
    REGEX_PHONE("input.phone.data.regexp");

    private final String regex;
}
