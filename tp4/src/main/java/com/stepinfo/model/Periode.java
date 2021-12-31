package com.stepinfo.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Periode {

   private String dateDebut;
   private int nbJours;

   public Periode() {
   }
   
   public Periode(String dateDebut, int nbJours) {
      super();
      this.dateDebut = dateDebut;
      this.nbJours = nbJours;
   }

   public String getDateDebut() {
      return dateDebut;
   }

   public void setDateDebut(String dateDebut) {
      this.dateDebut = dateDebut;
   }

   public int getNbJours() {
      return nbJours;
   }

   public void setNbJours(int nbJours) {
      this.nbJours = nbJours;
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }

}
