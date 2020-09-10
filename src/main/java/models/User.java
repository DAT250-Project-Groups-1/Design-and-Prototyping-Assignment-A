package models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="user_data")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String mail;
    private boolean admin;

    @OneToMany(mappedBy = "user")
    private List<Poll> polls;

    @OneToMany(mappedBy = "user")
    private List<Vote> votes;

}
