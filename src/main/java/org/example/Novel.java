package org.example;

/**
 * The {@code Novel} class represents a novel, which is a specific type of {@code Book}.
 * It includes additional information about the novel's type, such as genre or category.
 */
public class Novel extends Book {
    private final String type;

    /**
     * Constructs a {@code Novel} with the specified name, number of pages, and type.
     *
     * @param name          the name of the novel
     * @param numberOfPages the number of pages in the novel
     * @param type          the type or genre of the novel (e.g., "Fiction", "Mystery", "Science Fiction")
     */
    public Novel(String name, int numberOfPages, String type) {
        super(name, numberOfPages);
        this.type = type;
    }

    /**
     * Returns the type or genre of the novel.
     *
     * @return the type of the novel
     */
    public String getType() {
        return type;
    }

    /**
     * Displays information about the novel, including its name, number of pages, and type.
     * This method overrides the {@code displayBook} method in {@code Book}.
     */
    @Override
    void displayBook() {
        System.out.println("This is a novel with the name: " + getName() + ", Pages: " + getNumberOfPages() + ", Type: " + getType());
    }
}
