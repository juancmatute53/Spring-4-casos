package com.example.proyectom5b0106271836.entidades;

import javax.persistence.*;

@Entity
public class Zapatos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    private String Marca;

    @Column(nullable = false, length = 60)
    private String Codigo;

    @Column(nullable = false)
    private int Costo;

    @Column(nullable = false)
    private int Cantidad;

    @Column(nullable = false)
    private int TotalP;

    @Column(nullable = false, length = 60)
    private String Tipo;

    public Zapatos() {
    }

    public Zapatos(Long id, String marca, String codigo, int costo, int cantidad, int totalP, String tipo) {
        this.id = id;
        Marca = marca;
        Codigo = codigo;
        Costo = costo;
        Cantidad = cantidad;
        TotalP = totalP;
        Tipo = tipo;
    }

    public int getTotalP() {
        return TotalP;
    }

    public void setTotalP(int totalP) {
        TotalP = totalP;
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

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
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

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
