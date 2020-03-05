package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import fr.adaming.model.Lieu;

public class DaoLieu implements IDaoLieu {
	SessionFactory factory = new Configuration().configure("/ressources/hibernate.cfg.xml").buildSessionFactory();
	Session session = factory.openSession();
	@Override
	public int createLieu(Lieu lieu) {
		// TODO Auto-generated method stub
		try {
			Session session = factory.openSession();
			session.beginTransaction();
			session.saveOrUpdate(lieu);
			session.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}

}
