package eng.valdinilson.loucademia.repository.aluno;

import eng.valdinilson.loucademia.domain.aluno.Aluno;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.Year;

@Stateless
public class AlunoRepository {
    @PersistenceContext
    private EntityManager em;

    public void store(Aluno aluno) {
        em.persist(aluno);
    }

    public void update(Aluno aluno) {
        em.merge(aluno);
    }

    public Aluno findByMatricula(String matricula) {
        return em.find(Aluno.class, matricula);
    }

    public void delete(String matricula) {
        Aluno aluno = findByMatricula(matricula);

        if (aluno != null) {
            em.remove(aluno);
        }
    }

    public String getMaxMatriculaAno() {
        return em.createQuery("SELECT MAX(a.matricula) FROM Aluno a WHERE a.matricula LIKE :ano", String.class)
                .setParameter("ano", Year.now() + "%")
                .getSingleResult();
    }
}
