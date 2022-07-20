package com.example.proyectom5b0106271836.entidades;

import javax.persistence.*;

@Entity
public class Casa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    private String Propietario;

    @Column(nullable = false, length = 60)
    private String Codigo;

    @Column(nullable = false)
    private int Area;

    @Column(nullable = false)
    private int TotalP;

    @Column(nullable = false, length = 60)
    private String Tipo;

    public Casa() {
    }

    public Casa(Long id, String propietario, String codigo, int area, int totalP, String tipo) {
        this.id = id;
        Propietario = propietario;
        Codigo = codigo;
        Area = area;
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

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public int getArea() {
        return Area;
    }

    public void setArea(int area) {
        Area = area;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }
}
