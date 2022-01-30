package com.stepinfo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stepinfo.model.DemandeConge;
import com.stepinfo.model.TypeDdc;
import com.stepinfo.validator.DemandeCongeValidator;

@Controller
@RequestMapping("/creerDdc")
public class CreerDdcController {

	@ModelAttribute("typeDdc")
	public TypeDdc[] populateTypeDdc() {
		return TypeDdc.values();
	}

	@ModelAttribute("demandeConge")
	public DemandeConge getDdc() {
		return new DemandeConge();
	}

	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		model.addAttribute("now", new SimpleDateFormat("dd/mm/yyyy").format(new Date()));
		return "creerDdc";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(@ModelAttribute DemandeConge dc, BindingResult result) {
		DemandeCongeValidator demandeCongeValidator = new DemandeCongeValidator();
		demandeCongeValidator.validate(dc, result);

		if (result.hasErrors()) {
			System.out.println(result);
		} else {
			System.out.println(result.getObjectName());
		}
		return dc.toString();
	}
}
