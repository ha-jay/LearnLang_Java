package _9_exception._2_runtimeException;

public class _3_runtimeThrows {
    //예외를 throws로 선언하여 호출한 곳에서 처리하게 할 수 있습니다.
    public static void main(String[] args) throws NullPointerException {
        String str = null;
        // null을 직접 처리하지 않고, 예외를 메서드에서 던짐, try-catch 문을 사용하여 예외를 처리하지 않음, 프로그램 중단
        System.out.println(str.length());
        System.out.println("프로그램 종료");
    }
}
