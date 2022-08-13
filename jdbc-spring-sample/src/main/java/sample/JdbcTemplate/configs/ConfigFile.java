package sample.JdbcTemplate.configs;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@PropertySource("classpath:database.properties")
@ComponentScan("sample.JdbcTemplate")
public class ConfigFile {

    @Autowired
    Environment environment;

    private final String DRIVER = "driverClassName";
    private final String URL = "url";
    private final String USERNAME = "username";
    private final String PASSWORD = "password";

    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();         // нужна зависимость tomcat-dbcp
        // MysqlDataSource basicDataSource = new MysqlDataSource();
        //DriverManagerDataSource dataSource = new DriverManagerDataSource();  // другой вариант, однако DriverManagerDataSource рекомендуется только для тестов

//        dataSource.setDriverClassName(environment.getProperty(DRIVER));
//        dataSource.setUrl(environment.getProperty(URL));
//        dataSource.setUsername(environment.getProperty(USERNAME));
//        dataSource.setPassword(environment.getProperty(PASSWORD));


        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/musicdb?serverTimezone=Europe/Moscow&useSSL=false");
        dataSource.setUsername("prospring5");
        dataSource.setPassword("prospring5");
        return dataSource;
    }



}
