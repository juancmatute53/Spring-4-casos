package com.example.proyectom5b0106271836.servicio;


import com.example.proyectom5b0106271836.entidades.Zapatos;
import com.example.proyectom5b0106271836.repositori.ZapatosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZapatosServicio {

    @Autowired
    private ZapatosRepositorio zapatosRepositorio;

    public List<Zapatos> listAll(String palabraClave) {
        if (palabraClave != null) {
            return zapatosRepositorio.findAll(palabraClave);
        }
        return zapatosRepositorio.findAll();
    }

    public void save(Zapatos zapatos) {
        zapatosRepositorio.save(zapatos);
    }

    public Zapatos get(Long id) {
        return zapatosRepositorio.findById(id).get();
    }

    public void delete(Long id) {
        zapatosRepositorio.deleteById(id);
    }

}
