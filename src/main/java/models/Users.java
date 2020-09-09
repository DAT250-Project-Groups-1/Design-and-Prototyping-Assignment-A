package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Users {

    @Id
    private String id;
    private String name;
    private String mail;
    private boolean admin;
    @OneToMany
    private List<Polls> polls;
    @OneToMany
    private List<Votes> votes;
}
