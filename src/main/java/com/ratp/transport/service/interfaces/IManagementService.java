package com.ratp.transport.service.interfaces;

import java.util.List;

import com.ratp.transport.dao.model.Ligne;

public interface IManagementService {
	public List<Ligne> getAllLignes();
}
