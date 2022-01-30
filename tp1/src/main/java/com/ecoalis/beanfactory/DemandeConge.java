package com.ecoalis.beanfactory;

public class DemandeConge {
	private  String name;
	private String value;
	public DemandeConge() {
		super();
	}
	public DemandeConge(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		StringBuilder stringBuilder =  new StringBuilder();
		return stringBuilder.append("[ Demande CONGE ] : ").append(name).append(" est admis à prendre son ").append(value).toString();
	}
}
