package com.ecolepratique.medicament2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecolepratique.medicament2.entite.Medicament;
import com.ecolepratique.medicament2.repository.MedicamentRepositoryItf;

@Service
public class MedicamentService implements MedicamentServiceItf {
	@Autowired
	private MedicamentRepositoryItf medicamentRepository;
	
	@Override
	public List<Medicament> list() {
		return medicamentRepository.findAll();
	}
	@Override
	public Medicament create(Medicament medicament) {
		return medicamentRepository.save(medicament);
	}
	@Override
	public Medicament getByNumDepotLegal(Long numDepotLegal) {
		return medicamentRepository.findById(numDepotLegal);
	}
	@Override
	public Medicament deleteByNumDepotLegal(Long numDepotLegal) {
		return medicamentRepository.deleteById(numDepotLegal);
	}
	@Override
	public Medicament updateByNumDepotLegal(Long numDepotLegal, Medicament medicament) {
		medicament.setNumDepotLegal(numDepotLegal);
		return medicamentRepository.save(medicament);
	}
	
}
