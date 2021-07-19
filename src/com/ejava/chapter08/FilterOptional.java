package com.ejava.chapter08;

import java.util.Optional;

public class FilterOptional {
    public static void main(String[] args) {
        Integer year = 2021;
        Optional<Integer> yearOptional = Optional.of(year);
        /*
        * - 내부 값이 value인 Optional 객체 반환
        * - 만약 value가 null인 경우`NullPointerException`발생
        */
        boolean is2021 = yearOptional.filter(y -> y == 2021).isPresent();
        System.out.println(is2021);
        boolean is2022 = yearOptional.filter(y -> y == 2022).isPresent();
        System.out.println(is2022);
        /*
        * isPresent : 값이 존재하는지 확인하는 메서드
        * 원하는 모든 메서드를 수행할 수 있으나 신중히 사용할 필요가 있음
        * */
    }
}
