package ch01_Iterator.main_text;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book>{
private BookShelf bookShelf;
private int index;

// 생성자
public BookShelfIterator(BookShelf bookshelf){
    this.bookShelf = bookshelf;
    this.index = 0;
}

// 메소드
// hasNext(): 다음 책이 있는가?
@Override
public boolean hasNext(){
    if (index<bookShelf.getLength()){
        return true;
    }
    else{
        return false;
    }
}

// next(): 현재 책을 반환하고 다음 책을 가리킴
@Override
public Book next(){
    if (!hasNext()){
        throw new NoSuchElementException();
    }
    Book book = bookShelf.getBookAt(index);
    index++;
    return book;
}


}
