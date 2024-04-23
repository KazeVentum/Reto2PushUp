package com.example.reto2PushUp.persistence;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "color")
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @OneToMany(mappedBy = "color", cascade = CascadeType.ALL)
    private List<DetalleOrden> detalleOrdenes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<DetalleOrden> getDetalleOrdenes() {
        return detalleOrdenes;
    }

    public void setDetalleOrdenes(List<DetalleOrden> detalleOrdenes) {
        this.detalleOrdenes = detalleOrdenes;
    }

    @Override
    public String toString() {
        return "Color{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", detalleOrdenes=" + detalleOrdenes +
                '}';
    }
}
