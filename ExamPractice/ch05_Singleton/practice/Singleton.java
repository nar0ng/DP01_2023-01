package practice;
public class Singleton {
    // singleton 클래스의 인스턴스를 생성해서 가리킴
    // private 이므로 외부에서 접근하지 못함
    private static Singleton singleton = new Singleton();

    // 외부에서 new singleton을 호출하지 못한다.
    private Singleton(){
        System.out.println("인스턴스를 생성했습니다.");
    }

    // getInstance(): 유일한 하나의 인스턴스를 얻을 때 사용하는 메소드
    public static Singleton getInstance(){
        return singleton;
    }
}
