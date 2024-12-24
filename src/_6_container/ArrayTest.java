package _6_container;


public class ArrayTest {
    public static void main(String[] args) {
        // 배열 선언 및 생성
        int[] numbers = new int[5];

        // 값 저장
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // 배열 값 출력
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        //배열길이
        int length = numbers.length;
        System.out.println("배열의 길이: " + length);

        //배열 초기화 literal
        int[] numbers2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println("numbers2[" + i + "] = " + numbers2[i]);
        }


      


    }
}