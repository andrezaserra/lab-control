package Dao;

import java.util.List;
//import javax.persistence.EntityManager;
import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 *
 * @author Andreza Serra
 */
public class Dao <T>{
    private final Class<T> classe;

    public Dao(Class<T> Classe) {
        this.classe = Classe;
    }
    
    public List<T> buscaTodos(){
        String jpql = "select s from "+ classe.getName() +" s";
       
        Session em = HibernateUtil.getSessionFactory().openSession();
        
        Query query = em.createQuery(jpql);
        List<T> lista = query.list();
        em.close();
        
        return lista;
    }
    
    public T buscaPorId(int id){
        Session em = HibernateUtil.getSessionFactory().openSession();
        T t = (T) em.get(classe, id);
        em.close();
        return t;
    }
    public void adiciona(T t){
        Session em = HibernateUtil.getSessionFactory().openSession();
        
        em.getTransaction().begin();
        em.persist(t);
        em.getTransaction().commit();
        
        em.close();
    }
    
    public void atualiza(T t){
        Session em = (Session) HibernateUtil.getSessionFactory();
        
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
        
        em.close();
    }
    
   public void remove(int id){
        //EntityManager em = JPAUtils.getEntityManager();
        Session em = (Session) HibernateUtil.getSessionFactory();
        
        em.getTransaction().begin();
        
        //T t = em.find(classe, id);
        T t = (T) em.get(classe, id);
        em.delete(t);
        em.getTransaction().commit();
        em.close();
    }
}
