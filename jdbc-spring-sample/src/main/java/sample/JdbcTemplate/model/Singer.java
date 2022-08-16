package sample.JdbcTemplate.model;

import org.springframework.context.annotation.Bean;


public class Singer {

    public Singer() {}

    public Singer(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private Long id;
    private String firstName;
    private String lastName;
    //private int numberOfRows;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // public int getNumberOfRows() {
     //   return numberOfRows;
   // }

   // public void setNumberOfRows(int numberOfRows) {
    //    this.numberOfRows = numberOfRows;
   // }

    @Override
    public String toString() {
        return String.format("Singer [id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }


}
