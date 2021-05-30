package comProject.LibraryManager.LibraryManager.Repository;

import comProject.LibraryManager.LibraryManager.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
