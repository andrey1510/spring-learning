package sample.JdbcTemplate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;
import sample.JdbcTemplate.model.Singer;

import javax.sql.DataSource;
import java.util.List;

@Component("JdbcSimple")
@Qualifier
public class DaoSimpleJdbcImpl implements Dao {

    SimpleJdbcInsert simpleJdbcInsert;

    @Autowired
    public DaoSimpleJdbcImpl(DataSource dataSource) {
        System.out.println("--> Constructor of DaoNamedJdbcImpl called"); // for test purposes
        simpleJdbcInsert = new SimpleJdbcInsert(dataSource);
    }


    /////////////////////////

    @Override
    public Long countSingersWithName(String first_name) {
        return null;
    }

    @Override
    public String findFirstNameById(Long id) {
        return null;
    }

    @Override
    public Singer findSingerById(Long id) {
        return null;
    }

    @Override
    public void addSinger(Singer singer) {

    }

    @Override
    public void deleteSinger(Singer singer) {

    }

    @Override
    public void updateSinger(Singer singer) {

    }

    @Override
    public List<Singer> getAllSingers() {
        return null;
    }

    @Override
    public int countSingers() {
        return 0;
    }

    @Override
    public List<Singer> getSingerByFirstName(String firstName) {
        return null;
    }
}
