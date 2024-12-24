package _5_oop_others._4_iterator;

import java.util.ArrayList; //ArrayList 클래스 임포트
import java.util.Iterator; //Iterator 인터페이스 임포트

public class _1_iterator {
    public static void main(String[] args) {
        //ArrayList 생성 - 제네릭 타입으로 String 타입을 지정
        ArrayList<String> list = new ArrayList<>();
        //ArrayList에 요소 추가
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        //Iterator 객체 생성
        Iterator<String> iterator = list.iterator();

        //Iterator를 사용하여 요소 출력
        while (iterator.hasNext()) { //hasNext() 메서드는 다음 요소가 있는지 확인
            String element = iterator.next(); //next() 메서드는 다음 요소를 반환
            System.out.println(element);
        }

        //iterator의 remove() 메서드 사용하면 특정 조건 만족하는 요소 삭제가능
        ArrayList<Integer> numbers = new ArrayList<>(); //Integer 타입의 ArrayList 생성
        //ArrayList에 요소 추가
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);    
        //Iterator 객체 생성
        Iterator<Integer> iterator2 = numbers.iterator();
        //Iterator를 사용하여 요소 출력
        while (iterator2.hasNext()) { //hasNext() 메서드는 다음 요소가 있는지 확인
            int num = iterator2.next(); //next() 메서드는 다음 요소를 반환
            if (num % 2 == 1) { // 홀수인 경우 삭제
                iterator2.remove(); //remove() 메서드는 현재 요소를 삭제
            }
        }
        System.out.println(numbers); // 출력: [10,20]
    }
}
