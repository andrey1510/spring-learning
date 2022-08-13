package sample.JdbcTemplate.dao;

import sample.JdbcTemplate.model.Singer;

import java.util.List;

public interface DaoInterface {

    Singer findSingerById(Long id);

    boolean addSinger(Singer singer);

    boolean deleteSinger(Singer singer);

    boolean updateSinger(Singer singer);

    List<Singer> getAllSingers();

    //int countRows();




}
