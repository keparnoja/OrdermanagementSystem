package com.example.ordermanagementsystem.models;

import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Product {
    @Id
    private Long skuCode;

    private float unitPrice;


}
