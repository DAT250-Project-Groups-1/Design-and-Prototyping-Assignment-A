package models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String mail;
    private boolean isAdmin;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Poll> polls;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    private List<Vote> votes;
}
