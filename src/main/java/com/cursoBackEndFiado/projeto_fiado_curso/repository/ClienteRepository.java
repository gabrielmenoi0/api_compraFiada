package com.cursoBackEndFiado.projeto_fiado_curso.repository;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}
