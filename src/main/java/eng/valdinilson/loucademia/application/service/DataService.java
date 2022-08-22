package eng.valdinilson.loucademia.application.service;

import eng.valdinilson.loucademia.domain.aluno.Aluno;
import eng.valdinilson.loucademia.domain.aluno.Estado;
import eng.valdinilson.loucademia.repository.aluno.EstadoRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class DataService {
    @EJB
    private EstadoRepository estadoRepository;

    public Aluno.Sexo[] getSexos() {
        return Aluno.Sexo.values();
    }

    public Aluno.Situacao[] getSituacoes() {
        return Aluno.Situacao.values();
    }

    public List<Estado> listEstados() {
        return estadoRepository.listEstados();
    }
}
