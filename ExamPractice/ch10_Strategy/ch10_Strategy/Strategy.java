package ch10_Strategy;
// 가위바위보의 전략을 위한 추상 메소드
public interface Strategy {
    public abstract Hand nextHand(); // 다음에 낼 손을 얻기 위해 호출
    // -> 이 메소드가 호출되면 strategy 인터페이스를 구현한 클래스가 다음 손을 결정한다.
    public abstract void study(boolean win); // 다음 승부에 사용될 전략을 준비시키는 메소드
    public abstract void setStrategy(Strategy s); // 전략을 교체하는 메소드
}
