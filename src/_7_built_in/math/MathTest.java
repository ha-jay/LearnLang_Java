package _7_built_in.math;

public class MathTest {
    public static void main(String[] args) {
        System.out.println("Math.abs(-10) : "+Math.abs(-10)); //절대값
        System.out.println("Math.max(10, 20) : "+Math.max(10, 20)); //최대값
        System.out.println("Math.min(10, 20) : "+Math.min(10, 20)); //최소값
        System.out.println("Math.random() : "+Math.random()); //0.0이상 1.0미만의 난수 생성
        System.out.println("Math.round(10.5) : "+Math.round(10.5)); //반올림
        System.out.println("Math.ceil(10.5) : "+Math.ceil(10.5)); //올림
        System.out.println("Math.floor(10.5) : "+Math.floor(10.5)); //내림
        System.out.println("Math.pow(2, 3) : "+Math.pow(2, 3)); //2의 3승
        System.out.println("Math.sqrt(16) : "+Math.sqrt(16)); //16의 제곱근
        System.out.println("Math.PI : "+Math.PI); //파이
        System.out.println("Math.E : "+Math.E); //e
    }
}
