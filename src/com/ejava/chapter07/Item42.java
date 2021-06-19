package com.ejava.chapter07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Item42. 익명 클래스보다는 람다를 사용하라
 * */
public class Item42 {
    List<String> words = Arrays.asList("banana", "cat", "orange", "apple");

    // 42-1 익명 클래스의 인스턴스를 함수 객체로 사용 - 낡은 기법이다! (254쪽)
    public void exam01(){
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        System.out.println("[42-exam01] "+words.toString());
    }

    // 42-2 람다식을 함수 객체로 사용 - 익명 클래스 대체 (255쪽)
    public void exam02(int version){
        switch (version){
            case 1 : Collections.sort(words, (s1,s2)-> Integer.compare(s1.length(), s2.length())); break;
            case 2 : Collections.sort(words, Comparator.comparingInt(String::length)); break;
            case 3 : words.sort(Comparator.comparingInt(String::length)); break;
        }
        System.out.println("[42-exam02] "+words);
    }



}
