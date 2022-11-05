package com.cursoBackEndFiado.projeto_fiado_curso.repository;
import com.cursoBackEndFiado.projeto_fiado_curso.domain.CompraFiada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompraFiadaRepository extends JpaRepository<CompraFiada, UUID> {
}
