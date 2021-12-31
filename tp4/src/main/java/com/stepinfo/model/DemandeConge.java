package com.stepinfo.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DemandeConge {

   @Autowired
   private Collaborateur collaborateur;
   @Autowired
   private Periode periode;
   private int numero;

   public DemandeConge(Collaborateur collaborateur, Periode periode, int numero) {
      super();
      this.collaborateur = collaborateur;
      this.periode = periode;
      this.numero = numero;
   }

   public Collaborateur getCollaborateur() {
      return collaborateur;
   }

   public Periode getPeriode() {
      return periode;
   }

   public int getNumero() {
      return numero;
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }

}
