package com.example.proyectom5b0106271836.repositori;

import com.example.proyectom5b0106271836.entidades.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EquiposRepositorio extends JpaRepository<Equipos, Long> {

    @Query("SELECT e FROM Equipos e WHERE e.Serie LIKE %?1%" +
            " OR e.Equipo LIKE %?1%")

    public List<Equipos> findAll(String palabraClave);
}
