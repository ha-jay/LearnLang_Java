package _1_variable;

import java.util.ArrayList;

public class _4_var_keyword_var_type추론2 {
    public static void main(String[] args) {
        var list = new ArrayList<String>(); // 컴파일러가 'ArrayList<String>'로 추론
        list.add("Hello");
        list.add("World");

        for (var item : list) {
            System.out.println(item); // "Hello", "World"
        }
    }
}
