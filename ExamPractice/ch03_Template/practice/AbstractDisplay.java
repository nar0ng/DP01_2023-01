package practice;
public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // display()는 AbstractDisplay에서 구현하는 메소드
    public final void display(){
        open();
        for(int i=0; i<5; i++){
            print();
        }
        close();
    }
}
