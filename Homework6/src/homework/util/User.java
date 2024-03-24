package Homework6.src.homework.util;

import Homework6.src.homework.impl.General;

public class User implements General {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
