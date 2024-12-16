package _2_datatype;

public class _3_typecasting {
    public static void main(String[] args) {   
        // 1. 묵시적 형변환(자동형변환 : 작은datatype->큰datatype)
        int num1 = 10;
        double num2 = num1; // 묵시적 형변환
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        // 2. 명시적 형변환(강제형변환 : 큰datatype->작은datatype)
        double num3 = 10.5;
        int num4 = (int) num3; // 명시적 형변환
        System.out.println("num3: " + num3);
        System.out.println("num4: " + num4);

        int a = 65;
        var ch = (char)a; // 명시적 형변환
        System.out.println(ch);
    }
}
