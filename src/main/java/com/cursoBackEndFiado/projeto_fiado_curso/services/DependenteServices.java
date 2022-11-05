package com.cursoBackEndFiado.projeto_fiado_curso.services;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.Cliente;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.Dependentes;
import com.cursoBackEndFiado.projeto_fiado_curso.dto.DependenteDTO;
import com.cursoBackEndFiado.projeto_fiado_curso.repository.DependenteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DependenteServices {

    @Autowired
    private DependenteRepository dependenteRepository;

    public Dependentes create(Cliente cliente, DependenteDTO dto) {
        Dependentes dependente = new Dependentes();
        dependente.setCliente(cliente);
        BeanUtils.copyProperties(dto, dependente);

        return dependenteRepository.save(dependente);
    }




}
