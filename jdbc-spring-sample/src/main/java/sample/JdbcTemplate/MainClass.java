package sample.JdbcTemplate;

import sample.JdbcTemplate.configs.ConfigFile;
import sample.JdbcTemplate.dao.DaoInterface;
import sample.JdbcTemplate.model.Singer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
        DaoInterface daoInterface = context.getBean(DaoInterface.class);
        System.out.println("---> Getting singer with ID 3");
        Singer singer3info =  daoInterface.findSingerById(3L);
        System.out.println(singer3info);

// Тестирование работы соединения:
        /*
        String url = "jdbc:mysql://localhost:3306/musicdb?serverTimezone=Europe/Moscow&useSSL=false";
        String username = "prospring5";
        String password = "prospring5";
        System.out.println("Connection started.");
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("OMG, connected!!!11111");
        } catch (SQLException e) {
            System.out.println("OMG, connection failed!!!11111");
            e.printStackTrace();
        }

        */


    }


}
