package uce.edu.efinal2_api_pa.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import uce.edu.efinal2_api_pa.model.Estudiante;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertarEstudiante(Estudiante e) {
        this.em.persist(e);
    }

    @Override
    public Estudiante buscarPorCedula(String cedula) {
        TypedQuery<Estudiante> myQuery = this.em.createQuery("SELECT e FROM Estudiante e WHERE e.cedula = :cedula", Estudiante.class).setParameter("cedula", cedula);
        return myQuery.getSingleResult();
    }
    
}
