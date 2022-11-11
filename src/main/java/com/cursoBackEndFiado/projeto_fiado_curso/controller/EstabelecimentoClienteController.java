package com.cursoBackEndFiado.projeto_fiado_curso.controller;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Cliente;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.Estabelecimento;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.EstabelecimentoCliente;
import com.cursoBackEndFiado.projeto_fiado_curso.dto.EstabelecimentoDTO;
import com.cursoBackEndFiado.projeto_fiado_curso.repository.EstabelecimentoClienteRepository;
import com.cursoBackEndFiado.projeto_fiado_curso.repository.EstabelecimentoRepository;
import com.cursoBackEndFiado.projeto_fiado_curso.services.ClienteServices;
import com.cursoBackEndFiado.projeto_fiado_curso.services.EstabelecimentoClienteServices;
import com.cursoBackEndFiado.projeto_fiado_curso.services.EstabelecimentoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/estabelecimentocliente/")
public class EstabelecimentoClienteController {
    @Autowired
    private EstabelecimentoClienteServices estabelecimentoClienteServices;
    @Autowired
    private EstabelecimentoServices estabelecimentoServices;
    @Autowired
    private ClienteServices clienteServices;

    @PostMapping(path = "create")
    public ResponseEntity<Object> create(
            @RequestParam UUID estabelecimentoID,
            @RequestParam UUID clienteId,
            @RequestBody EstabelecimentoDTO estabelecimentoDTO){
        Optional<Cliente> optionalCliente = clienteServices.findById(clienteId);
        Optional<Estabelecimento> optionalEstabelecimento = estabelecimentoServices.findById(estabelecimentoID);
        if(!optionalCliente.isPresent()){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não pertence a base!");
        }
        if(!optionalEstabelecimento.isPresent()){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estabelecimento não pertence a base!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(estabelecimentoClienteServices.save(optionalCliente.get(),optionalEstabelecimento.get()));
    }
    @GetMapping(path = "{estabelecimentoID}/clientes")
    public  ResponseEntity<Object> estabelecimentoPorId(@PathVariable(value = "estabelecimentoID")UUID estabelecimentoID){
        Optional<Estabelecimento> optionalEstabelecimento = estabelecimentoServices.findById(estabelecimentoID);
        if(!optionalEstabelecimento.isPresent()){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estabelecimento não pertence a base!");
        }
        List<Cliente> list =  estabelecimentoClienteServices.findByEstabelecimentoId(optionalEstabelecimento.get());
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }
    @DeleteMapping(path = "{estabelecimentoID}/clientes/{clienteID}")
    public  ResponseEntity<Object> deleteCliente(
            @PathVariable(value = "estabelecimentoID")UUID estabelecimentoID,
            @PathVariable(value = "clienteID")UUID clienteID
    ){
        Optional<EstabelecimentoCliente> optionalEc = estabelecimentoClienteServices.findByEstabelecimentoAndCliente(estabelecimentoID,clienteID);
        if(!optionalEc.isPresent()){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estabelecimento não pertence a base!");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Relação excluida com sucesso!");
    }


}
