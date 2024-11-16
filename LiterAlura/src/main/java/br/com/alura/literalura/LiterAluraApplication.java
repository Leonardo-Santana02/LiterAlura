package br.com.alura.literalura;

import br.com.alura.literalura.principal.Principal;
import br.com.alura.literalura.repository.iAutorRepository;
import br.com.alura.literalura.repository.iLivrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraApplication implements CommandLineRunner {
	@Autowired
	private iLivrosRepository livrosRepositorio;

	@Autowired
	private iAutorRepository autorRepositorio;


	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Instanciando a classe Principal com os repositórios gerenciados pelo Spring
		Principal principal = new Principal(livrosRepositorio, autorRepositorio);
		// Exibe o menu da aplicação
		principal.exibeMenu();
	}
}
