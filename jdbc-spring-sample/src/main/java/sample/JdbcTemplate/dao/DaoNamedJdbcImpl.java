package sample.JdbcTemplate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
import sample.JdbcTemplate.model.Singer;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Component
public class DaoNamedJdbcImpl implements DaoNamedJdbc {

    /////////////////////// NamedParameterJdbcTemplate////////////////////
    // It wraps the JbdcTemplate and substitutes the named parameters to JDBC ? placeholder and delegates to the wrapped JDCTemplate to run the queries.

    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final String SELECT_FIRST_NAME_BY_ID = "SELECT FIRST_NAME FROM musicdb.SINGER WHERE ID = :id";
    private final String COUNT_BY_FIRST_NAME = "SELECT COUNT(*) FROM musicdb.SINGER WHERE FIRST_NAME = :first_name";

    SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", 1);
    SqlParameterSource namedParameters3 = new MapSqlParameterSource().addValue("first_name", "John");

    // Constructor:
    @Autowired
    public DaoNamedJdbcImpl (DataSource dataSource) {
        System.out.println("--> Constructor of DaoNamedJdbcImpl called"); // for test purposes
        namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public String findFirstNameById() {
        System.out.println("--> Method of DaoNamedJdbcImpl called"); // for test purposes
        return namedParameterJdbcTemplate.queryForObject(SELECT_FIRST_NAME_BY_ID, namedParameters, String.class);
    }

    @Override
    public Long countSingersWithName() {
        System.out.println("--> Method of DaoNamedJdbcImpl called"); // for test purposes
        return Optional.ofNullable(namedParameterJdbcTemplate.queryForObject(COUNT_BY_FIRST_NAME, namedParameters3, Long.class)).orElse(0L);
    }
}
