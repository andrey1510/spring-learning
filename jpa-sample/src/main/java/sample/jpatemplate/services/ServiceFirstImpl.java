package sample.jpatemplate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import sample.jpatemplate.dao.Dao;
import sample.jpatemplate.model.Singer;

@Service
public class ServiceFirstImpl implements ServiceInt {

    @Autowired
    private Dao dao;

    @Transactional
    @Override
    public Long addSinger(Singer singer) {
        return dao.addSinger(singer);
    }
}
