package com.ratp.transport.dao.implementations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.ratp.transport.dao.interfaces.ILigneDao;
import com.ratp.transport.dao.model.Ligne;

public class LigneDao implements ILigneDao<Ligne, Integer> {
	private Session currentSession;
	private Transaction currentTransaction;

	public Session openCurrentSession() {
		currentSession = getSessionFactory().openSession();
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		currentSession = getSessionFactory().openSession();
		currentTransaction = currentSession.beginTransaction();
		return currentSession;
	}

	public void closeCurrentSession() {
		currentSession.close();
	}

	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}

	private static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}

	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

	public void persist(Ligne entity) {
		getCurrentSession().persist(entity);
	}

	public void update(Ligne entity) {
		getCurrentSession().update(entity);
	}

	public Ligne findById(Integer id) {
		Ligne ligne = (Ligne) getCurrentSession().get(Ligne.class, id);
		return ligne;
	}

	public void delete(Ligne entity) {
		getCurrentSession().delete(entity);
	}

	public List<Ligne> findAll() {
        List<Ligne> lignes = (List<Ligne>) getCurrentSession().createQuery("from Ligne").getResultList();
        return lignes;
	}

	public void deleteAll() {
		List<Ligne> lignes =findAll();
		for(Ligne entity:lignes){
			delete(entity);
		}
	}

}
