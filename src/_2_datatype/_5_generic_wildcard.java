package _2_datatype;

import java.util.List;

    public class _5_generic_wildcard {
        // ? 와일드카드를 이용한 메서드
        public static void printList(List<?> list) {
            for (Object item : list) {
                System.out.println(item);
        }
    }
    // extends 와일드카드를 이용한 메서드 - Number의 자식 클래스를 처리가능
    public static void printNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    // super 와일드카드를 이용한 메서드 - Integer의 부모 클래스를 처리가능
    public static void printSuperList(List<? super Integer> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // ? 와일드카드를 이용한 메서드 실행
        List<Integer> intList = List.of(1, 2, 3);
        List<String> strList = List.of("A", "B", "C");

        printList(intList);  // Integer 타입의 리스트 출력
        printList(strList);  // String 타입의 리스트 출력

        // extends 와일드카드를 이용한 메서드 실행 - Number의 자식 클래스를 처리가능
        List<Integer> intList2 = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        printNumbers(intList2);  // Integer 타입의 리스트 출력
        printNumbers(doubleList);  // Double 타입의 리스트 출력

        // super 와일드카드를 이용한 메서드 실행 - Integer의 부모 클래스를 처리가능
        List<Number> numberList = List.of(1, 2.2, 3.3);
        printSuperList(numberList);  // Number 타입의 리스트 출력
    }
}
