package _8_lamda;

import java.util.Arrays;
import java.util.List;



public class _1_lamdaTestCollection {
   

    public static void main(String[] args) {
        // 람다식 사용 - 컬렉션
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        list.forEach(System.out::println);
    }
}
