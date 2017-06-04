package fr.mbenfredj.ratp.dao;

import java.awt.LinearGradientPaint;
import java.util.List;

import org.hibernate.Session;

import fr.mbenfredj.ratp.entity.Ligne;

public class LigneDao {

	public void persist(Ligne entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.persist(entity);
	}

	public void update(Ligne entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.update(entity);
	}

	public Ligne findById(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Ligne ligne = (Ligne) session.get(Ligne.class, id);
		return ligne;
	}

	public void delete(Ligne entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.delete(entity);
	}

	public List<Ligne> findAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
        List<Ligne> lignes = (List<Ligne>) session.createQuery("from Ligne").getResultList();
        return lignes;
	}

	public void deleteAll() {
		List<Ligne> lignes =findAll();
		for(Ligne entity:lignes){
			delete(entity);
		}
	}

}
