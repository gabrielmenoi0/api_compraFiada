package domain;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Dependentes implements Serializable {
    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dependentes that = (Dependentes) o;
        return cliente.equals(that.cliente) && id.equals(that.id) && nome.equals(that.nome) && domumento.equals(that.domumento) && telefone.equals(that.telefone) && rua.equals(that.rua) && numero.equals(that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, id, nome, domumento, telefone, rua, numero);
    }

    @Id
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

    public Dependentes(){

    }
}
