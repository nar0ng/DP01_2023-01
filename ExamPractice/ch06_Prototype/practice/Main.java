import framework.Manager;
import framework.Product;
public class Main {
    public static void main(String[] args) {
        // 준비
        Manager manager = new Manager();
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');

        // 등록
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        // 생성과 사용
        Product p2 = manager.create("warning box");
        p2.use("Hello, World");

        Product p3 = manager.create("slash box");
        p3.use("Hello, World");
    }
}
