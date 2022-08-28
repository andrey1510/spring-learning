package sample.JdbcTemplate.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import sample.JdbcTemplate.model.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import sample.JdbcTemplate.model.SingerMapper;
import sample.JdbcTemplate.model.SingerMapperFirstName;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = true, isolation = Isolation.REPEATABLE_READ)
@Component("JdbcTempl")
@Qualifier
public class DaoJdbcTemplateImpl implements Dao {

    //////////////////////////// JdbcTemplate ////////////////////////////
    // JdbcTemplate is basic API to access database. It substitutes the named parameters to JDBC ? placeholder and delegates to the wrapped JDCTemplate to run the queries

    JdbcTemplate jdbcTemplate;

    // Fields with inquires:
    private final String SQL_FIND_SINGER = "SELECT * FROM musicdb.SINGER WHERE id = ?";
    private final String SQL_DELETE_SINGER = "DELETE FROM musicdb.SINGER WHERE id = ?";
    private final String SQL_UPDATE_SINGER = "UPDATE musicdb.SINGER SET FIRST_NAME = ?, LAST_NAME = ? WHERE ID = ?";
    private final String SQL_GET_ALL_SINGERS = "SELECT * from musicdb.SINGER ORDER BY id";
    private final String SQL_INSERT_SINGER = "INSERT INTO musicdb.SINGER (ID, FIRST_NAME, LAST_NAME) VALUES (?,?,?)";
    private final String SQL_COUNT_SINGERS = "SELECT count(*) FROM musicdb.SINGER";
    private final String SELECT_FIRST_NAME_BY_ID = "SELECT FIRST_NAME FROM musicdb.SINGER WHERE ID = ?";
    private final String SQL_GET_SINGERS_BY_FIRST_NAME = "SELECT * from musicdb.SINGER WHERE first_name = ?";

    // Constructor:
    @Autowired
    public DaoJdbcTemplateImpl(DataSource dataSource) {
        System.out.println("--> Constructor of DaoJdbcTemplateImpl called");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public String findFirstNameById(Long id) {
        System.out.println("--> Method of DaoJdbcTemplateImpl called"); // for test purposes
        return jdbcTemplate.queryForObject(SELECT_FIRST_NAME_BY_ID, new Object[] { id }, new SingerMapperFirstName());
    }

    @Override
    public Singer findSingerById(Long id) {
        System.out.println("--> Method of DaoJdbcTemplateImpl called"); // for test purposes
        return jdbcTemplate.queryForObject(SQL_FIND_SINGER, new Object[] { id }, new SingerMapper());
    }

    @Transactional(readOnly = true)
    @Override
    public void addSinger(Singer singer) {
        System.out.println("--> Method of DaoJdbcTemplateImpl called"); // for test purposes
        jdbcTemplate.update(SQL_INSERT_SINGER, singer.getId(), singer.getFirstName(), singer.getLastName());
    }

    @Modifying
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void deleteSinger(Singer singer) {
        System.out.println("--> Method of DaoJdbcTemplateImpl called"); // for test purposes
        jdbcTemplate.update(SQL_DELETE_SINGER, singer.getId());
    }

    @Modifying
    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public void updateSinger(Singer singer) {
        System.out.println("--> Method of DaoJdbcTemplateImpl called"); // for test purposes
        jdbcTemplate.update(SQL_UPDATE_SINGER, singer.getFirstName(), singer.getLastName(), singer.getId());
    }

    @Override
    public List<Singer> getAllSingers() {
        System.out.println("--> Method of DaoJdbcTemplateImpl called"); // for test purposes
        return jdbcTemplate.query(SQL_GET_ALL_SINGERS, new SingerMapper());
    }

    @Override
    public int countSingers() {
        System.out.println("--> Method of DaoJdbcTemplateImpl called"); // for test purposes
        return Optional.ofNullable(jdbcTemplate.queryForObject(SQL_COUNT_SINGERS, Integer.class)).orElse(0);
    }

    @Override
    public List<Singer> getSingerByFirstName(String firstName) {
        System.out.println("--> Method of DaoJdbcTemplateImpl called"); // for test purposes
        return jdbcTemplate.query(SQL_GET_SINGERS_BY_FIRST_NAME, new Object[] { firstName }, new SingerMapper());
    }

    ////////////////////////////////////////////////


    @Override
    public Long countSingersWithName(String first_name) {
        return null;
    }
}
