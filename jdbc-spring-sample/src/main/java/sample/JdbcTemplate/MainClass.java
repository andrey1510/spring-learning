package sample.JdbcTemplate;


import sample.JdbcTemplate.configs.ConfigFile;
import sample.JdbcTemplate.dao.DaoJdbcTemplate;
import sample.JdbcTemplate.dao.DaoNamedJdbc;
import sample.JdbcTemplate.model.Singer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;

public class MainClass {

    static String option = null;

    static void launchOptionsMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n   Options to test JDBCtemplate:\n" +
                "1 to get singer #1  |  2 to get all singers  |  3 to add singer  |  4 to update singer #1  |  " +
                "5 to delete singer  |  6 to count singers  | 7 Get first name of singer #1\n" +
                "   Options to test NamedJDBC:\n" +
                "11 to get first name of singer #1  |  12 to count singers with first name 'John' \n" +
                "q to quit");
        option = scanner.next();
    }

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
        DaoJdbcTemplate daoJ = context.getBean(DaoJdbcTemplate.class);
        DaoNamedJdbc daoN = context.getBean(DaoNamedJdbc.class);

        label:
        while (true) {

            launchOptionsMenu();

            switch (option) {

                ////// JDBCtemplate is used (DaoJdbcTemplateImpl) ////////////
                case "1":
                    System.out.println("Get singer with ID 1:");
                    Singer s1 = daoJ.findSingerById(1L);
                    System.out.println(s1);
                    break;
                case "2":
                    System.out.println("Get all singers:");
                    for (Singer s2 : daoJ.getAllSingers()) {
                        System.out.println(s2);
                    }
                    break;
                case "3":
                    Singer s3 = new Singer(6L, "Jolly", "Butcher");
                    System.out.println("Add singer " + s3);
                    daoJ.addSinger(s3);
                    break;
                case "4":
                    Singer s4 = daoJ.findSingerById(1L);
                    System.out.println("Change last and first names of singer: " + s4);
                    s4.setFirstName("Hieronimus");
                    s4.setLastName("Hippopotamus");
                    daoJ.updateSinger(s4);
                    break;
                case "5":
                    Singer s5 = daoJ.findSingerById(6L);
                    System.out.println("Delete singer: " + s5);
                    daoJ.deleteSinger(s5);
                    break;
                case "6":
                    System.out.println("Get quantity of singers:");
                    System.out.println(daoJ.countSingers());
                    break;
                case "7":
                    System.out.println("Get first name of singer #1:");
                    System.out.println(daoJ.findFirstNameById(1L));
                    break;

                // NamedJDBC was used (DaoNamedJdbcImpl):
                case "11":
                    System.out.println("Get first name of singer #1:");
                    System.out.println(daoN.findFirstNameById());
                    break;
                case "12":
                    System.out.println("Count singers with first name 'John':");
                    System.out.println(daoN.countSingersWithName());
                    break;

                // Quit:
                case "q":
                    break label;
            }
        }





//        ((ConfigurableApplicationContext) context).close();
        //context.close();


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
