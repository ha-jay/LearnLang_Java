package _3_control;

import java.util.Arrays;
import java.util.List;

public class _2_loop {
    public static void main(String[] args) {
        System.out.println("for문 - 특정 횟수만큼 반복");
        //for문 - 특정 횟수만큼 반복
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        System.out.println("while문 - 조건이 참인 동안 반복");
        //while문 - 조건이 참인 동안 반복
        int j = 0;
        while (j < 4) {
            System.out.println(j);
            j++;
        }
        System.out.println("do-while문 - 최소 한번 실행한후 조건검사 - 조건이 참이면 반복");
        //do-while문 - 최소 한번 실행한후 조건검사 - 조건이 참이면 반복
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 4);

        System.out.println("Enhanced for loop - 배열이나 컬렉션의 요소를 순회하는데 사용");
        //Enhanced for loop - 배열이나 컬렉션의 요소를 순회하는데 사용
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("forEach문 - collection의 요소를 순회하는데 사용");
        //forEach문 - collection의 요소를 순회하는데 사용
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("break문 - 반복문을 종료");
        //break문 - 반복문을 종료
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("break문 실행");
                break;
            }
            System.out.println(i);
        }
        System.out.println("continue문 - 반복문의 나머지 부분을 건너뜀");
        //continue문 - 반복문의 나머지 부분을 건너뜀
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("skip");
                continue;
            }
            System.out.println(i);
        }

        System.out.println("다중FOR문");
        //다중for문
        for (int i = 0; i < 3; i++) {
            for (int p = 0; p < 3; p++) {
                System.out.println(i + " " + p);
            }
        }
    }
}