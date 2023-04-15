package ch02.practice1;

// 클라이언트
public class Main {
    public static void main(String[] args) {

        // 클라이언트가 직접 Banner를 사용하지 못한다.
        // Banner를 수정하면 클라이언트가 영향을 받는다. 
        Banner b = new Banner("김나령");
        b.showWithParen();
        b.showWithAster();

        // 클라이언트는 Print 인터페이스를 이용하기를 원한다.
        // 장점1: Banner를 수정해도 클라이언트는 영향을 안 받는다. 
        // 장점2: Banner를 수정하지 않고도 Print처럼 사용했다. 
        Print x =  new PrintBanner("김나령");

        x.printWeak();
        x.printStrong();
    }
    
}
