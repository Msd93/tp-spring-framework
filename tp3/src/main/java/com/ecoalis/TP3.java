package com.ecoalis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TP3 {

   public TP3() {

   }

   private void go() {
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

     // DemandeCongeService demandeCongeService = (DemandeCongeService) context.getBean("demandeCongeServiceImpl");

    //  System.out.println(demandeCongeService.getDemandeEnCours());
   }

   public static void main(String[] args) {
      new TP3().go();
   }
}
