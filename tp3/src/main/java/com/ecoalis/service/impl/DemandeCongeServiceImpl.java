package com.ecoalis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecoalis.dao.DemandeCongeDao;
import com.ecoalis.model.DemandeConge;
import com.ecoalis.service.DemandeCongeService;

@Component
public class DemandeCongeServiceImpl implements DemandeCongeService {
    
	@Autowired
	private DemandeCongeDao demandeCongeDao;
	
	public DemandeCongeServiceImpl(DemandeCongeDao demandeCongeDao) {
		super();
		this.demandeCongeDao = demandeCongeDao;
	}



	public DemandeConge getDemandeEnCours() {
		return demandeCongeDao.getDemandeEnCours();
	}

}
