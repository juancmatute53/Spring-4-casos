package com.example.proyectom5b0106271836.entidades;

import javax.persistence.*;

@Entity
public class Pantalones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    private String Marca;

    @Column(nullable = false, length = 60)
    private String Modelo;

    @Column(nullable = false, length = 60)
    private String Fabricante;

    @Column(nullable = false)
    private int Costo;

    @Column(nullable = false)
    private int Cantidad;

    @Column(nullable = false)
    private int TotalP;

    @Column(nullable = false, length = 60)
    private String Origen;

    public Pantalones() {
    }

    public Pantalones(Long id, String marca, String modelo, String fabricante, int costo, int cantidad, int totalP, String origen) {
        this.id = id;
        Marca = marca;
        Modelo = modelo;
        Fabricante = fabricante;
        Costo = costo;
        Cantidad = cantidad;
        TotalP = totalP;
        Origen = origen;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String fabricante) {
        Fabricante = fabricante;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int costo) {
        Costo = costo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }

    public int getTotalP() {
        return TotalP;
    }

    public void setTotalP(int totalP) {
        TotalP = totalP;
    }
}
