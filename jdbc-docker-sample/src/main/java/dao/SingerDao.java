package dao;

import entities.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Component
public class SingerDao implements DaoInt<Singer> {

    @Autowired
    private DataSource dataSource;
    //private JdbcTemplate jdbcTemplate;
    private SimpleJdbcInsert jdbcInsert;

    @PostConstruct
    private void postConstruct() {
        //jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcInsert = new SimpleJdbcInsert(dataSource)
                .withTableName("SINGER").usingGeneratedKeyColumns("ID");
    }

    @Override
    public void insert(Singer singer) {
        SqlParameterSource parameters = new BeanPropertySqlParameterSource(singer);
        jdbcInsert.execute(parameters);
    }

    @Override
    public void find(Singer singer) {

    }

    @Override
    public void delete(Long singerId) {

    }
}
