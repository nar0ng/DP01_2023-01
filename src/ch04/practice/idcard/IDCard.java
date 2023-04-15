package ch04.practice.idcard;

import ch04.practice.framework.Product;

public class IDCard extends Product {
    private String owner;
    // 앞에 아무것도 안 써있으면 패키지 visibillity -> 즉 같은 패키지에 속한 애들만 생성자를 볼 수 있다.
    public IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(this + "을 사용합니다."); // + : 문자열 연결, this.toString()
    }

    @Override
    public String toString() { //Object 클래스로부터 상속
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
