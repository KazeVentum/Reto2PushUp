package com.example.reto2PushUp.persistence.insumoPrendas;


import com.example.reto2PushUp.persistence.Insumo;
import com.example.reto2PushUp.persistence.Prenda;
import jakarta.persistence.*;

@Entity
@Table(name = "insumo_prendas")
public class InsumoPrendas {

    @EmbeddedId
    private InsumoPrendasId id;

    @ManyToOne
    @MapsId("idInsumoFk")
    @JoinColumn(name = "id_insumo_fk")
    private Insumo insumo;

    @ManyToOne
    @MapsId("idPrendaFk")
    @JoinColumn(name = "id_prenda_fk")
    private Prenda prenda;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    public InsumoPrendasId getId() {
        return id;
    }

    public void setId(InsumoPrendasId id) {
        this.id = id;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    public void setPrenda(Prenda prenda) {
        this.prenda = prenda;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
