
// vendor class (이미 제공되는 것, 220볼트)
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    // 메소드
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
