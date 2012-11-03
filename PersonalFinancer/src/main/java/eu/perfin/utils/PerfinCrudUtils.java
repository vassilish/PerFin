/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.perfin.utils;

import eu.perfin.data.AbstractPFData;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author vassilish
 */
public class PerfinCrudUtils {
    
    SessionFactory sessionFactory = null;
    
    public PerfinCrudUtils(){
        sessionFactory = HibernateUtils.getSessionFactory();
    }
    
    public void saveEntry (AbstractPFData dataObject)throws PerfinException{
        
        Session session1 = sessionFactory.openSession();
        try {
            PerfinUtils.validate(dataObject);
            
            Transaction tx = session1.beginTransaction();
        
            session1.save(dataObject);
            
            tx.commit();
           
        }catch(HibernateException e) {
            
        }catch(PFValidationException e){
            
        }finally {
             session1.close();
        }
    }

    public void deleteEntry (AbstractPFData dataObject)throws PerfinException{
        Session session1 = sessionFactory.openSession();
        try {
            PerfinUtils.validate(dataObject);
            
            Transaction tx = session1.beginTransaction();
        
            session1.delete(dataObject);
            
            tx.commit();
           
        }catch(HibernateException e) {
            
        }catch(PFValidationException e){
            
        }finally {
             session1.close();
        }
    }
    
    public void updateEntry (AbstractPFData dataObject)throws PerfinException{
        Session session1 = sessionFactory.openSession();
        try {
            PerfinUtils.validate(dataObject);
            
            Transaction tx = session1.beginTransaction();
        
            session1.update(dataObject);
            
            tx.commit();
           
        }catch(HibernateException e) {
            //TODO add exception handling code for update
        }catch(PFValidationException e){
            //TODO add exception handling code for validation on update
        }finally {
             session1.close();
        }
    }
    
    public AbstractPFData readEntry (AbstractPFData dataObject) throws PerfinException {
        
        Session session1 = sessionFactory.openSession();
        try {
            PerfinUtils.validate(dataObject);
            
            Transaction tx = session1.beginTransaction();
        
            AbstractPFData myPF = (AbstractPFData)session1.load(dataObject.getClass(), dataObject.getId());
            
            tx.commit();
           
        }catch(HibernateException e) {
            //TODO add the appropriate exception handling code
            
        }catch(PFValidationException e){
            //TODO add the appropriate exception handling code
        }finally {
             session1.close();
        }
        return null;
    }

}
