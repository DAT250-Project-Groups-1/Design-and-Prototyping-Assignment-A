package data;

import models.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class UserDAO implements DAO<User> {

    private EntityManager em;

    public UserDAO() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        em = factory.createEntityManager();
    }

    @Override
    public List<User> read() {
        return null;
    }

    @Override
    public Optional<User> read(int id) {
        return Optional.empty();
    }

    @Override
    public void create(User user, int id) {

    }

    @Override
    public void update(User user, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
