package com.ratp.transport.service.implementation;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.ratp.transport.dao.model.Ligne;
import com.ratp.transport.dao.services.LigneService;
import com.ratp.transport.service.interfaces.IManagementService;

@ManagedBean(name= "managementService" , eager=true)
@ApplicationScoped
public class ManagementService implements IManagementService {

	@Override
	public List<Ligne> getAllLignes() {
		LigneService ligneService= new LigneService();
		List<Ligne> lignes = ligneService.findAll();
		return lignes;
	}


}
