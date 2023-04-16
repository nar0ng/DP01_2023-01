package idCard;
import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory{

    // createProduct(): 제품을 직접 생산함
    @Override
    protected Product createProduct(String owner){
        return new IDCard(owner);
    }

    // registerIDCard(): IDCard의 소유주를 owners 필드에 푸가함
    @Override
    protected void registerProduct(Product product){
        System.out.println(product+"을 등록했습니다");
    }
}
