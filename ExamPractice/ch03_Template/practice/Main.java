package practice;
public class Main {
    public static void main(String[] args) {
        // 'H'를 가진 CharDisplay의 인스턴스를 하나 만든다.
        AbstractDisplay d1 = new CharDisplay('H');
        
        // "Hello, World."를 가진 StringDisplay의 인스턴스를 하나 만든다.
        AbstractDisplay d2 = new StringDisplay("Hello, World.");

        // d1, d2 모두 AbstractDisplay의 하위 클래스의 인스턴스이므로
        // 상속한 display 메소드를 호출할 수 있다.
        // 실제 동작은 CharDisplay나 StringDisplay의 클래스에서 정해진다.
        d1.display();
        d2.display();
    }
}
