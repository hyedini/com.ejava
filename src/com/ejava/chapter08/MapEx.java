package com.ejava.chapter08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapEx {
  public static int listSize(List list){
    Optional<List<String>> listOptional = Optional.of(list);
    int size = listOptional.map(List::size).orElse(0);
    return size;
  }

  public static void main(String[] args) {
    List companyNames = Arrays.asList("paypal", "oracle", "", "microsoft", "", "apple");
    System.out.println(listSize(companyNames));
  }
}
