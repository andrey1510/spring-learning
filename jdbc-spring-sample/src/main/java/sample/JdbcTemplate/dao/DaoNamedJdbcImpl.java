package sample.JdbcTemplate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
import sample.JdbcTemplate.model.Singer;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Component("JdbcNamed")
@Qualifier
public class DaoNamedJdbcImpl implements Dao {

    /////////////////////// NamedParameterJdbcTemplate////////////////////
    // It wraps the JbdcTemplate and substitutes the named parameters to JDBC ? placeholder and delegates to the wrapped JDCTemplate to run the queries.

    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final String SELECT_FIRST_NAME_BY_ID = "SELECT FIRST_NAME FROM musicdb.SINGER WHERE ID = :id";
    private final String COUNT_BY_FIRST_NAME = "SELECT COUNT(*) FROM musicdb.SINGER WHERE FIRST_NAME = :first_name";

    // Constructor:
    @Autowired
    public DaoNamedJdbcImpl (DataSource dataSource) {
        System.out.println("--> Constructor of DaoNamedJdbcImpl called"); // for test purposes
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public String findFirstNameById(Long id) {
        System.out.println("--> Method of DaoNamedJdbcImpl called"); // for test purposes
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", id);
        return namedParameterJdbcTemplate.queryForObject(SELECT_FIRST_NAME_BY_ID, namedParameters, String.class);
    }

    @Override
    public Long countSingersWithName(String first_name) {
        System.out.println("--> Method of DaoNamedJdbcImpl called"); // for test purposes
        SqlParameterSource namedParameters3 = new MapSqlParameterSource().addValue("first_name", first_name);
        return Optional.ofNullable(namedParameterJdbcTemplate.queryForObject(COUNT_BY_FIRST_NAME, namedParameters3, Long.class)).orElse(0L);
    }


    /////////////////////////////////////////


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
