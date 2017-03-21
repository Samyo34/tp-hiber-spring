package config;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.transaction.annotation.Transactional;

@Entity
@Table(name="book")
@Transactional
public class Book {
	
	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY) private Integer id;
	@Column	private String title;
	@Column	private String author;
	@Column(name="nb_pages") private Long nbPages;
	@Column(name="publication_date") @Temporal(TemporalType.DATE)private Date datePubli;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Long getNbPages() {
		return nbPages;
	}
	public void setNbPages(Long nbPages) {
		this.nbPages = nbPages;
	}
	public Date getDatePubli() {
		return datePubli;
	}
	public void setDatePubli(Date datePubli) {
		this.datePubli = datePubli;
	}
	public String toString(){
		return "["+this.id+","+this.title+","+this.author+","+this.nbPages+","+this.datePubli+"]";
	}

}
