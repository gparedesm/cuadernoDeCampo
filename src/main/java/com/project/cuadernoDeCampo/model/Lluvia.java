package com.project.cuadernoDeCampo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="lluvia")
public class Lluvia {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_lluvia")
    private int id_lluvia;

    @Column(name="nombre")
    private String nombre;

    @Column(name="litros")
    private float litros;

    @Column(name="fecha")
    private Date fecha;


    public Lluvia() {
    }

    public Lluvia(int id_lluvia, String nombre, float litros) {
        this.id_lluvia = id_lluvia;
        this.nombre = nombre;
        this.litros = litros;
    }

    public int getId_lluvia() {
        return this.id_lluvia;
    }

    public void setId_lluvia(int id_lluvia) {
        this.id_lluvia = id_lluvia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getLitros() {
        return this.litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "{" +
                " id_lluvia='" + getId_lluvia() + "'" +
                ", name='" + getNombre() + "'" +
                ", litros='" + getLitros() + "'" +
                "}";
    }
}
