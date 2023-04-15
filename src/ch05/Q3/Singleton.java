package ch05.Q3;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    public static Singleton getInstance() {
        if (singleton == null) { // 처음 getInstance()가 호출되면.r.
            singleton = new Singleton(); // 한번만 실행되게 되어있음 -> 그래서 싱글턴 패턴 아냐? -> 여러 스레드에서는 안돼
        }
        return singleton;
    }
}
