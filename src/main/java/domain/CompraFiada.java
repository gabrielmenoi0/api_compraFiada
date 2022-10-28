package domain;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "compras_fiadas")
public class CompraFiada implements Serializable {

    private static final long serialVersionId = 1l;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "estabelecimento_id")
    private Estabelecimento estabelecimento;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompraFiada that = (CompraFiada) o;
        return valor == that.valor && ID.equals(that.ID) && nome.equals(that.nome) && observacao.equals(that.observacao) && data.equals(that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, nome, observacao, valor, data);
    }

    @Id
    private UUID ID;
    private String nome;
    private String observacao;
    private int valor;
    private LocalDateTime data;

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public CompraFiada(){

    }
}
