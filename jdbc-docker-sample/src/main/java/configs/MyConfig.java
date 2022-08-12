package configs;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:db/jdbc.properties")
@ComponentScan
public class MyConfig {

    private static Logger logger = LoggerFactory.getLogger(MyConfig.class);

    @Value("jdbc:mysql://localhost:3306/musicdb")     // ("${url}")
    private String url;
    @Value("prospring5")          // ("${username}")
    private String username;
    @Value("prospring5")         //("${password}")
    private String password;

    @Bean
    public DataSource dataSource() {
        try {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName(com.mysql.jdbc.Driver.class.getName());
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            return dataSource;
        } catch (Exception e) {
            logger.error("DBCP DataSource bean cannot be created!", e);
            return null;
        }
    }
}
