package ch01.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.SliderUI;

public class Main {
    public static void main(String[] args) {
    // 책 생성
    Book b1 = new Book("book1");
    Book b2 = new Book("book2");
    
    System.out.println(b1.getName());

    // 책꽂이 생성
    BookShelf bs1 = new BookShelf(1);

    bs1.appendBook(b1);
    // Book result1 = bs1.getBookAt(0);
    // System.out.println(result1.getName());

    bs1.appendBook(b2);
    // Book result2 = bs1.getBookAt(1);
    // System.out.println(result2.getName());

    //for 루프를 이용해서 책이름 출력하기
    for (int i = 0; i < bs1.getLenth(); i++) {
        System.out.println(bs1.getBookAt(i).getName());
    }

    // 확장 for 루프를 이용해서 책이름 출력하기
    for (Book book : bs1) {
        System.out.println(book.getName());
    }

    // iterator를 이용해서 책이름 출력하기
    // iterator 얻기
    System.out.println("<book list using iterator>");
    Iterator<Book> iterator = bs1.iterator();
    // iterator 이용해서 원소 얻어오기
    while (iterator.hasNext()) {
        Book b = iterator.next();
        System.out.println(b.getName());
    }

    // 문자열 리스트 다루기
    // 컬렉션: List, Set, Map
    // ArrayList
    List<String> slist = new ArrayList<String>();

    slist.add("a");
    slist.add("b");
    slist.add("c");

    // 모든 원소 출력하기

    // 1. for 루프 이용하기
    for (int i = 0; i < slist.size(); i++) {
        System.out.println(slist.get(i));
    }
    // 2. 확장 for 문 이용하기
    for (String s : slist) {
        System.out.println(s);
    }
    // 3. iterator 이용하기
    // 3.1 iterator 얻기
    Iterator<String> it = slist.iterator();

    // 3.2 원소 얻어오기
    while(it.hasNext()){
        System.out.println(it.next());
    }

    // 4. 스트림 얻어오기
    slist.stream().forEach(System.out::println); // 메소드 참조
}
}
