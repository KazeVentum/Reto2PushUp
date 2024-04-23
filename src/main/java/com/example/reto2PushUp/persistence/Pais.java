package com.example.reto2PushUp.persistence;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "pais", cascade = CascadeType.ALL)
    private List<Departamento> departamentos;
}
