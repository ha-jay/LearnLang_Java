package _9_exception._2_runtimeException;

public class _1_runtimeTryCatch {
    //런타임 예외는 프로그램 실행 중에 발생하는 예외이다.
    //런타임 예외는 컴파일러가 예외를 강제로 처리하지 않는다.
    //런타임 예외는 처리하지 않거나, try-catch 문을 사용하여 처리하거나 로그를 남기는 등의 방법으로 처리한다.
    public static void main(String[] args) {
        //try-catch 문을 사용하여 예외를 처리한다. 프로그램 중단x
        try {
            String str = null;
            System.out.println(str.length());  // NullPointerException 발생
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage()); //예외 발생 시 예외 메시지 출력
        }
        System.out.println("프로그램 종료");
    }
}
