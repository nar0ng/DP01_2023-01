package ch02.practice2;

// 어댑터 /(위임을 이용함)
public class PrintBanner extends Print {
    // 어댑티를 갖는 속성
    private Banner banner; // 220볼트 (위임)

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() { // 12볼트
        banner.showWithParen(); // 220볼트
    };

    public void printStrong(){ 
        banner.showWithAster();

    };
}
