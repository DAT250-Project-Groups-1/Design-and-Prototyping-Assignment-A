package models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@Table(name="polls")
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String question;
    private Date fromDate;
    private Date toDate;
    private int countYes;
    private int countNo;
    private String code;
    private boolean isPrivate;

    @ManyToOne
    @ToString.Exclude
    private User user;

    @OneToMany(mappedBy = "poll", fetch = FetchType.EAGER)
    private List<Vote> votes;



}