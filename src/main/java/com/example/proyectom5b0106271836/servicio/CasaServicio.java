package com.example.proyectom5b0106271836.servicio;


import com.example.proyectom5b0106271836.entidades.Casa;
import com.example.proyectom5b0106271836.repositori.CasaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasaServicio {

    @Autowired
    private CasaRepositorio casaRepositorio;

    public List<Casa> listAll(String palabraClave) {
        if (palabraClave != null) {
            return casaRepositorio.findAll(palabraClave);
        }
        return casaRepositorio.findAll();
    }


    public void save(Casa casa) {
        casaRepositorio.save(casa);
    }

    public Casa get(Long id) {
        return casaRepositorio.findById(id).get();
    }

    public void delete(Long id) {
        casaRepositorio.deleteById(id);
    }

}
