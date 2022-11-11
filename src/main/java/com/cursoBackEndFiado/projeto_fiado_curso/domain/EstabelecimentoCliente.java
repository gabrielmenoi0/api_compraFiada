package com.cursoBackEndFiado.projeto_fiado_curso.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "estabelecimento_cliente")
public class EstabelecimentoCliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @org.hibernate.annotations.Type(type="uuid-char")
    private UUID id ;
    @ManyToOne
    @JoinColumn(name = "estabelecimento_id")
    private Estabelecimento estabelecimento;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private  Cliente cliente;

    public EstabelecimentoCliente(UUID id, Estabelecimento estabelecimento, Cliente cliente) {
        this.id = id;
        this.estabelecimento = estabelecimento;
        this.cliente = cliente;
    }

    public EstabelecimentoCliente() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
