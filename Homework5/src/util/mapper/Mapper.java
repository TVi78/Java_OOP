package Homework5.src.util.mapper;

import Homework5.src.model.User;

public interface Mapper {
    String toInput(User e);
    User toOutput(String str);
}
