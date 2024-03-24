package Homework6.src.homework;

import Homework6.src.homework.util.Persister;
import Homework6.src.homework.util.Reporter;
import Homework6.src.homework.util.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Reporter report = new Reporter();
        Persister save = new Persister();
        report.report(user);
        save.save(user);
    }
}
