package com.example.proyectom5b0106271836.servicio;


import com.example.proyectom5b0106271836.entidades.Equipos;
import com.example.proyectom5b0106271836.entidades.Zapatos;
import com.example.proyectom5b0106271836.repositori.EquiposRepositorio;
import com.example.proyectom5b0106271836.repositori.ZapatosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquiposServicio {

    @Autowired
    private EquiposRepositorio equiposRepositorio;

    public List<Equipos> listAll(String palabraClave) {
        if (palabraClave != null) {
            return equiposRepositorio.findAll(palabraClave);
        }
        return equiposRepositorio.findAll();
    }

    public void save(Equipos equipos) {
        equiposRepositorio.save(equipos);
    }

    public Equipos get(Long id) {
        return equiposRepositorio.findById(id).get();
    }

    public void delete(Long id) {
        equiposRepositorio.deleteById(id);
    }

}
