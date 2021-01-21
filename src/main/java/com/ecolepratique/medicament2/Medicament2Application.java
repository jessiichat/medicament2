package com.ecolepratique.medicament2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ecolepratique.medicament2.entite.Medicament;
import com.ecolepratique.medicament2.service.MedicamentServiceItf;

@SpringBootApplication
public class Medicament2Application {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Medicament2Application.class, args);
		MedicamentServiceItf medicamentService = ctx.getBean(MedicamentServiceItf.class);
		
		Medicament medicament1 = new Medicament(12468L, "LEVOTHYROX"); 
		Medicament medicament2 = new Medicament(14680L, "TAHOR"); 
		Medicament medicament3 = new Medicament(24682L, "HELICIDINE"); 
		Medicament medicament4 = new Medicament(80642L, "ANTARENE"); 
		
		medicament1.addEffet("Nausées");
		medicament1.addEffet("Maux de tête");
		medicament1.addEffet("Démangeaisons");
		medicament1.addContreIndication("Gentamicine");
		medicament1.addContreIndication("Halofantrine");
		
		medicament2.addEffet("Somnolence");
		medicament2.addEffet("Diarrhée");
		medicament2.addContreIndication("Lincomycine");
		medicament2.addContreIndication("Pindolol");
		
		medicament3.addEffet("Vision floue");
		medicament3.addEffet("Fatigue");
		medicament3.addContreIndication("Propafénone");
		medicament3.addContreIndication("Quinine");
		
		medicament4.addEffet("Somnolence");
		medicament4.addEffet("Vision floue");
		medicament4.addEffet("Eruption cutanée");
		medicament4.addContreIndication("Halofantrine");
		medicament4.addContreIndication("Pindolol");
		medicament4.addContreIndication("Quinine");
		
		medicamentService.create(medicament1);
		medicamentService.create(medicament2);
		medicamentService.create(medicament3);
		medicamentService.create(medicament4);
		
		System.out.println(medicamentService.list());
	}

}
