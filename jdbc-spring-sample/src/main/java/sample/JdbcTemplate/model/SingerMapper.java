package sample.JdbcTemplate.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SingerMapper implements RowMapper<Singer> {

    public Singer mapRow(ResultSet resultSet, int i) throws SQLException {

        Singer singer = new Singer();
        singer.setId(resultSet.getLong("id"));
        singer.setFirstName(resultSet.getString("first_name"));
        singer.setLastName(resultSet.getString("last_name"));
        return singer;
    }
}
