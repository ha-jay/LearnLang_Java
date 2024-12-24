package _9_exception._1_compileException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _3_exceptionResources {
    
    //try-with-resources 문법을 사용하여 자원을 자동으로 해제하는 문법 / 파일, 네트워크 등 자원을 다룰 때 안전한 해제를 보장.
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
