package main;

import data.DAO;
import data.UserDAO;
import models.User;

public class App {
    public static void main(String [] args) {
        DAO<User> dao = new UserDAO();
    }
}
