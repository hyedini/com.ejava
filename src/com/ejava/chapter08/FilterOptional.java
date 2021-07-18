package com.ejava.chapter08;

import java.util.Optional;

public class FilterOptional {
    public static void main(String[] args) {
        Integer year = 2021;
        Optional<Integer> yearOptional = Optional.of(year);
        boolean is2021 = yearOptional.filter(y -> y == 2021).isPresent();
        System.out.println(is2021);
        boolean is2022 = yearOptional.filter(y -> y == 2022).isPresent();
        System.out.println(is2022);
    }
}
