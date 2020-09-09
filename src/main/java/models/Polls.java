package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.List;

@Entity
@Data
public class Polls {

    @Id
    private String id;
    private String question;
    private Date fromDate;
    private Date toDate;
    private int countYes;
    private int countNo;
    @OneToMany
    private List<Votes> votes;
}