package _7_built_in.optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        // Optional 이란?
        // 값이 있을 수도 있고 없을 수도 있는 경우에 사용하는 클래스
        // 값이 있으면 값을 반환하고, 값이 없으면 디폴트 값을 반환

        // 빈 Optional 객체 생성 - empty()
        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent()); // false
        System.out.println(emptyOptional.orElse("Default Value")); // Default Value

        // 값이 있는 Optional 객체 생성 - of()
        Optional<String> optional = Optional.of("Hello, Optional!");
        System.out.println(optional.isPresent()); // true
        System.out.println(optional.get()); // Hello, Optional!

        // 값이 없을수도있는(null) Optional 객체 생성 - ofNullable()
        Optional<String> optional2 = Optional.ofNullable(null);
        System.out.println(optional2.isPresent()); // false
        System.out.println(optional2.orElse("Default Value")); // Default Value


        //값 확인 isPresent()  값이 존재하는지?
        Optional<String> optional3 = Optional.of("Hello, Optional!");
        System.out.println(optional3.isPresent()); // true

        // 값 확인 ifPresent() 값이 존재하면 실행
        optional3.ifPresent(value -> System.out.println(value)); // Hello, Optional!

        // 값 확인 ifPresentOrElse() 값이 존재하면 실행, 없으면 실행
        optional3.ifPresentOrElse(value -> System.out.println(value), () -> System.out.println("값이 없습니다.")); // Hello, Optional!

        //값가져오기 get()
        Optional<String> optional10 = Optional.of("Hello, Optional!");
        System.out.println(optional10.get()); // Hello, Optional!

        // 값 확인 orElse() 값이 없으면 디폴트 값 반환
        Optional<String> optional4 = Optional.ofNullable(null);
        System.out.println(optional4.orElse("Default Value")); // Default Value

        // 값 확인 orElseGet() 값이 없으면 람다식 실행
        Optional<String> optional5 = Optional.ofNullable(null);
        System.out.println(optional5.orElseGet(() -> "Default Value")); // Default Value

        // 값 확인 orElseThrow() 값이 없으면 예외 발생
        Optional<String> optional6 = Optional.ofNullable(null);
        // System.out.println(optional6.orElseThrow(() -> new RuntimeException("값이 없습니다."))); // RuntimeException: 값이 없습니다.

    

        // 값 확인 filter() 값이 존재하면 필터링
        Optional<String> optional7 = Optional.of("Hello, Optional!");
        System.out.println(optional7.filter(value -> value.equals("Hello, Optional!")).orElse("Default Value")); // Hello, Optional!

        // 값 확인 map() 값이 존재하면 매핑
        Optional<String> optional8 = Optional.of("Hello, Optional!");
        System.out.println(optional8.map(value -> value.toUpperCase()).orElse("Default Value")); // HELLO, OPTIONAL!    

        //flatMap() 값이 존재하면 매핑
        Optional<String> optional9 = Optional.of("Hello, Optional!");
        System.out.println(optional9.flatMap(value -> Optional.of(value.toUpperCase())).orElse("Default Value")); // HELLO, OPTIONAL!
    }
}
