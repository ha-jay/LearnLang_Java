package _6_container._4_queue;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTest {
    public static void main(String[] args) {
        //LinkedList 생성 큐생성
        Queue<String> queue  = new LinkedList<>();

        //offer() 메서드로 요소 추가
        queue .offer("Apple");
        queue .offer("Banana");
        queue .offer("Cherry");
        System.out.println(queue );

        //poll() 메서드로 첫번째 요소 삭제
        queue.poll();
        System.out.println(queue);

        //peek() 메서드로 첫번째 요소 조회
        System.out.println(queue.peek());
    }
}

