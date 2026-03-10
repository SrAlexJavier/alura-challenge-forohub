package com.aluracursos.forohub.controller;

import com.aluracursos.forohub.topico.DatosTopico;
import com.aluracursos.forohub.topico.Topico;
import com.aluracursos.forohub.topico.TopicoRepository;
import com.aluracursos.forohub.usuario.Usuario;
import com.aluracursos.forohub.usuario.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    @PostMapping
    public void registrar(@RequestBody DatosTopico datos) {
        topicoRepository.save(new Topico(datos, usuarioRepository.getReferenceById(Long.valueOf(datos.idUsuario()))));

    }
}
