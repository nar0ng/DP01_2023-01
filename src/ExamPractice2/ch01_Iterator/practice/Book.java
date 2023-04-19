package ch01.practice;

public class Book {
    // 속성
    private String name = ""; // 책제목

    // 생성자: 책 제목을 받아서 자기 속성에 담는다.
    public Book(String name) {
        this.name = name;
    }

    // 메소드
    // 책 제목을 얻는 메소드
    public String getName() {
        return name;
    }

    // ctrl+shift+P:팔레트-> fomat 코드 정돈
}
