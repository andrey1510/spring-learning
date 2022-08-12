package dao;

import entities.Singer;

public interface DaoInt<Singer> {

    void insert(Singer singer);

    void find(Singer singer);

    void delete(Long singerId);

}
