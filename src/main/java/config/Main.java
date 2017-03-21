package config;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		BookRepository repo = context.getBean(BookRepository.class);
		
		/* *** afficher tout les livre de la table *** */
		System.out.println(repo.getAll());
		/* ****************************************** */
		
		/* *** creer un livre *** */
		Book b =new Book();
		b.setTitle("Un Livre génial 12");
		b.setAuthor("Un autheur méconnu");
		b.setNbPages(254L);
		b.setDatePubli(new Date());
		b = repo.addBook(b);
		System.out.println("Livre ajouté : "+b);
		/* ************************** */
		
		/* *** Mettre à jour un livre *** */
		b.setTitle("Nouveau titre");
		b = repo.updateBook(b);
		System.out.println("Livre mis à jour : "+b);
		/* ****************************** */
		
		/* *** Supprimer un livre *** */
		repo.deleteBook(b);
		/* ********************* */
		
		/* *** afficher le livre ayant un certain id *** */
		System.out.println(repo.getBookById(21));
		/* ********************************************* */
		
	}

}
