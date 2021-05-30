package comProject.LibraryManager.LibraryManager.Entity;

import javax.persistence.*;

@Entity
@Table(name = "issued_book")
public  class IssuedBook{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int issueid;

//    @Column(name = "user_id")
//    private int userId;

    @Column(name = "book_id")
    private int bookId;

    private String status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id_copy")
    private Book book;


    public int getId() {
        return issueid;
    }

    public void setId(int issueid) {
        this.issueid = issueid;
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

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
