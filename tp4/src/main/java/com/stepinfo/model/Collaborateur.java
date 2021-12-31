package com.stepinfo.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Collaborateur {

   private String nom;
   private String prenom;
   
   public Collaborateur() {
   }
   
   public Collaborateur(String nom, String prenom) {
      super();
      this.nom = nom;
      this.prenom = prenom;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getPrenom() {
      return prenom;
   }

   public void setPrenom(String prenom) {
      this.prenom = prenom;
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }
}
