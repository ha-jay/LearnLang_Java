package _9_exception._1_compileException;

public class _1_exceptionTryCatch {
    public static void main(String[] args) {

        //예외란? - 컴파일 예외와 런타임 예외가 있다. 
        //컴파일 예외는 try-catch문이나 throws를 사용하여 처리해야 한다.
        //런타임 예외는 try-catch문으로 처리하지 않아도 된다.


        //예외처리 방법 - try-catch문, throws, throw
        //try-catch문 - 예외가 발생할 수 있는 코드를 try블록에 넣고, 예외가 발생하면 catch블록으로 이동하여 예외를 처리한다.
        //throws - 예외를 메서드 선언부에 표시하여 메서드를 호출한 곳에서 예외를 처리하도록 한다.
        //try-with-resources - 자원을 자동으로 해제하는 문법

        try {
            int result = 10 / 0; // ArithmeticException 발생
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
