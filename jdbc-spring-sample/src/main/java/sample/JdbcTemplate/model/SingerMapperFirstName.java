package sample.JdbcTemplate.model;

import org.springframework.jdbc.core.RowMapper;
import sample.JdbcTemplate.model.Singer;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SingerMapperFirstName implements RowMapper<String> {

    public String mapRow(ResultSet resultSet, int i) throws SQLException {
        return resultSet.getString("first_name");
    }
}
