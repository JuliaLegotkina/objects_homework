package ru.skypro;

public class Book {
    private final String bookTitle;
    private int publishingYear;
    private final Author author;

    public Book (Author author, String bookTitle, int publishingYear) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.publishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
