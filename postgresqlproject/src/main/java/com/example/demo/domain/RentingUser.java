package com.example.demo.domain;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "RentingUser")
public class RentingUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idRentingUser")
    private Long idRentingUser;
    @Column(name = "casual")
    private int casual;
    @Column(name = "registered")
    private int registered;
    @Column(name = "cnt")
    private int cnt;

    public RentingUser(int casual, int registered, int cnt) {
        this.casual = casual;
        this.registered = registered;
        this.cnt = cnt;
    }
}
