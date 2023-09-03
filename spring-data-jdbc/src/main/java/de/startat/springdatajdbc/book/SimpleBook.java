package de.startat.springdatajdbc.book;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceCreator;

public class SimpleBook {

  @PersistenceCreator
  private SimpleBook(Long id, String isbn, String title, String author, long numberOfPages) {
    this.id = id;
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.numberOfPages = numberOfPages;
  }
  public SimpleBook(String isbn, String title, String author, long numberOfPages) {
    this.id = null;
    this.isbn = isbn;
    this.title = title;
    this.author = author;
    this.numberOfPages = numberOfPages;
  }

  private final @Id Long id;
  private final String isbn;
  private final String title;
  private final String author;
  private final long numberOfPages;

  /**
   * Not neccessary but used by Spring Data JDBC to create a copy with id after saving the entity
   */
  SimpleBook withId(Long id) {
    return new SimpleBook(id, this.isbn, title, author, numberOfPages);
  }

  @Override
  public String toString() {
    return "SimpleBook{" +
        "id=" + id +
        ", isbn='" + isbn + '\'' +
        ", title='" + title + '\'' +
        ", author='" + author + '\'' +
        ", numberOfPages=" + numberOfPages +
        '}';
  }
}
