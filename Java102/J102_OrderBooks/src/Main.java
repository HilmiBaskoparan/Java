import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book a1 = new Book("The Great Gatsby", 400, "F. Scott Fitzgerald", 1990);
        Book a2 = new Book("In Search of Lost Time by", 500, "Marcel Proust", 1995);
        Book a3 = new Book("Ulysses", 100, "James Joyce", 1980);
        Book a4 = new Book("Don Quixote", 200, "Miguel de Cervantes", 1975);
        Book a5 = new Book("Moby Dick", 300, "Herman Melville", 1985);

        Set<Book> set = new TreeSet<>();
        set.add(a1);
        set.add(a2);
        set.add(a3);
        set.add(a4);
        set.add(a5);

        System.out.println("********** ORDER BY NAME **********");
        for (Book b : set) {
            System.out.println(b.getPageNumber() + "\t" + b.getBookName());
        }

        // ORDER BY PAGE SIZE
        Comparator<Book> comp = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber() - o2.getPageNumber();
            }
        };

        Set<Book> set2 = new TreeSet<>(comp);
        set2.add(a1);
        set2.add(a2);
        set2.add(a3);
        set2.add(a4);
        set2.add(a5);

        System.out.println("\n********** ORDER BY PAGE SIZE **********");
        for (Book b : set2) {
            System.out.println(b.getPageNumber() + "\t" + b.getBookName());
        }

        // Create with PriorityQueue
        PriorityQueue<Book> pq = new PriorityQueue<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });

        pq.add(a1);
        pq.add(a2);
        pq.add(a3);
        pq.add(a4);
        pq.add(a5);

        System.out.println("\n********** ORDER BY PAGE AUTHOR NAME**********");
        for (Book b : pq) {
            System.out.println(b.getAuthor() + " " + b.getBookName() + " " + b.getPageNumber());
        }

    }
}