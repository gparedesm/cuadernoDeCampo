package com.project.cuadernoDeCampo.model;

import javax.persistence.Id;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="parcelas")
public class Parcela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_parcela")
    private int id_parcela;

    @Column(name="nombre_parcela")
    private String nombre_parcela;

    @Column(name="codigo_provincia")
    private int cod_provincia;

    @Column(name="termino_municipal")
    private String termino_municipal;

    @Column(name="codigo_agregado")
    private int codigo_agregado;

    @Column(name="zona")
    private int zona;

    @Column(name="numero_poligono")
    private int numero_poligono;

    @Column(name="numero_parcela")
    private int numero_parcela;

    @Column(name="numero_recinto")
    private int numero_recinto;

    @Column(name="superficie")
    private double superficie;

    @Column(name="especie")
    private String especie;

    @Column(name="variedad")
    private String variedad;

    @Column(name="tipo")
    private String tipo;

    @Column(name="ano_registro")
    private int ano_registro;

    public Parcela() {
    }

    public Parcela(int id_parcela, String nombre_parcela, int cod_provincia, String termino_municipal, int codigo_agregado, int zona, int numero_poligono, int numero_parcela, int numero_recinto, double superficie, String especie, String variedad, String tipo) {
        this.id_parcela = id_parcela;
        this.nombre_parcela = nombre_parcela;
        this.cod_provincia = cod_provincia;
        this.termino_municipal = termino_municipal;
        this.codigo_agregado = codigo_agregado;
        this.zona = zona;
        this.numero_poligono = numero_poligono;
        this.numero_parcela = numero_parcela;
        this.numero_recinto = numero_recinto;
        this.superficie = superficie;
        this.especie = especie;
        this.variedad = variedad;
        this.tipo = tipo;
    }

    public int getId_parcela() {
        return id_parcela;
    }

    public void setId_parcela(int id_parcela) {
        this.id_parcela = id_parcela;
    }

    public String getNombre_parcela() {
        return nombre_parcela;
    }

    public void setNombre_parcela(String nombre_parcela) {
        this.nombre_parcela = nombre_parcela;
    }

    public int getCod_provincia() {
        return cod_provincia;
    }

    public void setCod_provincia(int cod_provincia) {
        this.cod_provincia = cod_provincia;
    }

    public String getTermino_municipal() {
        return termino_municipal;
    }

    public void setTermino_municipal(String termino_municipal) {
        this.termino_municipal = termino_municipal;
    }

    public int getCodigo_agregado() {
        return codigo_agregado;
    }

    public void setCodigo_agregado(int codigo_agregado) {
        this.codigo_agregado = codigo_agregado;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public int getNumero_poligono() {
        return numero_poligono;
    }

    public void setNumero_poligono(int numero_poligono) {
        this.numero_poligono = numero_poligono;
    }

    public int getNumero_parcela() {
        return numero_parcela;
    }

    public void setNumero_parcela(int numero_parcela) {
        this.numero_parcela = numero_parcela;
    }

    public int getNumero_recinto() {
        return numero_recinto;
    }

    public void setNumero_recinto(int numero_recinto) {
        this.numero_recinto = numero_recinto;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno_registro() {
        return ano_registro;
    }

    public void setAno_registro(int ano_registro) {
        this.ano_registro = ano_registro;
    }

    @Override
    public String toString() {
        return "{" +
                " id_parcela='" + getId_parcela() + "'" +
                ", nombre_parcela='" + getNombre_parcela() + "'" +
                ", cod_provincia='" + getCod_provincia() + "'" +
                ", term_municipal='" + getTermino_municipal() + "'" +
                ", cod_agregado='" + getCodigo_agregado() + "'" +
                ", zona='" + getZona() + "'" +
                ", numero_poligono='" + getNumero_poligono() + "'" +
                ", numero_parcela='" + getNumero_parcela() + "'" +
                ", numero_recinto='" + getNumero_recinto() + "'" +
                ", superficie='" + getSuperficie() + "'" +
                ", especie='" + getEspecie() + "'" +
                ", variedad='" + getVariedad() + "'" +
                ", tipo='" + getTipo() + "'" +
                ", ano_registro='" + getAno_registro() + "'" +
                "}";
    }
}
