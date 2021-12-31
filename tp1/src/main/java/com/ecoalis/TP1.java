package com.ecoalis;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.ecoalis.model.DemandeConge;

public class TP1 {

   public TP1() {

   }

   private void go() {
	    Resource res = new ClassPathResource("applicationContext.xml");
	    BeanFactory factory = new XmlBeanFactory(res);
	    DemandeConge demandeConge = (DemandeConge) factory.getBean("demandeConge");
	    System.out.println(demandeConge.toString());
   }

   public static void main(String[] args) {
      new TP1().go();
   }
}
