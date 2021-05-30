package comProject.LibraryManager.LibraryManager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="title")
    private String title;

    @Column(name = "author")
    private  String author;

    @Column(name = "subject")
    private  String subject;

    // for onetoone mapping  bi-directional and uni-directional

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinTable(name = "book_issued",
//            joinColumns = { @JoinColumn(name = "book_id",referencedColumnName = "bookid") },
//            inverseJoinColumns = {@JoinColumn(name = "issuedBook_id",referencedColumnName = "issueid")}
//    )
//    private IssuedBook issuedBook;

//    @ManyToOne
//    @JoinTable(name = "fk_Book")
////    private List<IssuedBook> issuedBook= new ArrayList<>();
//    private IssuedBook issuedBook;

    public int getId() {
        return id;
    }

    public void setId(int bookid) {
        this.id = bookid;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }



    public Book(int bookid, String title, String author, String subject) {
        this.id = bookid;
        this.title = title;
        this.author = author;
        this.subject = subject;
    }

    public Book(String title, String author, String subject) {
        this.title = title;
        this.author = author;
        this.subject = subject;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

//    public IssuedBook getIssuedBook() {
//        return issuedBook;
//    }
//
//    public void setIssuedBook(IssuedBook issuedBook) {
//        this.issuedBook = issuedBook;
//    }


//    public List<IssuedBook> getIssuedBook() {
//        return issuedBook;
//    }
//
//    public void setIssuedBook(List<IssuedBook> issuedBook) {
//        this.issuedBook = issuedBook;
//    }

}
