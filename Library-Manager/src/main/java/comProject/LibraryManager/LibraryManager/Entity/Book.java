package comProject.LibraryManager.LibraryManager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookid;

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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id_copy")
    private List<IssuedBook> issuedBook= new ArrayList<>();

    public int getId() {
        return bookid;
    }

    public void setId(int bookid) {
        this.bookid = bookid;
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
        this.bookid = bookid;
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

    // for onetoone mapping
//    public IssuedBook getIssuedBook() {
//        return issuedBook;
//    }
//
//    public void setIssuedBook(IssuedBook issuedBook) {
//        this.issuedBook = issuedBook;
//    }


    public List<IssuedBook> getIssuedBook() {
        return issuedBook;
    }

    public void setIssuedBook(List<IssuedBook> issuedBook) {
        this.issuedBook = issuedBook;
    }
}
