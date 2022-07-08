package com.example.pesel1;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Pesel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String pesel;

    public Pesel(String pesel) {
        this.pesel = pesel;
    }
}
