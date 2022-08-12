import dao.DaoInt;
import entities.Singer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component
public class SingerLaunch {

    @Autowired
    DaoInt<Singer> singerDao;

    public void addSinger() {
        Singer singer4 = Singer.create("Aaa", "Bbb", Date.valueOf("01.01.1999"), 4);
        singerDao.insert(singer4);
    }

}
