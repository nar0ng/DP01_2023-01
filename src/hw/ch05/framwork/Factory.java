package hw.ch05.framwork;


public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    // 실제로 어떤 제품(객체)을 생성할 지는 자식에게 맡긴다.
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
