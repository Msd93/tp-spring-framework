package com.stepinfo.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.stepinfo.model.Collaborateur;
import com.stepinfo.model.DemandeConge;
import com.stepinfo.model.Periode;

@Service
public class DemandeCongeServiceMock2 implements ApplicationContextAware {

   private ApplicationContext applicationContext;

   public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
      this.applicationContext = applicationContext;
   }
   
   public DemandeConge getDemandeCongeFromContext(int ddcId) {
      Collaborateur collaborateur = (Collaborateur)applicationContext.getBean("c");
      Periode periode = (Periode)applicationContext.getBean("p");
      DemandeConge demandeConge = new DemandeConge(collaborateur, periode, ddcId * 17);

      return demandeConge;
   }
}
