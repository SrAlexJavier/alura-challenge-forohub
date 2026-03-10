package com.aluracursos.forohub.topico;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DatosTopico(
        String titulo,
        String mensaje,
        @JsonAlias("nombreCurso") String curso,
        Integer idUsuario
) {
}
