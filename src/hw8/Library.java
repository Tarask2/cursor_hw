package hw8;

import java.time.LocalDate;
import java.util.*;

public class Library {
    private Map<LocalDate, String> libraryReport = new HashMap<>();


    public void takeBook(LocalDate date, String bookName) {
        this.libraryReport.put(date, bookName);
    }

    public void searchBook(LocalDate date) {
        if (libraryReport.get(date) == null) {
            System.out.println("There are not books for this date");
        } else {
            libraryReport.get(date);
        }
    }

    public Collection<String> bookList() {
        return libraryReport.values();

    }

    public List<String> getBooksName() {
        return new ArrayList<>(libraryReport.values());
    }

    public ArrayList<LocalDate> getBooksDate() {
        return new ArrayList<LocalDate>(libraryReport.keySet());
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryReport=" + libraryReport +
                '}';
    }
}
