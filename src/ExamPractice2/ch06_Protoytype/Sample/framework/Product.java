package ch06.Sample.framework;

// Product 인터페이스를 구현하기만 하면 해당 인터페이스를 복제할 수 있다
// Clonable 인터페이스를 구현한 클래스는 clone() 메소드를 이용해서 복제를 만들어낼 수 있다.
public interface Product extends Cloneable { // Cloneable 인터페이스를 상속함
    // use(): 사용을 위한 메소드
    // 사용이 무엇인지는 하위 클래스의 구현이 결정함
    public abstract void use(String s);
    public abstract Product createCopy(); // 자기 복제품을 반환하는 메소드
}
