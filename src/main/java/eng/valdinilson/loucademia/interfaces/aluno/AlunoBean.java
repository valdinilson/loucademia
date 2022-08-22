package eng.valdinilson.loucademia.interfaces.aluno;

import eng.valdinilson.loucademia.application.service.AlunoService;
import eng.valdinilson.loucademia.domain.aluno.Aluno;
import lombok.Getter;
import lombok.Setter;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
@Getter
@Setter
public class AlunoBean implements Serializable {
    @EJB
    private AlunoService alunoService;
    private Aluno aluno = new Aluno();

    public String gravar() {
        alunoService.createOrUpdate(aluno);
        return null;
    }

    public void carregar() {
        //
    }

    public String getTitulo() {
        return getClass().getSimpleName();
    }
}