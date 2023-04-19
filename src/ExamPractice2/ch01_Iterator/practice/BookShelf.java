package ch01.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    //private Book[] books; //배열 선언

    private Book[] books = new ArrayList<Book>();
    private int last = 0; // 책의 마지막 위치, 책의 갯수

    public BookShelf(int maxsize) {
    //배열 생성
    this.books=new Book[maxsize];
    }

    // 책을 꽂는 메소드
    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    // 책을 꺼내오는 메소드
    public Book getBookAt(int index){
        return books[index];
    }

    // 책 갯수를 리턴하는 메소드
    public int getLenth() {
        return last;
    }

    // Iterator 반환하는 메소드
    // public BookShelfIterator iterator(){
    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this); // 현재 책꽂이와 iterator가 연결됨
        //return new BookShelfIteratorBackward(this); 
    }
}
