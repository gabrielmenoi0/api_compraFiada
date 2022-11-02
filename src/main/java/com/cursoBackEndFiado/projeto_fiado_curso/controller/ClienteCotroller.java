package com.cursoBackEndFiado.projeto_fiado_curso.controller;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Cliente;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.Estabelecimento;
import com.cursoBackEndFiado.projeto_fiado_curso.dto.ClienteDTO;
import com.cursoBackEndFiado.projeto_fiado_curso.dto.EstabelecimentoDTO;
import com.cursoBackEndFiado.projeto_fiado_curso.services.ClienteServices;
import com.cursoBackEndFiado.projeto_fiado_curso.services.EstabelecimentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClienteCotroller {
    @Autowired
    private ClienteServices services;

    @PostMapping(path = "api/cliente/create")
    public ResponseEntity<Cliente> create(@RequestBody ClienteDTO clienteDTO){
        return ResponseEntity.status(HttpStatus.OK).body(services.save(clienteDTO));
    }

    @GetMapping(path = "api/cliente/list")
    public ResponseEntity<List<Cliente>> clientes(){
        return ResponseEntity.status(HttpStatus.OK).body(services.findAll());
    }

}
