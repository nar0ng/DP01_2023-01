package framework;

public interface Product extends Cloneable{ // Cloneable 인터페이스를 상속함
    // use(): 사용을 위한 메소드
    public abstract void use(String s);
    // createCopy(): 인스턴스를 복제하기 위한 메소드
    public abstract Product createCopy();
}
