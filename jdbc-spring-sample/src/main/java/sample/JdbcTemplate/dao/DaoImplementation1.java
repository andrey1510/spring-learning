package sample.JdbcTemplate.dao;

import sample.JdbcTemplate.model.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import sample.JdbcTemplate.model.SingerMapper;
import javax.sql.DataSource;
import java.util.List;

@Component
public class DaoImplementation1 implements DaoInterface {

    JdbcTemplate jdbcTemplate;

    private final String SQL_FIND_SINGER = "SELECT * FROM SINGER WHERE id = ?";
    private final String SQL_DELETE_SINGER = "DELETE FROM singer WHERE id = ?";
    private final String SQL_UPDATE_SINGER = "UPDATE singer SET first_name = ?, last_name = ?, age  = ? WHERE id = ?";
    private final String SQL_GET_ALL_SINGERS = "SELECT * from SINGER";
    private final String SQL_INSERT_SINGER = "INSERT INTO singer(id, first_name, last_name) VALUES(?,?,?,?)";

    @Autowired
    public DaoImplementation1(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    //@Autowired
    public Singer findSingerById(Long id) {
        return jdbcTemplate.queryForObject(SQL_FIND_SINGER, new Object[] { id }, new SingerMapper());
    }

    @Override
    public boolean addSinger(Singer singer) {
        return false;
    }

    @Override
    public boolean deleteSinger(Singer singer) {
        return false;
    }

    @Override
    public boolean updateSinger(Singer singer) {
        return false;
    }

    @Override
    public List<Singer> getAllSingers() {
        return null;
    }

    // @Override
    // public int countRows() {
    //     return 0;
    //  }

}
