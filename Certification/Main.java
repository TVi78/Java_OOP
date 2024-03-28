package Certification;

import java.util.logging.Level;
import java.util.logging.Logger;

import Certification.util.Log;
import Certification.view.ViewResult;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());

    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        ViewResult.run();
    }  
}
