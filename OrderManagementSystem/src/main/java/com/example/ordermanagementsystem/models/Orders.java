package com.example.ordermanagementsystem.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class Orders {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.MERGE)
    private OrderLine orderLine;
    @OneToOne(cascade = CascadeType.MERGE)
    private Customer customer;
    private Date date;



}
