package _7_built_in.string;

public class StringTest {
    public static void main(String[] args) {
        //String 생성 literal
        String str = "Hello, World!";
        System.out.println(str);
        //String 생성 객체
        String str2 = new String("Hello, World!");
        System.out.println(str2);

        //String 비교
        String str3 = "Hello, World!";
        String str4 = new String("Hello, World!");
        System.out.println(str3 == str4); //false == 연산자는 두 객체의 주소를 비교
        System.out.println(str3.equals(str4)); //true equals 메서드는 두 객체의 값을 비교

        //String + 연산
        String str5 = "Hello, ";
        String str6 = "World!";
        String str7 = str5 + str6;
        System.out.println(str7);
        //String + 숫자 연산 = 문자열 타입으로 변환
        String str8 = "Hello, ";
        int num = 123;
        String str9 = str8 + num;
        System.out.println(str9);
        System.out.println(str9 instanceof String); //타입확인 true
       
        //String 메서드
        String str10 = "Hello, World!";
        //문자열 길이
        System.out.println("문자열 길이 : "+str10.length()); //문자열 길이 출력
        //대소문자
        System.out.println("문자열 대문자로 변환 : "+str10.toUpperCase()); //문자열 대문자로 변환
        System.out.println("문자열 소문자로 변환 : "+str10.toLowerCase()); //문자열 소문자로 변환
        //문자열 추출
        System.out.println("문자열 0번째부터 5번째까지 출력 : "+str10.substring(0, 5)); //문자열 0번째부터 5번째까지 출력
        //문자열 변환
        System.out.println("문자열 Hello를 Hi로 변환 : "+str10.replace("Hello", "Hi")); //문자열 Hello를 Hi로 변환
        System.out.println("문자열에서 첫번째 o를 a로 변환 : "+str10.replaceFirst("o", "a")); //문자열에서 첫번째 o를 a로 변환
        System.out.println("문자열에서 o를 a로 변환 : "+str10.replaceAll("o", "a")); //문자열에서 o를 a로 변환
        //문자열 조회 
        System.out.println("문자열에 Hello가 포함되어 있는지 확인 : "+str10.contains("Hello")); //문자열에 Hello가 포함되어 있는지 확인 true
        System.out.println("문자열에 o의 인덱스 출력 : "+str10.indexOf("o")); //문자열에 o의 인덱스 출력 4
        System.out.println("문자열의 0번째 문자 출력 : "+str10.charAt(0)); //문자열의 0번째 문자 출력 H
        System.out.println("문자열이 Hello로 시작하는지 확인 : "+str10.startsWith("Hello")); //문자열이 Hello로 시작하는지 확인 true
        System.out.println("문자열이 World!로 끝나는지 확인 : "+str10.endsWith("World!")); //문자열이 World!로 끝나는지 확인 true
        System.out.println("문자열이 비어있는지 확인 : "+str10.isEmpty()); //문자열이 비어있는지 확인 false
        //문자열 공백 제거
        System.out.println("문자열의 양쪽 공백 제거 : "+str10.trim()); //문자열의 양쪽 공백 제거
        //문자열 분리, 합침
        String[] str11 = str10.split(","); //문자열을 ,로 분리하여 배열로 반환
        System.out.println("문자열을 ,로 분리하여 배열로 반환 : "+str11); //문자열을 ,로 분리하여 배열로 반환
        String str12 = String.join(",", str11); //배열을 ,로 합쳐서 문자열로 반환
        System.out.println("배열을 ,로 합쳐서 문자열로 반환 : "+str12); //배열을 ,로 합쳐서 문자열로 반환
      

        
       
    }
}


