package com.cursoBackEndFiado.projeto_fiado_curso.controller;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Cliente;
import com.cursoBackEndFiado.projeto_fiado_curso.dto.DependenteDTO;
import com.cursoBackEndFiado.projeto_fiado_curso.services.ClienteServices;
import com.cursoBackEndFiado.projeto_fiado_curso.services.DependenteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
public class DependenteController {

    @Autowired
    private DependenteServices services;


    @Autowired
    private ClienteServices clienteServices;

    @PostMapping(path = "api/dependentes/create/{idCliente}")
    public ResponseEntity<Object> create(
            @PathVariable UUID idCliente,
            @RequestBody DependenteDTO dto) {

        Optional<Cliente> optionalCliente = clienteServices.findById(idCliente);

        if(!optionalCliente.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não existe!");
        }
//		return ResponseEntity.status(HttpStatus.OK).body());
        return ResponseEntity.status(HttpStatus.OK).body(services.create(optionalCliente.get(), dto));
    }




}
