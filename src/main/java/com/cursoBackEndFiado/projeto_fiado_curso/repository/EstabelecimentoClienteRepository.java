package com.cursoBackEndFiado.projeto_fiado_curso.repository;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Estabelecimento;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.EstabelecimentoCliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EstabelecimentoClienteRepository extends JpaRepository<EstabelecimentoCliente, UUID> {
    List<EstabelecimentoCliente> findbyEstabelecimento(Estabelecimento estabelecimento);
    Optional<EstabelecimentoCliente> findbyEstabelecimentoAndCliente (UUID estabelecimentoID,UUID clienteID);
}
