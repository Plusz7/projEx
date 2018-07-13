package com.rafaello.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.math.BigDecimal;
import javax.persistence.Id;


@Entity
public class Rafaello {

    @Id
    @GeneratedValue
    Long Id;

    String name;

    String lastName;

    BigDecimal amount;



    public Rafaello() {
    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
