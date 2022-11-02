package com.cursoBackEndFiado.projeto_fiado_curso.domain;

import com.cursoBackEndFiado.projeto_fiado_curso.dto.ClienteDTO;

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
        return id.equals(cliente.id) && nome.equals(cliente.nome) && domumento.equals(cliente.domumento) && telefone.equals(cliente.telefone) && rua.equals(cliente.rua) && numero.equals(cliente.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, domumento, telefone, rua, numero);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String nome;
    private String domumento;
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
        return domumento;
    }

    public void setDomumento(String domumento) {
        this.domumento = domumento;
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
        this.domumento = clienteDTO.getDomumento();
        this.telefone = clienteDTO.getTelefone();
        this.rua = clienteDTO.getRua();
        this.numero = clienteDTO.getNumero();
    }
}
