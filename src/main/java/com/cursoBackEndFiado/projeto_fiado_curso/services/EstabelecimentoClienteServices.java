package com.cursoBackEndFiado.projeto_fiado_curso.services;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Cliente;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.Estabelecimento;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.EstabelecimentoCliente;
import com.cursoBackEndFiado.projeto_fiado_curso.repository.EstabelecimentoClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class EstabelecimentoClienteServices {
    @Autowired
    private EstabelecimentoClienteRepository estabelecimentoClienteRepository;
    public EstabelecimentoCliente save(Cliente cliente, Estabelecimento estabelecimento){
        EstabelecimentoCliente ec = new EstabelecimentoCliente();
        ec.setCliente(cliente);
        ec.setEstabelecimento(estabelecimento);
        return estabelecimentoClienteRepository.save(ec);
    }
    public List<Cliente> findByEstabelecimentoId(Estabelecimento estabelecimento){
        List<EstabelecimentoCliente> list = estabelecimentoClienteRepository.findbyEstabelecimento(estabelecimento);
        ArrayList<Cliente> clientes = new ArrayList<>();
//        list.forEach(cliente -> {
//            clientes.add(cliente.getCliente());
//        });
        list.stream().forEach(x->{
            clientes.add(x.getCliente());
        });
        return clientes;
    }
    public Optional<EstabelecimentoCliente> findByEstabelecimentoAndCliente(UUID estabelecimentoID, UUID clienteID){
        return  estabelecimentoClienteRepository.findbyEstabelecimentoAndCliente(estabelecimentoID,clienteID);

    }
    public void delete(EstabelecimentoCliente estabelecimentoCliente){
        estabelecimentoClienteRepository.delete(estabelecimentoCliente);
    }
}
