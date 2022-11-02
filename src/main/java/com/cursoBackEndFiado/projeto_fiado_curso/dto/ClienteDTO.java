package com.cursoBackEndFiado.projeto_fiado_curso.dto;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Cliente;

public class ClienteDTO {
    private String nome;
    private String domumento;
    private String telefone;
    private String rua;
    private String numero;

    public ClienteDTO() {
    }

    public ClienteDTO(String nome, String domumento, String telefone, String rua, String numero) {
        this.nome = nome;
        this.domumento = domumento;
        this.telefone = telefone;
        this.rua = rua;
        this.numero = numero;
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
}
