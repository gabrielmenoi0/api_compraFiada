package com.cursoBackEndFiado.projeto_fiado_curso.domain.EstabeleimentoRepository;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.Estabelecimento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, UUID> {

}
