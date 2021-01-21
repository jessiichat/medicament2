package com.ecolepratique.medicament2.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.ecolepratique.medicament2.entite.Medicament;

@Repository
public class MedicamentRepository implements MedicamentRepositoryItf {
	private Map<Long, Medicament> medicaments;
	
	public MedicamentRepository() {
		medicaments = new HashMap<>();
	}
	@Override
	public Medicament save(Medicament medicament) {
		medicaments.put(medicament.getNumDepotLegal(), medicament);
		return medicament;
	}
	@Override
	public List<Medicament> findAll() {
		return new ArrayList<>(medicaments.values());
	}
	@Override
	public Medicament findById(Long numDepotLegal) {
		return medicaments.get(numDepotLegal);
	}
	@Override
	public Medicament deleteById(Long numDepotLegal) {
		return medicaments.remove(numDepotLegal);
	}
}
