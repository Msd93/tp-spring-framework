package com.ecoalis.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class DemandeCongeByName {

	private Collaborateur collaborateur;
	private Periode periode;

	public Collaborateur getCollaborateur() {
		return collaborateur;
	}
	public void setCollaborateur(Collaborateur collaborateur) {
		this.collaborateur = collaborateur;
	}
	public Periode getPeriode() {
		return periode;
	}
	public void setPeriode(Periode periode) {
		this.periode = periode;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
