package com.example.reto2PushUp.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "insumo")
public class Insumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "valor_unit", nullable = false)
    private double valorUnit;

    @Column(name = "stock_min", nullable = false)
    private double stockMin;

    @Column(name = "stock_max", nullable = false)
    private double stockMax;


}

