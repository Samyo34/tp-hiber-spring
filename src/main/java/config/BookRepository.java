package config;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
@Transactional
public class BookRepository {
	
	@PersistenceContext(type=PersistenceContextType.EXTENDED)
	EntityManager em;

	protected Session getSession() {
		return em.unwrap(Session.class);
	}

	public void persist(Object entity) {
		em.persist(em.merge(entity));
	}
	
	public List<Book> getAll(){
		TypedQuery<Book> query = em.createQuery("select b "+
				"from Book b ",Book.class);
		List<Book> books = query.getResultList();
		return books;
	}
	
	public Book getBookById(Integer idBook){
		return em.find(Book.class,idBook);
	}
	
	public void deleteBook(Book b){
		em.remove(em.contains(b) ? b : em.merge(b));
	}
	
	public void addBook(Book b){
		em.persist(em.contains(b) ? b : em.merge(b));
	}
	
	public void updateBook(Book b){
		em.merge(b);
	}

}
