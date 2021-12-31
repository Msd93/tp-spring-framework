package com.ecoalis.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class DemandeConge {

   @Autowired
   private Collaborateur collaborateur;
   @Autowired
   private Periode periode;

   public Collaborateur getCollaborateur() {
      return collaborateur;
   }

   public Periode getPeriode() {
      return periode;
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }

}
