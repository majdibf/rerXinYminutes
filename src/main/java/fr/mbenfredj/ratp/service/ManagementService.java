package fr.mbenfredj.ratp.service;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import fr.mbenfredj.ratp.dao.LigneDao;
import fr.mbenfredj.ratp.entity.Ligne;

@ManagedBean(name = "managementService", eager = true)
@ApplicationScoped
public class ManagementService implements IManagementService {

	public List<Ligne> getAllLignes() {
		LigneDao ligneDao = new LigneDao();
		List<Ligne> lignes = ligneDao.findAll();
		return lignes;
	}

}
