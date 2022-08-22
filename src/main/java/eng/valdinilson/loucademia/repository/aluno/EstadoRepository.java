package eng.valdinilson.loucademia.repository.aluno;

import eng.valdinilson.loucademia.domain.aluno.Estado;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class EstadoRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Estado> listEstados() {
        return em.createQuery("SELECT e FROM Estado e ORDER BY e.nome", Estado.class).getResultList();
    }
}
