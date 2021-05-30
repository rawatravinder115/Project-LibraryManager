package comProject.LibraryManager.LibraryManager.Repository;

import comProject.LibraryManager.LibraryManager.Entity.IssuedBook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IssuedBookRepository extends JpaRepository<IssuedBook,Integer> {

}
