package com.thorben.janssen.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.thorben.janssen.config.JpaConfig;
import com.thorben.janssen.entity.Author;
import com.thorben.janssen.entity.Book;
import com.thorben.janssen.repositories.AuthorRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {JpaConfig.class }, loader =  AnnotationConfigContextLoader.class)
@TestMethodOrder(OrderAnnotation.class)
class SpringDataJpaTest {
	
	@Autowired
	AuthorRepository authorRepo;

	@Test
	@Order(1)
	void testContextLoad() {
		
	}
	
	@Test
	@Order(2)
	void testSaveAuthor() {
		Author author = new Author();
		author.setFirstName("Thorben");
		author.setLastName("Janssen");
		
		Book book = new Book();
		book.setTitle("Hibernate Tips");
		book.setAuthor(author);
		author.getBooks().add(book);
		
		authorRepo.save(author);
		
		long count = authorRepo.count();
		assertEquals(1, count);
	}
	
	@Test
	@Order(3)
	void testGetAllAuthors() {
		List<Author> authors = (List<Author>) authorRepo.findAll();
		assertNotNull(authors);
		assertEquals(1, authors.size());
	}
	
	@Test
	@Order(4)
	void testFindAuthorById() {
		long id = 1;
		Optional<Author> author = authorRepo.findById(id);
		assertTrue(author.isPresent());
		assertEquals("Janssen", author.get().getLastName());
	}
	
	@Transactional
	@Test
	@Order(5)
	public void testDeleteAuthorById() {
		long id = 1;
		Author author = authorRepo.findById(id).get();
		authorRepo.delete(author);
		authorRepo.flush();
		
//		authorRepo.deleteAll();
//		authorRepo.flush();
	}
	
	@Test
	@Order(6)
	void testAuthorNotFoundById() {
		long count = authorRepo.count();
		assertEquals(0, count);
	}
	
	
}