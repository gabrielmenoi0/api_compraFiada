package com.cursoBackEndFiado.projeto_fiado_curso.services;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Estabelecimento;
import com.cursoBackEndFiado.projeto_fiado_curso.dto.EstabelecimentoDTO;
import com.cursoBackEndFiado.projeto_fiado_curso.repository.EstabelecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstabelecimentoServices {
    @Autowired
    private EstabelecimentoRepository estabelecimentoRepository;
    public Estabelecimento save(EstabelecimentoDTO estabelecimentoDTO){
        Estabelecimento estabelecimento = new Estabelecimento();
        estabelecimento.setDocument(estabelecimentoDTO.getDocumento());
        estabelecimento.setNome(estabelecimentoDTO.getNome());
        estabelecimento.setPhone(estabelecimentoDTO.getTelefone());
        return estabelecimentoRepository.save(estabelecimento);
    }
    public List<Estabelecimento> findAll(){
        return  estabelecimentoRepository.findAll();
    }
}
