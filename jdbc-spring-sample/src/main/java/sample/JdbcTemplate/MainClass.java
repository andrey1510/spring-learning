package sample.JdbcTemplate;


import sample.JdbcTemplate.configs.ConfigFile;
import sample.JdbcTemplate.dao.Dao;
import sample.JdbcTemplate.model.Singer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Scanner;

public class MainClass {

    static String option = null;
    static String firstName = null;
    static String lastName = null;
    static Long id = 0L;

    static void launchOptionsMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n   Options to test JDBCtemplate:  " +
                "1 - get singer by ID |  2 - get all singers |  3 - add singer |  4 - update singer \n" +
                "5 - delete singer by ID |  6 - count singers | 7 - get first name of singer |  8 - get singers by first name \n" +
                "   Options to test NamedJDBC: " +
                "11 - get first name of singer  |  12 - count singers by first name \n" +
                "q to quit");
        option = scanner.next();
    }

    static void scanFirstName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print first name");
        firstName = scanner.next();
    }

    static void scanLastName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print last name");
        lastName = scanner.next();
    }

    static void scanId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print ID");
        id = Long.valueOf(scanner.next());
    }

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFile.class);
        Dao daoJ = context.getBean("JdbcTempl", Dao.class);
        Dao daoN = context.getBean("JdbcNamed", Dao.class);
        Dao daoS = context.getBean("JdbcSimple", Dao.class);

        label:
        while (true) {

            launchOptionsMenu();

            switch (option) {

                ////// JDBCtemplate is used (DaoJdbcTemplateImpl) ////////////
                case "1":
                    scanId();
                    Singer s1 = daoJ.findSingerById(id);
                    System.out.println(s1);
                    break;
                case "2":
                    System.out.println("Get all singers:");
                    for (Singer s2 : daoJ.getAllSingers()) {
                        System.out.println(s2);
                    }
                    break;
                case "3":
                    scanId();
                    scanFirstName();
                    scanLastName();
                    Singer s3 = new Singer(id, firstName, lastName);
                    System.out.println("Add singer " + s3);
                    daoJ.addSinger(s3);
                    break;
                case "4":
                    scanId();
                    Singer s4 = daoJ.findSingerById(id);
                    System.out.println("Change last and first names of singer: " + s4);
                    scanFirstName();
                    scanLastName();
                    s4.setFirstName(firstName);
                    s4.setLastName(lastName);
                    daoJ.updateSinger(s4);
                    break;
                case "5":
                    scanId();
                    Singer s5 = daoJ.findSingerById(id);
                    System.out.println("Delete singer: " + s5);
                    daoJ.deleteSinger(s5);
                    break;
                case "6":
                    System.out.println("Count singers:");
                    System.out.println(daoJ.countSingers());
                    break;
                case "7":
                    scanId();
                    System.out.println("Get first name of singer:");
                    System.out.println(daoJ.findFirstNameById(id));
                    break;
                case "8":
                    scanFirstName();
                    System.out.println("Get singers by first name:");
                    System.out.println(daoJ.getSingerByFirstName(firstName));
                    break;

                // NamedJDBC was used (DaoNamedJdbcImpl):
                case "11":
                    scanId();
                    System.out.println("Get first name of singer:");
                    System.out.println(daoN.findFirstNameById(id));
                    break;
                case "12":
                    scanFirstName();
                    System.out.println("Count singers by first name:");
                    System.out.println(daoN.countSingersWithName(firstName));
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
