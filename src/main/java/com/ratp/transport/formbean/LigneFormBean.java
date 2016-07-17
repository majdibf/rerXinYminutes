package com.ratp.transport.formbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.ratp.transport.dao.model.Ligne;
import com.ratp.transport.service.interfaces.IManagementService;

@ManagedBean(name = "ligneFormBean")
public class LigneFormBean {

	@ManagedProperty(value = "#{managementService}")
	private IManagementService managementService;

	private List<Ligne> lignes;

	public IManagementService getManagementService() {
		return managementService;
	}

	public void setManagementService(IManagementService managementService) {
		this.managementService = managementService;
	}
	
	public List<Ligne> getLignes() {
		lignes = managementService.getAllLignes();
		return lignes;
	}


}
