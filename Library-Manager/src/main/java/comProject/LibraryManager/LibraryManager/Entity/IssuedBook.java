package comProject.LibraryManager.LibraryManager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "issued_book")
public  class IssuedBook{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    @Column(name = "user_id")
//    private int userId;

    @Column(name = "book_id")
    private int bookId;

    private String status;

//    @OneToMany(cascade = CascadeType.ALL,mappedBy = "issuedBook")
////    @JoinColumn(name = "Book_id_2")
//    private List<Book> book= new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "user_book",
                joinColumns = {@JoinColumn(name = "isb")},
                inverseJoinColumns = {@JoinColumn(name = "user")}
    )
    private User user;


    public int getId() {
        return id;
    }

    public void setId(int issueid) {
        this.id = issueid;
    }

//    public int getUserId() {
//        return userId;
//    }
//
//    public void setUserId(int userId) {
//        this.userId = userId;
//    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookid) {
        this.bookId = bookid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }

    public IssuedBook() {
    }

    public IssuedBook(int bookId, String status) {
        this.bookId = bookId;
        this.status = status;
    }

//    public IssuedBook(int bookId, String status, Book book) {
//        this.bookId = bookId;
//        this.status = status;
//        this.book =book;
//    }

//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }


//    public List<Book> getBook() {
//        return book;
//    }
//
//    public void setBook(List<Book> book) {
//        this.book = book;
//    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
