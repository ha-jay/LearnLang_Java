package _9_exception._2_runtimeException;

public class _2_runtimeNo {
       //런타임 예외는 프로그램 실행 중에 발생하는 예외이다.
    //런타임 예외는 컴파일러가 예외를 강제로 처리하지 않는다.
    //런타임 예외는 처리하지 않거나, try-catch 문을 사용하여 처리하거나 로그를 남기는 등의 방법으로 처리한다.
    public static void main(String[] args) {
       //처리하지 않으면 프로그램은 중단되고, 예외 메세지가 출력
            String str = null;
            System.out.println(str.length());  // NullPointerException 발생
            System.out.println("프로그램 종료");
   
    }          
}
