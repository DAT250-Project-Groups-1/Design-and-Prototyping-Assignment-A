package data;

import models.Poll;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class PollDAO implements DAO<Poll> {

    private EntityManager em;

    public PollDAO() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        em = factory.createEntityManager();
    }

    @Override
    public List<Poll> read() {
        return null;
    }

    @Override
    public Optional<Poll> read(int id) {
        return Optional.empty();
    }

    @Override
    public void create(Poll poll, int id) {

    }

    @Override
    public void update(Poll poll, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
