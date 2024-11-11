package org.example;

import java.util.*;

/**
 * The {@code LibraryCatalog} class provides a generic catalog of books that can be added, deleted, and listed.
 * It is specifically designed to handle objects that extend the {@code Book} class.
 *
 * @param <T> the type of book in the catalog, which must extend {@code Book}
 * @version 1.0
 */
public class LibraryCatalog<T extends Book> {
    private final ArrayList<T> bookList = new ArrayList<>();

    /**
     * Adds a book to the catalog. The catalog is sorted after each addition.
     * Throws an {@code IllegalArgumentException} if the book is already present in the catalog.
     *
     * @param book the book to add to the catalog
     * @throws IllegalArgumentException if a book with the same name and number of pages already exists
     */
    public void add(T book) {
        for (T bookObj : bookList) {
            if (bookObj.getName().equals(book.getName()) && bookObj.getNumberOfPages() == book.getNumberOfPages()) {
                throw new IllegalArgumentException("Book " + book.getName() + " with number of pages: " + book.getNumberOfPages() + " is already in the library");
            }
        }
        bookList.add(book);
        bookList.sort((o1, o2) -> {
            if (!(o1.getName().equals(o2.getName()))) {
                return o1.getName().compareTo(o2.getName());
            }
            return Integer.compare(o1.getNumberOfPages(), o2.getNumberOfPages());
        });
    }

    /**
     * Deletes a book from the catalog by setting its position to {@code null}.
     * Throws an {@code IllegalArgumentException} if the book is not in the catalog.
     *
     * @param book the book to delete from the catalog
     * @throws IllegalArgumentException if the book is not found in the catalog
     */
    public void delete(T book) {
        if (bookList.contains(book)) {
            int index = bookList.indexOf(book);
            bookList.set(index, null);
        } else {
            throw new IllegalArgumentException("Book: " + book.getName() + " is not in the library");
        }
    }

    /**
     * Lists all the books in the catalog by calling their {@code displayBook} method.
     * If the catalog is empty, an {@code IllegalStateException} is thrown.
     * Prints "Book is null" if a {@code null} value is encountered.
     *
     * @throws IllegalStateException if the catalog is empty
     */
    public void list() {
        if (bookList.isEmpty()) {
            throw new IllegalStateException("Library is empty");
        } else {
            for (T book : bookList) {
                if (book != null) {
                    book.displayBook();
                } else {
                    System.out.println("Book is null");
                }
            }
        }
    }
}
