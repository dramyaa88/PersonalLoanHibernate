package demo.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import demo.model.NewUser;
import demo.model.loanDetails;
import demo.model.login;
import demo.util.HibernateUtil;





public class UserDAO {
	public void saveUser(NewUser user) {
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		try  {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(user);
			// commit transaction
			transaction.commit();
			session.close();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	
	public void updateUser(NewUser users) {
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		try  {
			transaction = session.beginTransaction();
			// save the student object
			session.update(users);;
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	
	public void deleteUser(String id) {
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		try  {
			// start a transaction
			transaction = session.beginTransaction();

			// Delete a user object
			NewUser user = (NewUser) session.get(NewUser.class, id);
			if (user != null) {
				session.delete(user);
				System.out.println("user is deleted");
			}

			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}

	
	public NewUser getUser(String id) {
		
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		NewUser user = null;
		try  {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			user = (NewUser) session.get(NewUser.class, id);
			// commit transaction
			transaction.commit();
			session.close();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		System.out.println(user);
		return user;
	}
	
	public List<NewUser> getAllUser() {
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		List<NewUser> listOfUser = null;
		try  {
			// start a transaction
			transaction = session.beginTransaction();
			// get an user object
			
			listOfUser = session.createQuery("from NewUser").list();
			
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return listOfUser;
	}


	public void saveUser(login login) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		try  {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(login);
			// commit transaction
			transaction.commit();
			session.close();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
	}


	public void saveUser(loanDetails loan) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.openSession();
		Transaction transaction = null;
		try  {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(loan);
			// commit transaction
			transaction.commit();
			session.close();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}
