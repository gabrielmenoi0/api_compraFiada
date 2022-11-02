package com.cursoBackEndFiado.projeto_fiado_curso.controller;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Estabelecimento;
import com.cursoBackEndFiado.projeto_fiado_curso.dto.EstabelecimentoDTO;
import com.cursoBackEndFiado.projeto_fiado_curso.services.EstabelecimentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstabelecimentoController {
    @Autowired
    private EstabelecimentoServices services;

    @PostMapping(path = "api/estabelecimento/create")
    public ResponseEntity<Estabelecimento> create(@RequestBody EstabelecimentoDTO estabelecimentoDTO){
        return ResponseEntity.status(HttpStatus.OK).body(services.save(estabelecimentoDTO));
    }

    @GetMapping(path = "api/estabelecimento/estabelecimento")
    public ResponseEntity<List<Estabelecimento>> estabelecimentos(){
        return ResponseEntity.status(HttpStatus.OK).body(services.findAll());
    }

}
