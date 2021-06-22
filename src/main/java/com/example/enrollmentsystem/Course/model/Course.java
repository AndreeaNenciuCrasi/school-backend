package com.example.enrollmentsystem.Course.model;

import com.example.enrollmentsystem.User.model.User;
import lombok.Data;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Course implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="trainer_id", referencedColumnName = "id")
    private User trainer;


}
