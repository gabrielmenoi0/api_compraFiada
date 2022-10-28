package domain;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "estabelecimento")
public class Estabelecimento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private UUID id ;

    private String nome;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estabelecimento that = (Estabelecimento) o;
        return id.equals(that.id) && nome.equals(that.nome) && telefone.equals(that.telefone) && documento.equals(that.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, telefone, documento);
    }

    private String telefone;
    private String documento;

    public Estabelecimento() {
    }

    public Estabelecimento(String nome, String phone, String document) {
        this.nome = nome;
        this.telefone = phone;
        this.documento = document;
    }

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

    public String getPhone() {
        return telefone;
    }

    public void setPhone(String phone) {
        this.telefone = phone;
    }

    public String getDocument() {
        return documento;
    }

    public void setDocument(String document) {
        this.documento = document;
    }
}
