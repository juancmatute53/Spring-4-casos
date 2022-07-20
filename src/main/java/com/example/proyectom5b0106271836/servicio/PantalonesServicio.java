package com.example.proyectom5b0106271836.servicio;


import com.example.proyectom5b0106271836.entidades.Pantalones;
import com.example.proyectom5b0106271836.entidades.Zapatos;
import com.example.proyectom5b0106271836.repositori.PantalonesRepositorio;
import com.example.proyectom5b0106271836.repositori.ZapatosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PantalonesServicio {

    @Autowired
    private PantalonesRepositorio pantalonesRepositorio;

    public List<Pantalones> listAll(String palabraClave) {
        if (palabraClave != null) {
            return pantalonesRepositorio.findAll(palabraClave);
        }
        return pantalonesRepositorio.findAll();
    }

    public void save(Pantalones pantalones) {
        pantalonesRepositorio.save(pantalones);
    }

    public Pantalones get(Long id) {
        return pantalonesRepositorio.findById(id).get();
    }

    public void delete(Long id) {
        pantalonesRepositorio.deleteById(id);
    }

}
