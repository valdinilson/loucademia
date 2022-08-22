package eng.valdinilson.loucademia.domain.aluno;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Telefone implements Serializable {
    @Column(name = "CELULAR_DDD", nullable = false, length = 2)
    private Integer dddCelular;
    @Column(name = "CELULAR_NUMERO", nullable = false, length = 9)
    private Integer numeroCelular;
    @Column(name = "FIXO_DDD", length = 2)
    private Integer dddFixo;
    @Column(name = "FIXO_NUMERO", length = 8)
    private Integer numeroFixo;
}
