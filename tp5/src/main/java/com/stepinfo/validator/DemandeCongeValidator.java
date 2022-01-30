package com.stepinfo.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.stepinfo.model.DemandeConge;

public class DemandeCongeValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		return DemandeConge.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dateDebut", "demandeConge.periode.dateDebut.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nbJours", "demandeConge.periode.nbJours.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "prenom", "demandeConge.collaborateur.prenom.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nom", "demandeConge.collaborateur.nom.required");

		DemandeConge demandeConge = (DemandeConge) target;

		if (demandeConge.getPeriode().getNbJours() == 0) {
			errors.rejectValue("nbJours", "Le nbre de jours doit être superieur à 0");
		}

	}

}
