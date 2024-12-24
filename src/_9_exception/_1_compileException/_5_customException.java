package _9_exception._1_compileException;

//사용자 정의 예외 클래스 생성
//Exception 또는 RuntimeException*을 상속받아 구현
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class _5_customException {
    public static void main(String[] args) {
        try {
            throw new MyException("예외 발생");
        } catch (MyException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}

