package main;

import data.DAO;
import data.PollDAO;
import data.UserDAO;
import data.VoteDAO;
import models.Poll;
import models.User;
import models.Vote;

import java.util.List;

public class App {
    public static void main(String [] args) {
        DAO<User> userDAO = new UserDAO();
        List<User> users = userDAO.read();
        users.stream().forEach(System.out::println);

        DAO<Poll> pollDAO = new PollDAO();
        List<Poll> polls = pollDAO.read();
        polls.stream().forEach(System.out::println);

        DAO<Vote> voteDAO = new VoteDAO();
        List<Vote> votes = voteDAO.read();
        votes.stream().forEach(System.out::println);
    }
}
