package ch01_Iterator.main_text;
public class Book {
    // 속성
    // name: 책제목
    private String name= ""; 
    // 생성자: 책 제목을 받아서 자기 속성에 담는다.
    public Book(String name){
        this.name = name;
    }

    // 메소드
    // getName(): 책 제목을 얻는다.
    public String getName(){
        return name;
    }

}
