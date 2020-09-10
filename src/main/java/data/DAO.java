package data;

import java.util.List;
import java.util.Optional;

public interface DAO<T> {

    List<T> read();

    Optional<T> read(int id);

    void create(T t, int id);

    void update(T t, int id);

    void delete(int id);
}
