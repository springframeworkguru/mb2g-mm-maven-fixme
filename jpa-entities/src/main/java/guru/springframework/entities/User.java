package guru.springframework.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Created by jt on 2018-12-15.
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class User {

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String email;

}
