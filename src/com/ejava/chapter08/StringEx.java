package com.ejava.chapter08;

import java.util.Optional;

public class StringEx {
  public static void main(String[] args) {
    String name = "이펙티브 자바 스터디";
    Optional<String> nameOptional = Optional.of(name);
    int len = nameOptional.map(String::length).orElse(0);
    System.out.println(len);
  }
}
