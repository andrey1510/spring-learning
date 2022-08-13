package sample.JdbcTemplate.configs;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

//    @Autowired
//    Environment environment;


//    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
//    private final String URL = "jdbc:mysql://localhost:3306/musicdb?serverTimezone=Europe/Moscow&useSSL=false";
//    private final String USERNAME = "prospring5";
//    private final String PASSWORD = "prospring5";

    @Value("${jdbc.driverClassName}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource1 = new BasicDataSource();         // нужна зависимость tomcat-dbcp
        // MysqlDataSource basicDataSource = new MysqlDataSource();
        // DriverManagerDataSource dataSource = new DriverManagerDataSource();  // другой вариант, однако DriverManagerDataSource рекомендуется только для тестов
        dataSource1.setDriverClassName(driver);
        dataSource1.setUrl(url);
        dataSource1.setUsername(username);
        dataSource1.setPassword(password);
        return dataSource1;
    }



}
