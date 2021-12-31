package com.ecoalis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecoalis.dao.DemandeCongeDao;
import com.ecoalis.model.DemandeConge;


public class DemandeCongeServiceImpl implements com.ecoalis.service.DemandeCongeService {

   @Autowired
   private DemandeCongeDao demandeCongeDao;

   public DemandeConge getDemandeEnCours() {
      return demandeCongeDao.getDemandeEnCours();
   }

}
