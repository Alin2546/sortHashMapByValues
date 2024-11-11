package org.example;

/**
 * The {@code ArtAlbum} class represents an art album, which is a specific type of {@code Book}.
 * It includes additional information about the quality of the paper used in the album.
 */
public class ArtAlbum extends Book {
    private final String paperQuality;

    /**
     * Constructs an {@code ArtAlbum} with the specified name, number of pages, and paper quality.
     *
     * @param name          the name of the art album
     * @param numberOfPages the number of pages in the art album
     * @param paperQuality  the quality of the paper used in the art album (e.g., "Glossy", "Matte")
     */
    public ArtAlbum(String name, int numberOfPages, String paperQuality) {
        super(name, numberOfPages);
        this.paperQuality = paperQuality;
    }

    /**
     * Returns the paper quality of the art album.
     *
     * @return the quality of the paper used in the album
     */
    public String getPaperQuality() {
        return paperQuality;
    }

    /**
     * Displays information about the art album, including its name, number of pages, and paper quality.
     * This method overrides the {@code displayBook} method in {@code Book}.
     */
    @Override
    void displayBook() {
        System.out.println("This is an ArtAlbum with the name: " + getName() + ", Pages: " + getNumberOfPages() + ", PaperQuality: " + getPaperQuality());
    }
}
