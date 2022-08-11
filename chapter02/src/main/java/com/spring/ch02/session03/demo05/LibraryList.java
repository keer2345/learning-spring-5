package com.spring.ch02.session03.demo05;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Mapping List
 * @author keer
 */
@Getter
@Setter
public class LibraryList {
  private List<Book> books;

  public void displayBooks() {
    for (Book b : books) {
      System.out.println(b);
    }
  }
}
