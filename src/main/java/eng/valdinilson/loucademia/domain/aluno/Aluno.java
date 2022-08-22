package eng.valdinilson.loucademia.domain.aluno;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Year;

@Entity
@Table(name = "ALUNO")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Aluno implements Serializable {
    public enum Sexo {
        MASCULINO, FEMININO;
    }

    public enum Situacao {
        ATIVO, INATIVO, PENDENTE;
    }

    @Id
    @Column(name = "ID", nullable = false, length = 8)
    private String matricula;
    @Column(name = "NOME", nullable = false, length = 64)
    private String nome;
    @Enumerated
    @Column(name = "SEXO", nullable = false, length = 1)
    private Sexo sexo;
    @Column(name = "RG", nullable = false, length = 10)
    private Integer rg;
    @Column(name = "NASCIMENTO", nullable = false)
    private LocalDate dataNascimento;
    @Enumerated
    @Column(name = "SITUACAO", nullable = false, length = 1)
    private Situacao situacao;
    @Column(name = "EMAIL", length = 64)
    private String email;
    @Embedded
    private Endereco endereco = new Endereco();
    @Embedded
    private Telefone telefone = new Telefone();

    public void gerarMatricula(String maxMatricula) {
        Year year = Year.now();

        if (maxMatricula == null) {
            maxMatricula =  year + StringUtils.leftPad("", 4, "0");
        }

        int sequential = Integer.parseInt(maxMatricula.substring(4));
        sequential++;

        this.matricula = year + StringUtils.leftPad(String.valueOf(sequential), 4, "0");
    }
}
