package com.example.proyectom5b0106271836.repositori;


import com.example.proyectom5b0106271836.entidades.Zapatos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ZapatosRepositorio extends JpaRepository<Zapatos, Long> {

    @Query("SELECT z FROM Zapatos z WHERE z.Codigo LIKE %?1%" +
            " OR z.Marca LIKE %?1%")
    public List<Zapatos> findAll(String palabraClave);
}
