package com.cursoBackEndFiado.projeto_fiado_curso.dto;

public class DependenteDTO {

    private String nome;

    private String documento;

    private String telefone;


    public DependenteDTO(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
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
}
