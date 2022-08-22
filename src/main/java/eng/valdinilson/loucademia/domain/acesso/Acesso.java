package eng.valdinilson.loucademia.domain.acesso;

import eng.valdinilson.loucademia.domain.aluno.Aluno;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "ENTRADAS_SAIDAS")
@Getter
@Setter
@EqualsAndHashCode
@ToString
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
    @Column(name = "SAIDA")
    private LocalDateTime saida;
}
