package models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Poll {

    @Id
    private String id;
    private String question;
}