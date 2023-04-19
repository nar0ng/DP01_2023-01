package ch03.practice;

public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    protected abstract void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    public final  void display(int times) { // 구상 메소드 - > 구체적인 메소드, 흐름의 큰 틀을 제공함 => 템플릿 메소드

        // 추상 메소드들을 이용해서 구현되어 있다. 
        open();
        for (int i = 0; i < times; i++) { // 하드 코딩<- 좋지않음
            print();
        }
        close();
    }
    public void display() {
    }
}
