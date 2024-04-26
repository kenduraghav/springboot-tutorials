package com.thorben.janssen.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book-sequence-generator")
	@SequenceGenerator(name = "book-sequence-generator", sequenceName = "book_sequence")
	private long id;
	
	private String title;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Author author;
	
	@Version
	private long version;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public long getVersion() {
		return version;
	}
	
	

}
