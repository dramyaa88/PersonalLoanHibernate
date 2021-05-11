package demo.service;

import org.hibernate.Session;
import org.hibernate.Transaction;

import demo.model.login;
import demo.util.HibernateUtil;
 
public class LoginService {
 
    public boolean authenticateUser(String AdminId, String password) {
        login admin = getAdminbyAdminId(AdminId);         
        if(admin!=null && admin.getUname().equals(AdminId) && admin.getPassword().equals(password)){
            return true;
        }else{
            return false;
        }
    }
 
    public login getAdminbyAdminId(String AdminId) {
        Session session = HibernateUtil.openSession();
        Transaction tx = null;
        login admin = null;
        try {
            tx = session.beginTransaction();
            
            admin =(login) session.get(login.class,AdminId );
            tx.commit();
        } catch (Exception e) {
            
            e.printStackTrace();
        } finally {
            session.close();
        }
        return admin;
    }
}
