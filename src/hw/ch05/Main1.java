package hw.ch05;

import hw.ch05.idcard.IDCardFactoryKNR1;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("20200903  김나령");
        IDCardFactoryKNR1 factory1 = IDCardFactoryKNR1.getInstance();
        IDCardFactoryKNR1 factory2 = IDCardFactoryKNR1.getInstance();

        if (factory1 == factory2){ // 같은 주소인지 비교함 
            System.out.println("factory1과 factory2는 같은 인스턴스입니다.");
        } else {
            System.out.println("factory1과 factory2는 다른 인스턴스입니다.");
        } 
    }
}
