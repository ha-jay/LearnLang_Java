package _3_control;

public class _3_conditional {
    public static void main(String[] args) {
        //if문
        int x = 10;
        if (x > 5) {
            System.out.println("x는 5보다 큽니다.");
        }
        //if-else문
        if (x > 5) {
            System.out.println("x는 5보다 큽니다.");
        } else {
            System.out.println("x는 5보다 작습니다.");
        }
        //if-else-if문
        if (x > 5) {
            System.out.println("x는 5보다 큽니다.");
        } else if (x > 3) {
            System.out.println("x는 3보다 큽니다.");
        } else {
            System.out.println("x는 3보다 작습니다.");
        }
        //switch문
        int y = 2;
        switch (y) {
            case 1:
                System.out.println("y는 1입니다.");
                break;
            case 2:
                System.out.println("y는 2입니다.");
                break;
        }
        //switch문 - default
        String day = "Sunday";
        switch (day) {
            case "Sunday":
                System.out.println("휴식");
                break;  // 필요시 사용, switch문 탈출
            default:  // 필요시 사용, 일치하는 case가 없는 경우
                System.out.println("공부하기");
        }
        //if문 - 중첩
        int a = 10;
        
       
        if (a > 5) {
            if (a > 3) {
                System.out.println("a는 5보다 크고 3보다 큽니다.");
            }
        }


    }
}
