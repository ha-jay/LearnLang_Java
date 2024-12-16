package _2_datatype;

public class _2_objecttype {
    public static void main(String[] args) {
        // 객체 생성
        Book book = new Book();
        // 객체 초기화
        book.title = "자바의 정석";
        book.price = 30000;
        book.company = "도우출판";
        book.author = "남궁성";
        book.page = 1000;
        book.isbn = "1234567890";

        // 객체 출력
        System.out.println("책 제목: " + book.title);
        System.out.println("책 가격: " + book.price);
        System.out.println("책 출판사: " + book.company);
        System.out.println("책 저자: " + book.author);
        System.out.println("책 페이지: " + book.page);
        System.out.println("책 ISBN: " + book.isbn);
    }
}
