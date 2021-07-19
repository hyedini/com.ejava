package com.ejava.chapter08.person;

import java.util.Optional;

public class FlatMapEx {
  public static void main(String[] args) {
    Person person = new Person("john", 26);

    Optional<Person> personOptional = null;
//    Optional<Person> personOptional = Optional.of(person);

    Optional<Optional<String>> nameOptionalWrapper = personOptional.map(Person::getName);
    Optional<String> nameOptional = nameOptionalWrapper.orElseThrow(IllegalArgumentException::new);

    // flatMap 사용
    String name = personOptional.flatMap(Person::getName).orElse("");
    System.out.println("flatMap : "+name);

    // Map 사용
    String name1 = nameOptional.orElse("");
    System.out.println("map : "+name1);

  }
}
