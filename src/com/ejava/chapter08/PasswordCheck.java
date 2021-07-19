package com.ejava.chapter08;

import java.util.Optional;

public class PasswordCheck {
  public static void main(String[] args) {
    String password = " password ";
    Optional<String> passOpt = Optional.of(password);

    // 공백 포함 비교
    boolean correctPassword = passOpt.filter(pass -> pass.equals("password")).isPresent();
    System.out.println(correctPassword);

    // 공백 삭제 후 비교
    correctPassword = passOpt.map(String::trim).filter(pass -> pass.equals("password")).isPresent();
    System.out.println(correctPassword);
  }
}
