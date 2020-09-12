package data;

import models.Poll;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
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
        Query q = em.createNativeQuery("SELECT * WHERE 'id' = " + id + " FROM Poll");
        Poll poll = em.find(Poll.class, id);
        return Optional.empty();
    }

    @Override
    public void create(Poll poll, int id) {
        Query q = em.createNativeQuery("INSERT INTO Poll (");

    }

    @Override
    public void update(Poll poll, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
