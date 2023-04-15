package ch01_Iterator.main_text;
import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    public static BookShelf bookshelf;
    private Book[] books;
    private int last = 0;

    // 생성자: 인수(maxsize)를 받아 배열의 크기 결정
    public BookShelf(int maxsize){
        this.books = new Book[maxsize];
    }

    // 메소드
    // getBookAt(): 책을 꺼내오는 메소드
    public Book getBookAt(int index){
        return books[index];
    }

    // appendBook(): 책 한 권을 책장에 추가함
    public void appendBook(Book book){
    this.books[last]=book;
}

    // getLength(): 책꽂이에 꽂힌 책의 갯수 반환
    public int getLength(){
        return last;
    }
    
    // iterator(): 책꽂이의 책 하나하나 끄집어 냄
    @Override
    public Iterator<Book> iterator(){
        return new BookShelfIterator(this);
    }
}
