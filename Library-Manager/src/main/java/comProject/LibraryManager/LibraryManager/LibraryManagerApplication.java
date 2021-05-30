package comProject.LibraryManager.LibraryManager;

import comProject.LibraryManager.LibraryManager.Entity.Book;
import comProject.LibraryManager.LibraryManager.Entity.IssuedBook;
import comProject.LibraryManager.LibraryManager.Entity.User;
import comProject.LibraryManager.LibraryManager.Repository.BookRepository;
import comProject.LibraryManager.LibraryManager.Repository.IssuedBookRepository;
import comProject.LibraryManager.LibraryManager.Repository.UserRepository;
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
	private BookRepository bookRepository;

	@Autowired
	private IssuedBookRepository issuedBookRepository;

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

//=============================================================================

		List<IssuedBook> isb= new ArrayList<>();
//
		IssuedBook is1=new IssuedBook(1,"issued");
		IssuedBook is2=new IssuedBook(2,"not issued");
		IssuedBook is3=new IssuedBook(3,"issued");

		List<User> u =new ArrayList<>();

		User u1=new User("ravi","cs",2);
		User u2=new User("kavi","cs",3);
		User u3=new User("savi","cs",1);
//		User u4=new User("navi","cs",2);

		is1.setUser(u1);
		is2.setUser(u2);
		is3.setUser(u3);

		u1.getIsb().add(is1);
		u1.getIsb().add(is2);
		u2.getIsb().add(is2);
		u2.getIsb().add(is3);
		u3.getIsb().add(is2);
//		u4.getIsb().add(is3);

		isb.add(is1);
		isb.add(is2);
		isb.add(is3);

		issuedBookRepository.saveAll(isb);

		u.add(u1);
		u.add(u2);
		u.add(u3);
//		u.add(u4);

		userRepository.saveAll(u);

	}
}
