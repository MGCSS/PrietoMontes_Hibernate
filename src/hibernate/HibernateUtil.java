package hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class HibernateUtil 
{
    private static final SessionFactory SESSION_FACTORY;
    
    static
    {
        try 
        {
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
        } 
        
        catch (HibernateException ex) 
        {
            System.err.println(ex);
            
            throw (new ExceptionInInitializerError(ex));
        }
    }
    
    public static SessionFactory getSESSION_FACTORY()
    {
        return SESSION_FACTORY;
    }
}
