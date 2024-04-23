package com.example.reto2PushUp.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "cod_inv", nullable = false)
    private String codInv;

    @Column(name = "valor_vta_cop", nullable = false)
    private double valorVtaCop;

    @Column(name = "valor_vta_usd", nullable = false)
    private double valorVtaUsd;

    @JoinColumn(name="id_prenda_fk", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    private Prenda prenda;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodInv() {
        return codInv;
    }

    public void setCodInv(String codInv) {
        this.codInv = codInv;
    }

    public double getValorVtaCop() {
        return valorVtaCop;
    }

    public void setValorVtaCop(double valorVtaCop) {
        this.valorVtaCop = valorVtaCop;
    }

    public double getValorVtaUsd() {
        return valorVtaUsd;
    }

    public void setValorVtaUsd(double valorVtaUsd) {
        this.valorVtaUsd = valorVtaUsd;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "id=" + id +
                ", codInv='" + codInv + '\'' +
                ", valorVtaCop=" + valorVtaCop +
                ", valorVtaUsd=" + valorVtaUsd +
                ", prenda=" + prenda +
                '}';
    }
}
