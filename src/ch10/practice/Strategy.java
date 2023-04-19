package ch10.practice;
// 가위바위보의 전략을 나타내는 클래스 
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);

    public abstract void setStrategy(Strategy s); // 전략을 교체하는 메소드
}
