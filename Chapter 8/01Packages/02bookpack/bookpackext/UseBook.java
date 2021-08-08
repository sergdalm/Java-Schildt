// This class is in package bookpackext.
package bookpackext;

// Use the Book class from bookpack.
class UseBook {
    public static void main(String args[]) {
        bookpack.Book books[] = new bookpack.Book[5];

        books[0] = new bookpack.Book("Java: A Beginner's Guide",
            "Schildt", 2014);
        books[1] = new bookpack.Book("Java: The Complete Reference",
            "Schildt", 2014);
        books[2] = new bookpack.Book("The Art of Java",
            "Schildt and Holmes", 2003);
        books[3] = new bookpack.Book("Red Storm Rising",
            "Clancy", 1986);
        books[4] = new bookpack.Book("On the Road",
            "Kerouac", 1955);

        for(int i = 0; i < books.length; i++) books[i].show();
    }
}