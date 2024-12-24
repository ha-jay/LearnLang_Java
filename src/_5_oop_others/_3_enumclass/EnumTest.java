package _5_oop_others._3_enumclass;


//enum은 열거형 상수를 정의하는데 사용되는 특수한 클래스
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

//enum에 description 추가하여 상수별로 다르게 동작가능,
//enum 상수별로 고유한 메서드를 정의하는것도 가능합니다. 
enum Day2 {
    MONDAY("Start of the workweek"),
    TUESDAY("Second day"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost there"),
    FRIDAY("End of the workweek"),
    SATURDAY("Weekend"),
    SUNDAY("Rest day");

    private final String description;
    //생성자
    Day2(String description) {
        this.description = description;
    }
    //description 반환 메서드
    public String getDescription() {
        return description;
    }
}
   


public class EnumTest {
    public static void main(String[] args) {
        //이넘 사용
        Day today = Day.MONDAY; //enum 타입의 변수 선언
        System.out.println(today);  // 출력: MONDAY

        //enum 상수별로 설정한 description을 출력하는 메서드 호출
        System.out.println(Day2.MONDAY.getDescription()); // 출력: Start of the workweek

        //Enum 클래스의 메서드 사용
        Day2[] days = Day2.values(); //values() enum 상수 배열 생성
        for (Day2 day : days) {
            System.out.println(day + ": " + day.getDescription());
        }

        Day day = Day.valueOf("MONDAY"); //valueOf() 메서드는 문자열을 받아서 해당하는 enum 상수를 반환
        System.out.println("Day from valueOf: " + day);  // 출력: MONDAY

        //enum 상수 비교
        Day tmr = Day.MONDAY;
        Day anotherDay = Day.MONDAY;
        System.out.println("Comparing MONDAY and MONDAY: " + (tmr == anotherDay)); // 출력: true
    }
}

