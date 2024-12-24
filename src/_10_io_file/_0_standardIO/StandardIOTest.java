package _10_io_file._0_standardIO;

import java.util.Scanner;

public class StandardIOTest {
    public static void main(String[] args) {    

        // 표준 입력
        // 표준 입력은 키보드로 입력받는 것을 말한다.
        // Scanner 클래스는 표준 입력을 처리하는 클래스이다.
        // System.in은 표준 입력을 받는 스트림이다.
            // 키보드로 입력받은 값을 문자열로 반환한다.
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        // 표준 출력
        // 표준 출력은 화면에 출력하는 것을 말한다.
        // System.out은 표준 출력을 처리하는 클래스이다.
        // System.out.println()은 화면에 출력하는 메서드이다.
        System.out.println("Hello, " + name + "!");

        //표준에러
        // 표준 에러는 프로그램 실행 중에 발생하는 오류를 처리하는 것을 말한다.
        // System.err은 표준 에러를 처리하는 클래스이다.
        // System.err.println()은 화면에 출력하는 메서드이다.
        System.err.println("Error: " + name + "!");
    }   
}
