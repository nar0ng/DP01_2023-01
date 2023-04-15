
package ch02.practice1;

// 어댑터 (상속을 이용함)
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) { // 생성자
        super(string); // 부모 생성자
    }

    @Override
    public void printWeak() { // 12볼트
        showWithParen(); // 220볼트 (실제 일은 Banner(부모)가 한다)
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
