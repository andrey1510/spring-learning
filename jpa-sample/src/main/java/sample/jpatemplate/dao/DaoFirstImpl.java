package sample.jpatemplate.dao;

import org.springframework.stereotype.Repository;
import sample.jpatemplate.model.Singer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DaoFirstImpl implements Dao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Long addSinger(Singer singer) {
        entityManager.persist(singer);
        return singer.getId();
    }
}
