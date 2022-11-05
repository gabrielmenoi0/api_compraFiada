package com.cursoBackEndFiado.projeto_fiado_curso.services;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.Cliente;
import com.cursoBackEndFiado.projeto_fiado_curso.dto.ClienteDTO;
import com.cursoBackEndFiado.projeto_fiado_curso.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClienteServices {
    @Autowired
    private ClienteRepository clienteRepository;
    public Cliente save(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();
        cliente.setDocumento(clienteDTO.getDocumento());
        cliente.setNome(clienteDTO.getNome());
        cliente.setNumero(clienteDTO.getNumero());
        cliente.setRua(clienteDTO.getRua());
        cliente.setTelefone(clienteDTO.getTelefone());
        return clienteRepository.save(cliente);
    }
    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }
    public Optional<Cliente> findById(UUID idCliente) {
        return clienteRepository.findById(idCliente);
    }



}
