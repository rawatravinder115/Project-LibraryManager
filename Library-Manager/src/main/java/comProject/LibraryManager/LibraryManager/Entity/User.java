package comProject.LibraryManager.LibraryManager.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private  String name;
    private  String dept;
    private  int year;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<IssuedBook> isb= new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<IssuedBook> getIsb() {
        return isb;
    }

    public void setIsb(List<IssuedBook> isb) {
        this.isb = isb;
    }

    public User() {
    }

    public User(String name, String dept, int year, List<IssuedBook> isb) {
        this.name = name;
        this.dept = dept;
        this.year = year;
        this.isb = isb;
    }

    public User(String name, String dept, int year) {
        this.name = name;
        this.dept = dept;
        this.year = year;
    }
}
