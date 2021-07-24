package br.edu.ifgoias.sistemaacademico.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.edu.ifgoias.sistemaacademico.entities.Curso;
import br.edu.ifgoias.sistemaacademico.repository.CursoRepository;

@Configuration
public class Config implements CommandLineRunner{

	@Autowired
	private CursoRepository cursoRep ;
	
	@Override
	public void run(String... args) throws Exception {
		
		//Curso c1 = new Curso(null, "Curso Teste3");
		//Curso c2 = new Curso(null, "Curso Teste4");
		//cursoRep.saveAll(Arrays.asList(c1,c2));
	}

}
