package _5_oop_others._4_iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class _2_listIterator {
    public static void main(String[] args) {
        //ArrayList 생성 - 제네릭 타입으로 String 타입을 지정
        ArrayList<String> list = new ArrayList<>();
        //ArrayList에 요소 추가
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        //ListIterator 객체 생성
        ListIterator<String> listIterator = list.listIterator();

        //ListIterator를 사용하여 요소 출력
        //정방향 순회
        while (listIterator.hasNext()) { //hasNext() 메서드는 다음 요소가 있는지 확인
            String element = listIterator.next(); //next() 메서드는 다음 요소를 반환
            System.out.println(element);
        }

        //역방향 순회
        while (listIterator.hasPrevious()) {//hasPrevious() 메서드는 이전 요소가 있는지 확인
            String element = listIterator.previous(); //previous() 메서드는 이전 요소를 반환
            System.out.println(element);
        }

        //ListIterator의 add() 메서드 사용하면 특정 위치에 요소 추가가능
        while (listIterator.hasNext()) {
                String value = listIterator.next();
            if (value == "banana") {
                listIterator.add("orange"); //banana 뒤에 orange 추가
            }
        }
        System.out.println(list); // 출력: [apple, banana, orange, cherry]

        // 요소 수정
        listIterator = list.listIterator(); // ListIterator 재설정
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            if (value == "banana") {
                listIterator.set("watermelon"); // banana를 watermelon로 변경
            }
        }
        System.out.println(list); // 출력: [apple, watermelon, orange, cherry]

        //ListIterator의 remove() 메서드 사용하면 특정 조건 만족하는 요소 삭제가능
        listIterator = list.listIterator(); // ListIterator 재설정
        while (listIterator.hasNext()) {
            String value = listIterator.next();
            if (value == "orange") {
                listIterator.remove(); // orange 삭제
            }
        }
        System.out.println(list); // 출력: [apple, watermelon, cherry]
    }
}

