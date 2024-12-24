package _10_io_file._1_fileNavigation;

import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandlingTest {
    static File file;
    static String folderPath = "C:\\Users\\wildg\\OneDrive\\바탕 화면\\작업공간\\Coding Projects\\Learn Java Project\\src\\_10_io_file\\_1_fileclass\\test";
    static String filePath = folderPath + "\\test.txt";
    static String fileName = "test.txt";
    
    //io.File 클래스는 파일과 디렉토리를 다루는 데 사용됩니다.
    //파일 생성, 삭제, 이동, 이름 변경, 존재 여부 확인 등의 작업을 수행할 수 있습니다.
    //디렉토리 생성, 삭제, 이동, 이름 변경, 존재 여부 확인 등의 작업을 수행할 수 있습니다.

    //io.FileWriter 클래스는 파일에 쓰기 작업을 수행할 수 있습니다.
    //파일에 쓰기 작업은 write() 메서드를 사용합니다.
    //파일에 쓰기 작업은 IOException 예외가 발생합니다. 그러므로 try-catch 문을 사용하여 예외를 처리합니다.
    //io.FileReader 클래스는 파일에서 읽기 작업을 수행할 수 있습니다.
    //파일에서 읽기 작업은 read() 메서드를 사용합니다.
    //파일에서 읽기 작업은 IOException 예외가 발생합니다. 그러므로 try-catch 문을 사용하여 예외를 처리합니다.
    public static void main(String[] args) {
       


        //파일 생성은 createNewFile() 메서드를 사용합니다. - true 반환, 파일 생성 실패 시 false 반환
        //파일 생성 실패 시 IOException 예외가 발생합니다. 그러므로 try-catch 문을 사용하여 예외를 처리합니다.
        try {
             //파일 객체 생성

            // file = new File(folderPath, fileName); //파일 객체 생성 path는 파일의 경로 및 파일이름 //경로지정하지않으면, project root 디렉토리에 생성
            file = new File(folderPath, fileName);

            //파일 생성 메서드
            file.createNewFile();
            System.out.println("파일 생성 완료");
        } catch (IOException e) {
            System.out.println("파일 생성 실패");
            e.printStackTrace();//예외 출력
        }

        //파일에 쓰기
        try {
            FileWriter writer = new FileWriter(file);//파일 쓰기 객체 생성
            writer.write("Hello, World!");//파일에 쓰기
            writer.close();//파일 쓰기 객체 닫기
            System.out.println("파일 쓰기 완료");
        } catch (IOException e) {
            System.out.println("파일 쓰기 실패");
            e.printStackTrace();//예외 출력
        }
        

        //파일내용 읽기 Scanner 사용
        try {
            Scanner scanner = new Scanner(file);//파일 읽기 객체 생성
            String content = scanner.nextLine();//파일 읽기
            System.out.println("파일 읽기 완료");
            System.out.println("파일 읽기 결과: " + content);//파일 읽기 결과 출력
            scanner.close();//파일 읽기 객체 닫기
        } catch (IOException e) {
            System.out.println("파일 읽기 실패");
            e.printStackTrace();//예외 출력
        }
        
        //파일 정보 얻기 File 클래스의 메서드를 사용합니다.
          //파일 존재 여부 확인 exists() 메서드를 사용합니다. 불리언반환
          System.out.println("파일 존재 여부: " + file.exists());//파일 존재 여부 확인
            
          //getAbsolutePath() 메서드는 파일의 절대 경로를 반환합니다. 문자열반환
          System.out.println("파일 절대 경로: " + file.getAbsolutePath());
          //getName() 메서드는 파일의 이름을 반환합니다. 문자열반환
          System.out.println("파일 이름: " + file.getName());
          //length() 메서드는 파일의 크기를 반환합니다. 바이트단위 정수반환
          System.out.println("파일 크기: " + file.length() + "bytes");
          //isDirectory() 메서드는 파일이 디렉토리인지 여부를 반환합니다. 불리언반환
          System.out.println("파일이 디렉토리인지: " + file.isDirectory());
          //isFile() 메서드는 파일이 파일인지 여부를 반환합니다. 불리언반환
          System.out.println("파일이 파일인지: " + file.isFile());

        //   파일 삭제 File 클래스의 delete() 메서드를 사용합니다. 불리언반환
          System.out.println("파일 삭제 여부: " + file.delete());
    }
}
