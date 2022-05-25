package com.b127.dev;

import com.fasterxml.jackson.annotation.JsonValue;

public enum City {
    KYIV("Kyiv"),
    KHARKIV("Kharkiv"),
    LVIV("Lviv"),
    DNIPRO("Dnipro"),
    ODESA("Odesa");
    final private String value;
    City(String name) {
        value = name;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
