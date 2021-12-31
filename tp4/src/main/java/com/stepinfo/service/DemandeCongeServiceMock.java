package com.stepinfo.service;

import com.stepinfo.model.Collaborateur;
import com.stepinfo.model.DemandeConge;
import com.stepinfo.model.Periode;

public class DemandeCongeServiceMock {

   public DemandeConge getDemandeConge(int ddcId) {
      Collaborateur collaborateur = new Collaborateur("Doe", "John");
      Periode periode = new Periode((int) (Math.random() * 30 + 1) + "/04/2010", (int) (Math.random() * 5 + 1));
      DemandeConge demandeConge = new DemandeConge(collaborateur, periode, ddcId * 17);

      return demandeConge;
   }
}
