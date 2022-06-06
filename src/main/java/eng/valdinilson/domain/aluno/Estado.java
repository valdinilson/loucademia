package eng.valdinilson.domain.aluno;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ESTADO")
public class Estado implements Serializable {
    @Id
    @Column(name = "SIGLA", nullable = false, length = 2)
    private String sigla;
    @Column(name = "NOME", nullable = false, length = 30)
    private String nome;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Estado{" +
                "sigla='" + sigla + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return sigla.equals(estado.sigla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigla);
    }
}
