package com.cursoBackEndFiado.projeto_fiado_curso.services;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Cliente;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.Estabelecimento;
import com.cursoBackEndFiado.projeto_fiado_curso.dto.ClienteDTO;
import com.cursoBackEndFiado.projeto_fiado_curso.dto.EstabelecimentoDTO;
import com.cursoBackEndFiado.projeto_fiado_curso.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteServices {
    @Autowired
    private ClienteRepository clienteRepository;
    public Cliente save(ClienteDTO clienteDTO){
        Cliente cliente = new Cliente();
        cliente.setDomumento(clienteDTO.getDomumento());
        cliente.setNome(clienteDTO.getNome());
        cliente.setNumero(clienteDTO.getTelefone());
        return clienteRepository.save(cliente);
    }
    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }


}
