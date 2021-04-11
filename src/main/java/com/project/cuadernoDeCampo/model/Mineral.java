package com.project.cuadernoDeCampo.model;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="mineral")
public class Mineral {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_mineral")
    private int id_mineral;

    @Column(name="nombre")
    private String nombre;

    @Column(name="kilos")
    private float kilos;

    @Column(name="fecha")
    private Date fecha;

    @ManyToOne()
    @JoinColumn(name="id_parcela", referencedColumnName = "id_parcela")
    private Parcela parcela;

    public Mineral() {
    }

    public Mineral(int id_mineral, int id_parcela, String nombre, float kilos, Parcela parcela) {
        this.id_mineral = id_mineral;
        this.nombre = nombre;
        this.kilos = kilos;
        this.parcela = parcela;
    }

    public int getId_mineral() {
        return this.id_mineral;
    }

    public void setId_mineral(int id_mineral) {
        this.id_mineral = id_mineral;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getKilos() {
        return this.kilos;
    }

    public void setKilos(float kilos) {
        this.kilos = kilos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Parcela getParcela() {
        return this.parcela;
    }

    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }

    @Override
    public String toString() {
        return "{" +
                " id_mineral='" + getId_mineral() + "'" +
                ", id_parcela='" + parcela.getId_parcela() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", kilos='" + getKilos() + "'" +
                "}";
    }

}
