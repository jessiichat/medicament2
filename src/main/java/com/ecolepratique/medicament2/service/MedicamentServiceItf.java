package com.ecolepratique.medicament2.service;

import java.util.List;
import com.ecolepratique.medicament2.entite.Medicament;

public interface MedicamentServiceItf {
	Medicament create(Medicament medicament);
	List<Medicament> list();
	Medicament getByNumDepotLegal(Long numDepotLegal);
	Medicament deleteByNumDepotLegal(Long numDepotLegal);
	Medicament updateByNumDepotLegal(Long numDepotLegal, Medicament medicament);
}
