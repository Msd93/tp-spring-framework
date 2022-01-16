package com.ecoalis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ecoalis.model.DemandeConge;
import com.ecoalis.model.DemandeCongeByName;
import com.ecoalis.model.DemandeCongeSansModificateurs;

public class TP2 {

	public TP2() {

	}

	private void go() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println(
				" \n ----------------------------  \n Injection par type \n ----------------------------  \n ");
		DemandeConge demandeConge = (DemandeConge) context.getBean("demandeConge");
		System.out.println(demandeConge);

		System.out.println(
				" \n ----------------------------  \n Injection par constructeur \n ---------------------------- \n ");
		DemandeCongeSansModificateurs d = (DemandeCongeSansModificateurs) context
				.getBean("demandeCongeSansModificateurs");
		System.out.println(d);

		System.out
				.println(" \n ----------------------------  \n Injection par nom \n ---------------------------- \n ");
		DemandeCongeByName demandeCongeByName = (DemandeCongeByName) context.getBean("demandeCongeByName");
		System.out.println(demandeCongeByName);

	}

	public static void main(String[] args) {
		new TP2().go();
	}
}
