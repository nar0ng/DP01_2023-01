package idCard;
import framework.Product;

// Product의 하위 클래스
public class IDCard extends Product {
    private String owner="";

    IDCard(String owner){
        System.out.println(owner+"의 카드를 만듭니다.");
        this.owner = owner;
    }
    
    // 상위 클래스의 use() 메소드를 구현함
    @Override
    public void use(){
        System.out.println(this+"을 시작합니다");
    }

    @Override
    public String toString(){
        return "[IDCard:"+owner+"]";
    }

    // getOwner() 메소드를 추가함
    public String getOwner() {
        return owner;
    }
}
