package config;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository extends AbstractRepository<Book>{
	
	public BookRepository(){
		super(Book.class);
	}
	
//	@PersistenceContext(type=PersistenceContextType.EXTENDED)
//	EntityManager em;
//
//	protected Session getSession() {
//		return em.unwrap(Session.class);
//	}
//
//	public void persist(Object entity) {
//		em.persist(em.merge(entity));
//	}
	
//	public List<Book> getAll(){
//		TypedQuery<Book> query = em.createQuery("select b "+
//				"from Book b ",Book.class);
//		List<Book> books = query.getResultList();
//		return books;
//	}
	
//	public Book getBookById(Integer idBook){
//		return em.find(Book.class,idBook);
//	}
//	
//	public void deleteBook(Book b){
//		em.remove(em.contains(b) ? b : em.merge(b));
//	}
//	
//	public Book addBook(Book b){
//		em.persist(b);
//		return b;
//	}
//	
//	public Book updateBook(Book b){
//		em.merge(b);
//		return b;
//	}

}
