package demo.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import demo.model.NewUser;
import demo.model.loanDetails;
import demo.model.login;



public class HibernateUtil {
	static SessionFactory sessionfactory;
	static Session session;
 
    static {
        try {
        	
        	sessionfactory = new Configuration().configure().addAnnotatedClass(login.class).addAnnotatedClass(loanDetails.class).addAnnotatedClass(NewUser.class).buildSessionFactory();
    		System.out.println("session is created....");
    		
    		} catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static Session openSession() {
        return sessionfactory.openSession();
    }

}

