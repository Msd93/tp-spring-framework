package com.ecoalis;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecoalis.service.DemandeCongeService;

public class TP3 {
    
	@Autowired
	private DemandeCongeService demandeCongeService;

	public TP3() {
		System.out.println(demandeCongeService.getDemandeEnCours());
	}

	private void go() {
		System.out.println(demandeCongeService.getDemandeEnCours());
	}

}
