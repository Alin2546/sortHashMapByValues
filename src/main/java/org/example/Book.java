package org.example;

/**
 * The {@code Book} class represents an abstract book with a name and number of pages.
 *
 * <p>
 * This class provides methods to retrieve the book's name and page count, and an abstract method
 * {@code displayBook} that must be implemented by subclasses to define how the book is displayed.
 * </p>
 */
public abstract class Book {
    private final String name;
    private final int numberOfPages;

    /**
     * Constructs a {@code Book} with the specified name and number of pages.
     *
     * @param name          the name of the book
     * @param numberOfPages the number of pages in the book
     */
    public Book(String name, int numberOfPages) {
        this.name = name;
        this.numberOfPages = numberOfPages;
    }

    /**
     * Returns the name of the book.
     *
     * @return the name of the book
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the number of pages in the book.
     *
     * @return the number of pages in the book
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * Displays information about the book.
     * This method must be implemented by any class that extends {@code Book}.
     */
    abstract void displayBook();
}
