package ch06.Sample;

import ch06.Sample.framework.Product;
// 클래스 안에 자신을 복사하는 메소드를 두자
// 모든 필드 값이 동일한 인스턴스를 생성함
// -> 이를 자바에서 clone 이라고 함

public class MessageBox implements Product { //product 구현
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }

        System.out.println();
        System.out.println(decochar + s + decochar);
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone(); // 자기 복제가 일어남
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
