package com.cursoBackEndFiado.projeto_fiado_curso.domain;

import com.cursoBackEndFiado.projeto_fiado_curso.dto.ClienteDTO;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id) && nome.equals(cliente.nome) && documento.equals(cliente.documento) && telefone.equals(cliente.telefone) && rua.equals(cliente.rua) && numero.equals(cliente.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, documento, telefone, rua, numero);
    }

    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @org.hibernate.annotations.Type(type="uuid-char")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String documento;
    private String telefone;
    private String rua;
    private String numero;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDomumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente(){

    }
    public void ClienteDTO(ClienteDTO clienteDTO) {
        this.nome = clienteDTO.getNome();
        this.documento = clienteDTO.getDocumento();
        this.telefone = clienteDTO.getTelefone();
            this.rua = clienteDTO.getRua();
        this.numero = clienteDTO.getNumero();
    }
}
