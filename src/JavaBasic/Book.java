package JavaBasic;

public class Book {
    private String title;
    private String author;
    private Integer publishDate;
    private String genre;
    private Integer numberOfPages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Integer publishDate) {
        this.publishDate = publishDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Boolean getInShelf() {
        return isInShelf;
    }

    public void setInShelf(Boolean inShelf) {
        isInShelf = inShelf;
    }

    private Boolean isInShelf;

    public Book(String title, String author, Integer publishDate, String genre, Integer numberOfPages, Boolean isInShelf) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.isInShelf = isInShelf;
    }
}
