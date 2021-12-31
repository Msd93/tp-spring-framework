package com.ecoalis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ecoalis.model.DemandeConge;
import com.ecoalis.model.DemandeCongeSansModificateurs;

public class TP2 {

   public TP2() {

   }

   private void go() {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

      DemandeConge demandeConge = (DemandeConge) context.getBean("demandeConge");

      System.out.println(demandeConge);

      DemandeConge demandeConge2 = (DemandeConge) context.getBean("demandeConge");

      System.out.println(demandeConge2);

      DemandeCongeSansModificateurs d = (DemandeCongeSansModificateurs) context
               .getBean("demandeCongeSansModificateurs");
      System.out.println(d);
   }

   public static void main(String[] args) {
      new TP2().go();
   }
}
