package com.cursoBackEndFiado.projeto_fiado_curso.dto;

import com.cursoBackEndFiado.projeto_fiado_curso.domain.Estabelecimento;

public class EstabelecimentoDTO {
    private String nome;

    public String getNome() {
        return nome;
    }

    public EstabelecimentoDTO(String nome, String telefone, String documento) {
        this.nome = nome;
        this.telefone = telefone;
        this.documento = documento;
    }
    public EstabelecimentoDTO(Estabelecimento estabelecimento) {
        this.nome = estabelecimento.getNome();
        this.telefone = estabelecimento.getPhone();
        this.documento = estabelecimento.getDocument();
    }

    public EstabelecimentoDTO() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    private String telefone;
    private String documento;

}
