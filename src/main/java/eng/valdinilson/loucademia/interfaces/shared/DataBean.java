package eng.valdinilson.loucademia.interfaces.shared;

import eng.valdinilson.loucademia.application.service.DataService;
import eng.valdinilson.loucademia.domain.aluno.Aluno;
import eng.valdinilson.loucademia.domain.aluno.Estado;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ApplicationScoped
public class DataBean implements Serializable {
    @EJB
    private DataService dataService;

    public Aluno.Sexo[] getSexos() {
        return dataService.getSexos();
    }

    public Aluno.Situacao[] getSituacoes() {
        return dataService.getSituacoes();
    }

    public List<Estado> getEstados() {
        return dataService.listEstados();
    }
}
