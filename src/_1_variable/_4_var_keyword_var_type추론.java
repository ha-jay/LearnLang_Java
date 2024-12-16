package _1_variable;

public class _4_var_keyword_var_type추론 {
    //var 키워드는 컴파일러가 변수의 타입을 추론하여 자동으로 할당합니다.
    public static void main(String[] args) {
        var number = 10;      // 컴파일러가 'int'로 추론
        var text = "Hello";   // 컴파일러가 'String'으로 추론
        var pi = 3.14;        // 컴파일러가 'double'로 추론

        System.out.println(number);  // 10
        System.out.println(text);    // Hello
        System.out.println(pi);      // 3.14
    }
}
