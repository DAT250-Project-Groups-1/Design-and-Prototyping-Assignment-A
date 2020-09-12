package models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table(name="votes")
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean value;

    @ManyToOne
    @ToString.Exclude
    private User user;

    @ManyToOne
    @ToString.Exclude
    private Poll poll;
}
