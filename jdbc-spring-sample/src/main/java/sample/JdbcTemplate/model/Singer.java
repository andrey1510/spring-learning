package sample.JdbcTemplate.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.context.annotation.Bean;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Singer {

/*    // replaced with @NoArgsConstructor
    public Singer() {}*/

/*    // replaced with @AllArgsConstructor
    public Singer(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }*/

    // replaced with @FieldDefaults
    /*private*/ Long id;
    /*private*/ String firstName;
    /*private*/ String lastName;

/*    // Replaced with @Data
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

    @Override
    public String toString() {
        return String.format("Singer [id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
    }
*/

}
