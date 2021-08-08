// Book recoded for public access.
package bookpack;

// class Book is part of bookpack
public class Book {
    private String title;
    private String author;
    private int pubDate;

    // Now public.
    public Book(String t, String a, int d) {
        title = t; 
        author = a;
        pubDate = d;
    }

    // Now public
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}