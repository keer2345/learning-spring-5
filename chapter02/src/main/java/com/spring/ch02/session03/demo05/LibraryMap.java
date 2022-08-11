package com.spring.ch02.session03.demo05;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Mapping List
 *
 * @author keer
 */
@Getter
@Setter
public class LibraryMap {
  private Map<String, Book> books;

  public void displayBooks() {
    Set<Entry<String, Book>> entries = books.entrySet();
    for (Entry<String, Book> entry : entries) {
      System.out.println(entry.getValue());
    }
  }
}
