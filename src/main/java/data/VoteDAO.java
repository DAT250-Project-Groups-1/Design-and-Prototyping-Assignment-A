package data;

import models.Vote;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.Optional;

public class VoteDAO implements DAO<Vote> {

    private EntityManager em;

    public VoteDAO() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
        em = factory.createEntityManager();
    }

    @Override
    public List<Vote> read() {
        return null;
    }

    @Override
    public Optional<Vote> read(int id) {
        return Optional.empty();
    }

    @Override
    public void create(Vote vote, int id) {

    }

    @Override
    public void update(Vote vote, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
