package com.ecolepratique.medicament2.entite;

import java.util.ArrayList;
import java.util.List;

public class Medicament {
	private Long numDepotLegal;
	private String nomCommercial;
	private List<String> effets;
	private List<String> contreIndications;
	public Medicament() {
		effets = new ArrayList<>();
		contreIndications = new ArrayList<>();
	}
	public Medicament(Long numDepotLegal, String nomCommercial) {
		this();
		this.numDepotLegal = numDepotLegal;
		this.nomCommercial = nomCommercial;
	}
	public Medicament(Long numDepotLegal, String nomCommercial, List<String> effets, List<String> contreIndications) {
		this.numDepotLegal = numDepotLegal;
		this.nomCommercial = nomCommercial;
		this.effets = effets;
		this.contreIndications = contreIndications;
	}
	@Override
	public String toString() {
		return "Medicament [numDepotLegal=" + numDepotLegal + ", nomCommercial=" + nomCommercial + ", effets=" + effets
				+ ", contreIndications=" + contreIndications + "]\n\n";
	}
	public void addEffet(String effet) {
		effets.add(effet);
	}
	public void addContreIndication(String contreIndication) {
		contreIndications.add(contreIndication);
	}
	public Long getNumDepotLegal() {
		return numDepotLegal;
	}
	public void setNumDepotLegal(Long numDepotLegal) {
		this.numDepotLegal = numDepotLegal;
	}
	public String getNomCommercial() {
		return nomCommercial;
	}
	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}
	public List<String> getEffets() {
		return effets;
	}
	public void setEffets(List<String> effets) {
		this.effets = effets;
	}
	public List<String> getContreIndications() {
		return contreIndications;
	}
	public void setContreIndications(List<String> contreIndications) {
		this.contreIndications = contreIndications;
	}	
}
