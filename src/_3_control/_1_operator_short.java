package _3_control;

public class _1_operator_short {
     //단축평가에 사용될 static 메서드
     public static boolean isConditionMet() {
        System.out.println("This will not be printed!");
        return true;
    }
    public static void main(String[] args) {
       //논리연산자 단축평가 - 좌항에서 결과가 확실하면 우항을 평가하지 않는다.
       int v = 10;
        
       if (v > 5 || isConditionMet()) {  // or조건에서 좌항이 참이므로 우항은 평가하지 않습니다.
           System.out.println("Condition is true!"); 
       }
      
       if (v < 5 && isConditionMet()) {  // and 조건에서 좌항이 거짓이므로 우항을 평가하지 않습니다.
           System.out.println("Condition is true!");
       }else{
           System.out.println("Condition is false!");
       }
    }

}
