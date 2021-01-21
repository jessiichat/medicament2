package com.ecolepratique.medicament2.repository;

import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecolepratique.medicament2.entite.Medicament;

public interface MedicamentRepositoryItf {
	Medicament save(Medicament medicament);
	List<Medicament> findAll();
	Medicament findById(Long numDepotLegal);
	Medicament deleteById(Long numDepotLegal);
}
