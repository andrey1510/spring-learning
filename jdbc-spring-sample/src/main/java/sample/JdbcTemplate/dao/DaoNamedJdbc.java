package sample.JdbcTemplate.dao;

import sample.JdbcTemplate.model.Singer;

import java.util.List;

public interface DaoNamedJdbc {

    String findFirstNameById();

    Long countSingersWithName();

}
