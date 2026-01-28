package com.vscg.demoredis;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Employee implements Serializable {

    private static final long serialVersionUID = 7772410846719226595L;


    @Id
    @GeneratedValue
    private int id;

    private String name;

    public Employee(String name) {
        this.name = name;
    }
}