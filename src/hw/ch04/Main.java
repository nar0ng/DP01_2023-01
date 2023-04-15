package hw.ch04;

import hw.ch04.car.CarFactory;
import hw.ch04.car.Car_KimNaRyung;
import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("20200903 김나령");
        Factory<Product> carFactory = new CarFactory();
        
        Product myCar = carFactory.create("김나령");
        Product grandeur = carFactory.create("그랜저");
        Product sonata = carFactory.create("소나타");
        Product casper = carFactory.create("캐스퍼");

        myCar.use();
        grandeur.use();
        sonata.use();
        casper.use();

        System.out.println("<<모델명 리스트>>");
        ((CarFactory) carFactory).printAllModelNames(); // CarFactory의 printAllModelNames() 호출

    }
}
