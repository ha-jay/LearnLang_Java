package _7_built_in.optional;

import java.util.Optional;

public class OptionalExample2 {
    //안전한 null 처리
    public static void main(String[] args) {
        String value = null;

        // 기존 방식
        if (value != null) {
            System.out.println(value.length());
        }

        // Optional 방식
        Optional.ofNullable(value)
                .map(String::length)
                .ifPresent(System.out::println);
    }
}
