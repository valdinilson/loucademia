package eng.valdinilson.loucademia.application.service;

import eng.valdinilson.loucademia.application.util.Validation;
import eng.valdinilson.loucademia.application.util.ValidationException;
import eng.valdinilson.loucademia.domain.aluno.Aluno;
import eng.valdinilson.loucademia.repository.aluno.AlunoRepository;
import org.apache.commons.lang3.StringUtils;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class AlunoService {
    @EJB
    private AlunoRepository alunoRepository;

    public void createOrUpdate(Aluno aluno) {
        if (StringUtils.isEmpty(aluno.getMatricula())) {
            create(aluno);
        } else {
            update(aluno);
        }
    }

    private void create(Aluno aluno) {
        try {
            Validation.assertNotEmpty(aluno);
            aluno.gerarMatricula(alunoRepository.getMaxMatriculaAno());
            alunoRepository.store(aluno);
        } catch (ValidationException e) {
            throw new RuntimeException(e);
        }
    }

    private void update(Aluno aluno) {
        try {
            Validation.assertNotEmpty(aluno);
            Validation.assertNotEmpty(aluno.getMatricula());
            alunoRepository.update(aluno);
        } catch (ValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
