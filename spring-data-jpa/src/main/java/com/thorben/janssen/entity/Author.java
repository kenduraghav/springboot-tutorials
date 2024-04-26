package com.thorben.janssen.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator")
	@SequenceGenerator(name = "sequence-generator", sequenceName = "author_sequence")
	private long id;

	private String firstName;

	private String lastName;

	@OneToMany(mappedBy = "author")
	private List<Book> books = new ArrayList<>();

	public Author() {
		System.out.println(">>>>>>> Author Entity");
	}

	@Version
	private long version;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Author [id=").append(id).append(", firstName=").append(firstName).append(", lastName=")
				.append(lastName).append(", version=").append(version).append("]");
		return builder.toString();
	}

	public long getVersion() {
		return version;
	}


}
