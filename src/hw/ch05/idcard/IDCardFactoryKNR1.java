package hw.ch05.idcard;

import hw.ch05.framwork.Product;
import hw.ch05.framwork.Factory;

public class IDCardFactoryKNR1 extends Factory{
    
    private static IDCardFactoryKNR1 singleton = new IDCardFactoryKNR1();
    
    private IDCardFactoryKNR1(){
        System.out.println("인스턴스가 생성되었습니다.");
    }

    public static IDCardFactoryKNR1 getInstance(){
        return singleton;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    

    @Override
    protected void registerProduct(Product product){
        System.out.println(product + "을 등록했습니다.");
    }
}
