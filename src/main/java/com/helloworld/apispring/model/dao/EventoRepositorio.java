
package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.model.entity.Ciudadano;
import com.helloworld.apispring.model.entity.RegistroEvento;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EventoRepositorio {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public List<Ciudadano> getAllCiudadanos() {
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(Ciudadano.class);
        return criteria.list();
    
    }
    
     public List<RegistroEvento> eventoCiudadanoID(int id){
        Criteria criteria = getSessionFactory().getCurrentSession().createCriteria(RegistroEvento.class)
                .createAlias("ciudadano","c")
                .createAlias("situacion","s")
                .add(Restrictions.eq("c.id_ciudadano",id))
                .add(Restrictions.eq("s.id_Situaciones",id));
             return (List<RegistroEvento>) criteria.list();
     }
    
}
