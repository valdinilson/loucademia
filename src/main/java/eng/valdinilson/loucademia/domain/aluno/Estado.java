package eng.valdinilson.loucademia.domain.aluno;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ESTADO")
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Estado implements Serializable {
    @Id
    @Column(name = "SIGLA", nullable = false, length = 2)
    private String sigla;
    @Column(name = "NOME", nullable = false, length = 30)
    private String nome;
}
