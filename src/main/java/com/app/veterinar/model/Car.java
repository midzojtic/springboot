package com.app.veterinar.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private @NonNull String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}