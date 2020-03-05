package Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import fr.adaming.model.Formation;
import fr.adaming.model.Lieu;

public class DaoFormation implements IDaoFormation{
	SessionFactory factory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
	@Override
	public int addFormation(Formation f) {
		// TODO Auto-generated method stub
		try { 
			
		session.beginTransaction();
		session.saveOrUpdate(f);
		session.getTransaction().commit();
	
		}
			
	    catch (HibernateException e) {
			// TODO: handle exception
	    	e.printStackTrace();
		}
		return 0;
	}
	@Override
	public List<Formation> getFormation() {
		List<Formation>list=new ArrayList<Formation>();
		try {
			session.beginTransaction();
			Query query= session.createQuery("from Formation");
			return query.list();
			
			}
		catch (HibernateException e) {
//			e.printStackTrace();
			e.printStackTrace();
		return null ;
	}
	}
	@Override
	public List<Formation> findByLocation(Lieu lieu) {
		// TODO Auto-generated method stub
		List<Formation>list2=new ArrayList<Formation>();
		try {
			session.beginTransaction();
			Query query= session.createQuery("from Formation where Lieu.ville= :Lieu");
			return query.list();
			}
		catch (HibernateException e) {
//			e.printStackTrace();
			e.printStackTrace();
		return null;
	}
}
}


