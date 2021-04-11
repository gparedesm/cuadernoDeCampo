package com.project.cuadernoDeCampo.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="sulfato")
public class Sulfato {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_sulfato")
    private int id_sulfato;

    @ManyToOne()
    @JoinColumn(name="id_parcela", referencedColumnName = "id_parcela")
    private Parcela parcela;

    @Column(name="nombre_sulfato")
    private String nombre_sulfato;

    @Column(name="litros")
    private float litros;

    @Column(name="date")
    private Date date;


    public Sulfato() {
    }

    public Sulfato(int id_sulfato, Parcela parcela, String nombre_sulfato, float litros, Date date) {
        this.id_sulfato = id_sulfato;
        this.parcela = parcela;
        this.nombre_sulfato = nombre_sulfato;
        this.litros = litros;
        this.date = date;
    }

    public int getId_sulfato() {
        return this.id_sulfato;
    }

    public void setId_sulfato(int id_sulfato) {
        this.id_sulfato = id_sulfato;
    }

    public Parcela getParcela() {
        return this.parcela;
    }

    public void setParcela(Parcela parcela) {
        this.parcela = parcela;
    }

    public String getNombre_sulfato() {
        return this.nombre_sulfato;
    }

    public void setNombre_sulfato(String nombre_sulfato) {
        this.nombre_sulfato = nombre_sulfato;
    }

    public float getLitros() {
        return this.litros;
    }

    public void setLitros(float litros) {
        this.litros = litros;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "{" +
                " id_sulfato='" + getId_sulfato() + "'" +
                ", id_parcela='" + parcela.getId_parcela() + "'" +
                ", nombre_sulfato='" + getNombre_sulfato() + "'" +
                ", litros='" + getLitros() + "'" +
                ", Fecha='" + getDate() + "'" +
                "}";
    }



}