package _6_container;

import java.util.Arrays;
public class Array_Loop {

    public static void main(String[] args) {
        //배열 for문 반복   
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //배열 향상된 for문 반복
        for (int number : numbers) {
            System.out.println(number);
        }
        //while문 반복
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }
        //forEach문 반복
        Arrays.stream(numbers).forEach(System.out::println);

    }   

}
