
// 어댑터 (상속을 이용함)
// Banner 클래스를 확장(extends)하여 
// Print를 상속받음
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) { // 생성자
        super(string); // 부모 생성자
    }

    // Print 인터페이스의 메소드 구현
    // printWeak: 
    @Override
    public void printWeak() { // 12볼트
        showWithParen(); // 220볼트 (실제 일은 Banner(부모)가 한다)
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
