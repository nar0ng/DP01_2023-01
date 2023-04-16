package idCard;

import framework.Factory;
import framework.Product;

public class Main {
    public static void main(String[] args) {
        // IDCard 공장을 만든다
        Factory factory = new IDCardFactory();

        // IDCard 공장의 create() 메소드를 호출한다
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Heungmin Son");
        Product card3 = factory.create("Kane");

        card1.use();
        card2.use();
        card3.use();
    }
}