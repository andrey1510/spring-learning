package sample.JdbcTemplate.dao;

import sample.JdbcTemplate.model.Singer;
import java.util.List;

public interface Dao {

    Long countSingersWithName(String first_name);

    String findFirstNameById(Long id);

    Singer findSingerById(Long id);

    void addSinger(Singer singer);

    void deleteSinger(Singer singer);

    void updateSinger(Singer singer);

    List<Singer> getAllSingers();

    int countSingers();

    List<Singer> getSingerByFirstName(String firstName);


}
