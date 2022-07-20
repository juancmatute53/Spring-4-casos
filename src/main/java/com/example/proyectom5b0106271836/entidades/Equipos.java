package com.example.proyectom5b0106271836.entidades;

import javax.persistence.*;

@Entity
public class Equipos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 60)
    private String Equipo;


    @Column(nullable = false, length = 60)
    private String Imei;

    @Column(nullable = false)
    private int Chip;

    @Column(nullable = false, length = 60)
    private String Serie;

    @Column(nullable = false)
    private int Costo;

    @Column(nullable = false, length = 60)
    private String Observacion;

    public Equipos() {
    }

    public Equipos(Long id, String equipo, String imei, int chip, String serie, int costo, String observacion) {
        this.id = id;
        Equipo = equipo;
        Imei = imei;
        Chip = chip;
        Serie = serie;
        Costo = costo;
        Observacion = observacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEquipo() {
        return Equipo;
    }

    public void setEquipo(String equipo) {
        Equipo = equipo;
    }

    public String getImei() {
        return Imei;
    }

    public void setImei(String imei) {
        Imei = imei;
    }

    public int getChip() {
        return Chip;
    }

    public void setChip(int chip) {
        Chip = chip;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int costo) {
        Costo = costo;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String observacion) {
        Observacion = observacion;
    }
}
