package com.tsystems.projects.logiweb.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by StarKiller on 24.10.2014.
 */
public abstract class AbstractDAO<T> {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    protected AbstractDAO() {
        emf = Persistence.createEntityManagerFactory("logiwebPU");
        em = emf.createEntityManager();
    }


    public List<T> getAll(String entities) {
        List<T> resultList = em.createNamedQuery("getAll"+entities).getResultList();
        return resultList;
    }


    public T getBy(String byWhat, String uniqName) {
        Query q = em.createNamedQuery("getBy"+byWhat);
        q.setParameter("uniqName", uniqName);
        T t = (T)q.getSingleResult();
        return t;
    }

    public void add(T t) {
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
    }

    @Override
    protected void finalize() throws Throwable {
        em.close();
        emf.close();
    }
}
