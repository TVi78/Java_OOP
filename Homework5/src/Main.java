package Homework5.src;

import Homework5.src.controller.UserController;
import Homework5.src.model.repository.GBRepository;
import Homework5.src.model.repository.impl.UserRepository;
import Homework5.src.view.UserView;
import static Homework5.src.util.DBConnector.createDB;

public class Main {
    public static void main(String[] args) {
        createDB();
        GBRepository repository = new UserRepository();
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();

    }
}