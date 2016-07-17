package com.ratp.transport.dao.services;

import java.util.List;

import com.ratp.transport.dao.implementations.LigneDao;
import com.ratp.transport.dao.model.Ligne;


public class LigneService {
	private static LigneDao ligneDao;

	public LigneService() {
		ligneDao = new LigneDao();
	}

	public void persist(Ligne entity) {
		ligneDao.openCurrentSessionwithTransaction();
		ligneDao.persist(entity);
		ligneDao.closeCurrentSessionwithTransaction();
	}

	public void update(Ligne entity) {
		ligneDao.openCurrentSessionwithTransaction();
		ligneDao.update(entity);
		ligneDao.closeCurrentSessionwithTransaction();
	}

	public Ligne findById(Integer id) {
		ligneDao.openCurrentSession();
		Ligne ligne = ligneDao.findById(id);
		ligneDao.closeCurrentSession();
		return ligne;
	}

	public void delete(Integer id) {
		ligneDao.openCurrentSessionwithTransaction();
		Ligne book = ligneDao.findById(id);
		ligneDao.delete(book);
		ligneDao.closeCurrentSessionwithTransaction();
	}

	public List<Ligne> findAll() {
		ligneDao.openCurrentSession();
		List<Ligne> lignes = ligneDao.findAll();
		ligneDao.closeCurrentSession();
		return lignes;
	}

	public void deleteAll() {
		ligneDao.openCurrentSessionwithTransaction();
		ligneDao.deleteAll();
		ligneDao.closeCurrentSessionwithTransaction();
	}

	public LigneDao bookDao() {
		return ligneDao;
	}

}
