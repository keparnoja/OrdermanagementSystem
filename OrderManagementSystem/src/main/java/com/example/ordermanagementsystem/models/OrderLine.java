package com.example.ordermanagementsystem.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Data
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne (cascade =  CascadeType.MERGE)
    private Product product;

    private int quantity;
}
