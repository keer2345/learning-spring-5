package com.spring.ch02.session03.demo05;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

/**
 * Mapping Set
 * @author keer
 */
@Getter
@Setter
public class LibrarySet {
  HashSet<Book> books;

  public void displayBooks() {
    for (Book b : books) {
      System.out.println(b);
    }
  }
}
