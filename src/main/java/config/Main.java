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
		/* *** crer un livre *** */
		Book b =new Book();
		b.setTitle("Un Livre génial");
		b.setAuthor("Un autheur méconnu");
		b.setNbPages(254L);
		b.setDatePubli(new Date());
		b.setId(22);
		repo.addBook(b);
		/* ********************* */
		/* *** afficher le livre ayant un certain id *** */
		//System.out.println(repo.);
	}

}
