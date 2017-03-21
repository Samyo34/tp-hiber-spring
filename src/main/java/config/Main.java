package config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		BookRepository repo = context.getBean(BookRepository.class);
		System.out.println(repo.getAll());
	}

}
