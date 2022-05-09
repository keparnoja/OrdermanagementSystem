package com.example.ordermanagementsystem.exeptions;

public class IdNotFoundException extends  Exception{
    public IdNotFoundException(Long id) {
        super ("(id=" + id + ") not found!");
    }
}
