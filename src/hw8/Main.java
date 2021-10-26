package hw8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();


        library.takeBook(LocalDate.of(2021, 10, 25), "Java. Move your head!");
        library.takeBook(LocalDate.of(2021, 10, 5), "Shantaram");
        library.takeBook(LocalDate.of(2021, 10, 2), "Billi Miligano");
        library.takeBook(LocalDate.of(2021, 10, 13), "Java. Efficient programming");
        library.takeBook(LocalDate.of(2021, 10, 16), "Developer Compendium");

        System.out.println("Search books by dates:");
        library.searchBook(LocalDate.of(2021, 10, 14));
        library.searchBook(LocalDate.of(2021, 10, 25));
        library.searchBook(LocalDate.of(2021, 10, 2));

        System.out.println(library.bookList());

        System.out.println("Books to return: " + library.getBooksName());
        System.out.println("Date to return: " + library.getBooksDate());


    }
}
