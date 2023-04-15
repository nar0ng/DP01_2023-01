package ch04.practice;

import ch04.practice.framework.Factory;
import ch04.practice.idcard.IDCardFactory;
import ch04.practice.framework.Product;
import ch04.practice.idcard.IDCard;

public class Main {
    public static void main(String[] args) {
        // 신분증 직접 생성
        Product id01 = new IDCard("knr");
        id01.use();


        // 신분증을 공장을 통해 생성
        
        Factory f = new IDCardFactory();
        Product id02 = f.create("knr");
        id02.use();

    }
}
