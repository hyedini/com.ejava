package com.ejava.chapter08;


import java.util.*;

public class OptionalEx {

    /** not used optional :: START */
    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if(c.isEmpty()) {
            throw new IllegalArgumentException("빈 컬렉션");
        }

        E result = null;
        for(E e : c) {
            if(result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }

        return result;
    }
    /** not used optional ::  END  */

    /** used optional :: START */
    public static <E extends Comparable<E>> Optional<E> optionalMax(Collection<E> c) {
        if(c.isEmpty()) {
            return Optional.empty();
        }

        E result = null;
        for(E e : c) {
            if(result == null || e.compareTo(result) > 0) {
                result = Objects.requireNonNull(e);
            }
        }

        return Optional.of(result);
    }
    /** used optional ::  END */

    public static <E extends Comparable<E>> Optional<E> streamMin(Collection<E> c) {
        return c.stream().min(Comparator.naturalOrder());
    }

    public static <E extends Comparable<E>> Collection<E> throwEx(Collection<E> c) {
        return Optional.ofNullable(c).orElseThrow(IllegalArgumentException::new);
    }

    public static void main(String[] args) {

        List lists = new ArrayList();
/*        lists.add(10);
        lists.add(20);
        lists.add(30);
        lists.add(40);*/

//        System.out.println("not used optional : "+(String) max(lists));
        System.out.println("used optional : "+optionalMax(lists));

        // -> 같은 객체를 넘겨받았지만 옵셔널로 처리한 경우에는 오류 대신 메시지를 출력한다.

        System.out.println("streamMin : "+streamMin(lists));

        String nullName = null;
        Optional<String> ofNullable = Optional.ofNullable(nullName);
        // 1) orElse
        nullName = ofNullable.orElse("orElse null");
        System.out.println("orElse : "+nullName);
        // 2) orElseGet
        nullName = ofNullable.orElseGet(() -> "orElseGet null");
        System.out.println("orElseGet : "+nullName);
        // orElse 는 객체가 비어있든 비어있지 않든 무조건 실행되지만
        // orElseGet() 는 객체가 비어있을때만 실행

        System.out.println(throwEx(lists));

        Optional<String> opt = Optional.of("nullName is null");
        System.out.println("Optional.of : " + opt.get());

        opt = Optional.ofNullable(nullName);
        System.out.println("Optional.ofNullable : " + opt.get());
    }
}
