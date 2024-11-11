package org.example;


/**
 * A simple class which contains a method for sorting an hashMap based on values.
 *
 * <p>
 * This is a test class.
 * </p>
 *
 * @author Alin
 * @version 1.0
 */
public class App {

    public static void main(String[] args) {
        LibraryCatalog<Book> catalog = new LibraryCatalog<>();
        Book book1 = new Novel("Morometii", 150, "Fantasy");
        Book book2 = new Novel("Morometii", 140, "Fantasy");
        Book book3 = new Novel("Aln", 200, "Fantasy");
        Book book4 = new ArtAlbum("Weeding", 25, "Glossy");


        catalog.add(book1);
        catalog.add(book2);
        catalog.add(book3);
        catalog.add(book4);
        catalog.delete(book1);

        catalog.list();


    }
}
