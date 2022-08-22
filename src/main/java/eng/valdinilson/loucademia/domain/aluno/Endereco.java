package eng.valdinilson.loucademia.domain.aluno;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Endereco implements Serializable {
    @Column(name = "RUA", nullable = false, length = 128)
    private String rua;
    @Column(name = "NUMERO", length = 6)
    private Integer numero;
    @Column(name = "COMPLEMENTO", length = 32)
    private String complemento;
    @Column(name = "CIDADE", nullable = false, length = 64)
    private String cidade;
    @ManyToOne
    @JoinColumn(name = "ESTADO_ID", nullable = false)
    private Estado estado = new Estado();
    @Column(name = "CEP", nullable = false, length = 8)
    private Integer cep;
}
