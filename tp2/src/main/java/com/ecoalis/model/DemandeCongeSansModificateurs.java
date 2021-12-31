package com.ecoalis.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class DemandeCongeSansModificateurs {

   private Collaborateur collaborateur;
   private Periode periode;

   public DemandeCongeSansModificateurs(Collaborateur collaborateur, Periode periode) {
      this.collaborateur = collaborateur;
      this.periode = periode;
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }
}
