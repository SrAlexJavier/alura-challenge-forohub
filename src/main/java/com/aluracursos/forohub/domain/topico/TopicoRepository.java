package com.aluracursos.forohub.domain.topico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    List<Topico> findTop10ByOrderByFechaCreacionAsc();

    Page<Topico> findAllByEstado(int i, Pageable paginacion);
    //@Query("SELECT t FROM Topico t WHERE t.estado = 1")
    //List<Topico> findAllByEstado1();

}
