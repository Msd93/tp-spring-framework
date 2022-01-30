package com.ecoalis.dao.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ecoalis.dao.DemandeCongeDao;
import com.ecoalis.model.DemandeConge;

@Component
public class DemandeCongeDaoImpl implements DemandeCongeDao {

	public DemandeConge getDemandeEnCours() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DemandeConge demandeConge = (DemandeConge) context.getBean("demandeConge");
		return demandeConge;
	}

}
