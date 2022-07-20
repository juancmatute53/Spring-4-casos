package com.example.proyectom5b0106271836.repositori;


import com.example.proyectom5b0106271836.entidades.Pantalones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PantalonesRepositorio extends JpaRepository<Pantalones, Long> {

    @Query("SELECT p FROM Pantalones p WHERE p.Modelo LIKE %?1%" +
            " OR p.Origen LIKE %?1%")

    public List<Pantalones> findAll(String palabraClave);
}
