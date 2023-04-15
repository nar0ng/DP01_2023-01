package hw.ch05;

import hw.ch05.idcard.IDCardFactoryKNR2;

public class Main2 extends Thread{
    public static void main(String[] args) {
        System.out.println("20200903 김나령");
        new Main2("최승훈").start();
        new Main2("김나령").start();
        new Main2("남유림").start();
        System.out.println("End.");
    }

    @Override
    public void run() {
        IDCardFactoryKNR2 obj = IDCardFactoryKNR2.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }

    public Main2(String name) {
        super(name);
    }
    }

