package ch05.A3a;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown(); // 생성될 때 시간이 걸리게 함
    }

    // public static Singleton getInstance() {

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); // CPU를 내놓고 잠을 잔다. sleep 메소드는 시간을 끄는 효과 1000->1초
        } catch (InterruptedException e) { // 잠을 자다가 깨우는 오류 -> interruptedexception 그 오류 방지하기 위해 try catch문으로 작성
        }
    }
}
