package fr.mbenfredj.ratp.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import fr.mbenfredj.ratp.entity.Ligne;
import fr.mbenfredj.ratp.service.IManagementService;

@ManagedBean(name = "homeControllerBean")
public class HomeControllerBean {

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
