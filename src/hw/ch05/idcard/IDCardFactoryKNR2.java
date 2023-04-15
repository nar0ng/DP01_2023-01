package hw.ch05.idcard;

public class IDCardFactoryKNR2 {
    private static IDCardFactoryKNR2 singleton = null;

    private IDCardFactoryKNR2() {
        System.out.println("인스턴스를 생성했습니다.");
        slowdown();
    }

    public static synchronized IDCardFactoryKNR2 getInstance() {
        if (singleton == null) {
            singleton = new IDCardFactoryKNR2();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }

    public IDCard createProduct(String owner) {
        return new IDCard(owner);
    }

    public void registerProduct(IDCard product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
