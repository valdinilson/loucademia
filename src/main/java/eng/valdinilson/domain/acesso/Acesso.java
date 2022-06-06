package eng.valdinilson.domain.acesso;

import eng.valdinilson.domain.aluno.Aluno;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "ENTRADAS_SAIDAS")
public class Acesso implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "ALUNO_ID", nullable = false)
    private Aluno aluno;
    @Column(name = "ENTRADA", nullable = false)
    private LocalDateTime entrada;
    @Column(name = "SAIDA", nullable = true)
    private LocalDateTime saida;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSaida() {
        return saida;
    }

    public void setSaida(LocalDateTime saida) {
        this.saida = saida;
    }

    @Override
    public String toString() {
        return "Acesso{" +
                "id=" + id +
                ", aluno=" + aluno +
                ", entrada=" + entrada +
                ", saida=" + saida +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acesso acesso = (Acesso) o;
        return id.equals(acesso.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
