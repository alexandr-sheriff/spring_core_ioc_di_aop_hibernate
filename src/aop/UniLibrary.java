package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    //    @Override
    public void getBook() {
        System.out.println("We are get book from UniLibrary");
        System.out.println("-------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We are add book from UniLibrary");
        System.out.println("-------------------------------");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("We are return book in UniLibrary");
        return "The War of Powers";
    }

    public void getMagazine() {
        System.out.println("We are get magazine from UniLibrary");
        System.out.println("-------------------------------");
    }

    public void addMagazine() {
        System.out.println("We are add magazine from UniLibrary");
        System.out.println("-------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We are return magazine in UniLibrary");
        System.out.println("-------------------------------");
    }
}
