import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


// Code Logic
public class LibraryManagement {
    private ArrayList<String> books;

    public LibraryManagement() {
        books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
    }

    public void addBooks(ArrayList<String> newBooks) {
        books.addAll(newBooks);
    }

    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeBook(String book) {
        if (books.remove(book)) {
            System.out.println("Removed: " + book);
        } else {
            System.out.println("Book not found.");
        }
    }

    public boolean searchBook(String book) {
        return books.contains(book);
    }

    public void updateBook(int index, String newBook) {
        if (index >= 0 && index < books.size()) {
            books.set(index, newBook);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public int totalBooks() {
        return books.size();
    }

    public void sortBooks() {
        Collections.sort(books);
    }

    public void displayBooks() {
        System.out.println("Available Books:");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        Scanner scanner = new Scanner(System.in);

        //Taken As Example

        library.addBook("The Great Gatsby");
        library.addBook("1984");
        
        ArrayList<String> bulkBooks = new ArrayList<>();
        bulkBooks.add("To Kill a Mockingbird");
        bulkBooks.add("Moby Dick");
        
        library.addBooks(bulkBooks);
        
        library.displayBooks();
        
        library.sortBooks();
        
        System.out.println("\nAfter sorting:");
        library.displayBooks();
        
        System.out.println("\nTotal Books: " + library.totalBooks());
        
        library.removeBook(1); // Remove by index
        library.removeBook("Moby Dick"); // Remove by object
        
        System.out.println("\nAfter removals:");
        library.displayBooks();
        
        scanner.close();
    }
}


/* OUTPUT
 Available Books:
The Great Gatsby
1984
To Kill a Mockingbird
Moby Dick

After sorting:
Available Books:
1984
Moby Dick
The Great Gatsby
To Kill a Mockingbird

Total Books: 4
Book not found.

After removals:
Available Books:
1984
The Great Gatsby
To Kill a Mockingbird
 */
