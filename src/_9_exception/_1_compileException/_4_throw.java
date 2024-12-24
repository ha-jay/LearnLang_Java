package _9_exception._1_compileException;

public class _4_throw {
    //throw 사용 - 예외를 강제로 발생시킨다.
    public static void main(String[] args) {
        try {
            throw new Exception("예외 발생");
        } catch (Exception e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
