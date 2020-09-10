package models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="vote_data")
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean value;

    @ManyToOne
    private User user;

    @ManyToOne
    private Poll poll;
}
