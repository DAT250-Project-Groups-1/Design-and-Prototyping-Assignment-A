package models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Data
@Table(name="poll_data")
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

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "poll")
    private List<Vote> votes;


}