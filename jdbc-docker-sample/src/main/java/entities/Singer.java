package entities;

import java.sql.Date;

public class Singer {

    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public static Singer create(String firstName, String lastName, Date birthDate, long id) {
        Singer singer = new Singer();
        singer.setFirstName(firstName);
        singer.setLastName(lastName);
        singer.setBirthDate(birthDate);
        singer.setId(id);
        return singer;
    }
}
