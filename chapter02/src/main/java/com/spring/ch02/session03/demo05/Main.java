package com.spring.ch02.session03.demo05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("session03.xml");
    LibraryList books = (LibraryList) context.getBean("library_list");
    books.displayBooks();

    LibrarySet booksSet = (LibrarySet) context.getBean("library_set");
    booksSet.displayBooks();

    LibraryMap booksMap = (LibraryMap) context.getBean("library_map");
    booksMap.displayBooks();
  }
}
