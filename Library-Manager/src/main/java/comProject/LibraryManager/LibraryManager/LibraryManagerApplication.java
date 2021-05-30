package comProject.LibraryManager.LibraryManager;

import comProject.LibraryManager.LibraryManager.Entity.Book;
import comProject.LibraryManager.LibraryManager.Entity.IssuedBook;
import comProject.LibraryManager.LibraryManager.Repository.BookRepository;
import comProject.LibraryManager.LibraryManager.Repository.IssuedBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LibraryManagerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagerApplication.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Autowired
	IssuedBookRepository issuedBookRepository;

	@Override
	public void run(String... args) throws Exception {

		List<Book> books = new ArrayList<>();

		Book b1 = new Book("java","ravinder","cs");
		Book b2 = new Book("general Studies","ravi","ias");
		Book b3 = new Book("accountancy","kundan ","account");
		Book b4 = new Book("Maths Guru ","RD Sharma","maths");
		Book b5 = new Book("love cpp","pranshu");
		Book b6 = new Book("love javascript","rishu");

		List<IssuedBook> isb= new ArrayList<>();

		IssuedBook is1=new IssuedBook(1,"issued");
		IssuedBook is2=new IssuedBook(1,"not issued");
		IssuedBook is3=new IssuedBook(3,"issued");
		IssuedBook is4=new IssuedBook(3,"not issued");
		IssuedBook is5 = new IssuedBook(5,"not Issued");
		IssuedBook is6 = new IssuedBook(6," Issued");


//		for onetoone mapping

//		b1.setIssuedBook(is1);
//		b2.setIssuedBook(is2);
//		b3.setIssuedBook(is3);
//		b4.setIssuedBook(is4);
//		b5.setIssuedBook(is5);
//		b6.setIssuedBook(is6);

//		is1.setBook(b1);
//		is2.setBook(b2);
//		is3.setBook(b3);
//		is4.setBook(b4);
//		is5.setBook(b5);
//		is6.setBook(b6);


		// for onetomany mapping

		b1.getIssuedBook().add(is1);
		b2.getIssuedBook().add(is2);
		b3.getIssuedBook().add(is3);
		b4.getIssuedBook().add(is4);
		b5.getIssuedBook().add(is5);
		b6.getIssuedBook().add(is6);

		is1.setBook(b1);
		is2.setBook(b1);
		is3.setBook(b3);
		is4.setBook(b4);
		is5.setBook(b4);
		is6.setBook(b6);


		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		books.add(b5);
		books.add(b6);

//		bookRepository.save(b5);
//		bookRepository.save(b6);

		bookRepository.saveAll(books);
//



//		isb.add(is1);
//		isb.add(is2);
//		isb.add(is3);
//		isb.add(is4);
//		isb.add(is5);
//		isb.add(is6);

		issuedBookRepository.saveAll(isb);

	}
}
