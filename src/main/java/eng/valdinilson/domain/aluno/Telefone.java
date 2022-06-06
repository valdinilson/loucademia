package eng.valdinilson.domain.aluno;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class Telefone implements Serializable {
    @Column(name = "CELULAR_DDD", nullable = false, length = 2)
    private Integer dddCelular;
    @Column(name = "CELULAR_NUMERO", nullable = false, length = 9)
    private Integer numeroCelular;
    @Column(name = "FIXO_DDD", nullable = true, length = 2)
    private Integer dddFixo;
    @Column(name = "FIXO_NUMERO", nullable = true, length = 8)
    private Integer numeroFixo;

    public Integer getDddCelular() {
        return dddCelular;
    }

    public void setDddCelular(Integer dddCelular) {
        this.dddCelular = dddCelular;
    }

    public Integer getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public Integer getDddFixo() {
        return dddFixo;
    }

    public void setDddFixo(Integer dddFixo) {
        this.dddFixo = dddFixo;
    }

    public Integer getNumeroFixo() {
        return numeroFixo;
    }

    public void setNumeroFixo(Integer numeroFixo) {
        this.numeroFixo = numeroFixo;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "dddCelular=" + dddCelular +
                ", numeroCelular=" + numeroCelular +
                ", dddFixo=" + dddFixo +
                ", numeroFixo=" + numeroFixo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return Objects.equals(dddCelular, telefone.dddCelular) && Objects.equals(numeroCelular, telefone.numeroCelular) && Objects.equals(dddFixo, telefone.dddFixo) && Objects.equals(numeroFixo, telefone.numeroFixo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dddCelular, numeroCelular, dddFixo, numeroFixo);
    }
}
