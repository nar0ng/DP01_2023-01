package ch05.A3a;

// Main 클래스가 스레드 클래스임
public class Main extends Thread {
    public static void main(String[] args) {
        System.out.println("Start.");

        // 스레드 객체가 3개 생성됨
        new Main("A").start(); // 시작해라! 
        new Main("B").start(); // 시작해라! 
        new Main("C").start(); // 시작해라! 

        System.out.println("End.");
    }

    @Override
    public void run() {
        Singleton obj = Singleton.getInstance(); // getInstance 호출
        System.out.println(getName() + ": obj = " + obj);
    }

    public Main(String name) {
        super(name);
    }
}
