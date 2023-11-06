package poo.grupo5.trabalho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrabalhoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrabalhoApplication.class, args);
	}
}
// Organização do projeto
// Entity: As classes que vão servir de base para criar as tabelas no banco
// Controller: As classes que vão definir as rotas e a resolução das mesmas
// Service: Classe responsavel pelas regras de negocio e manipulação do banco
// Repository: Classe responsavel por fazer as queryes do banco para cada Entity

// Problemas com link:
// https://www.masterspringboot.com/data-access/jpa-applications/how-to-get-your-tables-automatically-created-with-spring-boot/#google_vignette

// https://www.youtube.com/watch?v=CvDS6DltIno