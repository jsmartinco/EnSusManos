package com.helloworld.apispring.model.dao;

import com.helloworld.apispring.model.entity.Ciudadano;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CiudadanoRepositorio {

    @Autowired
    private SessionFactory sessionfactory;

    public SessionFactory getSessionfactory() {
        return sessionfactory;
    }

    public void setSessionfactory(SessionFactory sessionfactory) {
        this.sessionfactory = sessionfactory;
    }

    public Ciudadano obtenerCiudadanoID(int id) {
        Criteria criteria = getSessionfactory().getCurrentSession().createCriteria(Ciudadano.class);
        criteria.add(Restrictions.eq("id_ciudadano", id));
        return (Ciudadano) criteria.uniqueResult();
    }

    public List<Ciudadano> ordenarCiudadano() {
        Criteria criteria = getSessionfactory().getCurrentSession().createCriteria(Ciudadano.class);
        return (List<Ciudadano>) criteria.addOrder(Order.desc("id_ciudadano")).list();
    }
    
    public Ciudadano login(Ciudadano ciudadano){
        Criteria criteria = getSessionfactory().getCurrentSession().createCriteria(Ciudadano.class);
        criteria.add(Restrictions.eq("usuario", ciudadano.getUsuario()));
        criteria.add(Restrictions.eq("pass", ciudadano.getpass()));
        
        Ciudadano ciud = (Ciudadano) criteria.uniqueResult();
        return ciud;
    }
    
    
    
    
   

}
