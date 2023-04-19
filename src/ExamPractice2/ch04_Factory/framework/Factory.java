package ch04.practice.framework;

public abstract class Factory {
    // 제품 생산 시 하는 큰 흐름 => 템플릿 메소드
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 실제로 어떤 제품(객체)을 생성할 지는 자식에게 맡긴다.
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
