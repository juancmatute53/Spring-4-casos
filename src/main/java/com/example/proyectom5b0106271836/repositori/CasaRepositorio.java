package com.example.proyectom5b0106271836.repositori;

import com.example.proyectom5b0106271836.entidades.Casa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CasaRepositorio extends JpaRepository<Casa, Long> {

    @Query("SELECT c FROM Casa c WHERE c.Codigo LIKE %?1%" +
            " OR c.Propietario LIKE %?1%")
    public List<Casa> findAll(String palabraClave);


}
