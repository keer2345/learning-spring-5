package com.spring.ch02.session03.demo05;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
  private String isbn;
  private String book_name;
  private int price;
  private String publication;

  public Book() {
    isbn = "310IND";
    book_name = "unknown";
    price = 300;
    publication = "publication1";
  }
}
