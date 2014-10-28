package com.tsystems.projects.logiweb.DAO;

import javax.persistence.*;
import java.util.List;

/**
 * Created by StarKiller on 24.10.2014.
 */
public abstract class AbstractDAO<T> {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    protected AbstractDAO() {


    }


    public List<T> getAll(String entities) {

        List<T> resultList = em.createNamedQuery("getAll"+entities).getResultList();

        return resultList;
    }


    public T getBy(String byWhat, String uniqName) {

        Query q = em.createNamedQuery("getBy"+byWhat);
        q.setParameter("uniqName", uniqName);
        T t;
        try {
            t = (T)q.getSingleResult();
        } catch (NoResultException e) {
            t = null;
        }

        return t;
    }

    public T add(T t) {

        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();

        return t;
    }

    public T update(T t) {

        em.getTransaction().begin();
        em.persist(t);
        em.flush();
        em.getTransaction().commit();

        return t;

    }

    @Override
    protected void finalize() throws Throwable {

    }


    public void start() {
        emf = Persistence.createEntityManagerFactory("logiwebPU");
        em = emf.createEntityManager();
    }


    public void stop() {
        em.close();
        emf.close();
    }


}
