package ch05.Sample;

public class Singleton {
    // 2. 생성자, static
    // eager initialization
    private static Singleton singleton = new Singleton();
    //1. singleton pricvate로 만든다
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }
    // 3. getInstance, static
    public static Singleton getInstance() {
        return singleton;
    }
}
