package _6_container._2_List;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //ArrayList 생성
        ArrayList<String> list = new ArrayList<>();
        // add() 메서드로 요소 추가
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        // get() 메서드로 특정 인덱스의 요소 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        // set() 메서드로 특정 인덱스의 요소 수정
        list.set(0, "D");
        System.out.println(list);

        // remove() 메서드로 특정 인덱스의 요소 삭제
        list.remove(1);
        System.out.println(list);

        // size() 메서드로 요소의 개수 조회
        System.out.println(list.size());

        // contains() 메서드로 특정 요소 포함 여부 확인
        System.out.println(list.contains("A"));

        // isEmpty() 메서드로 비어있는지 확인
        System.out.println(list.isEmpty());

        // clear() 메서드로 모든 요소 삭제
        list.clear();
        System.out.println(list);

        // 반복문을 사용하여 모든 요소 출력
        for (String item : list) {
            System.out.println(item);
        }
    }
}
