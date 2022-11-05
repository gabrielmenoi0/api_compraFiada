package com.cursoBackEndFiado.projeto_fiado_curso.repository;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Dependentes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DependenteRepository extends JpaRepository<Dependentes, UUID> {
}
