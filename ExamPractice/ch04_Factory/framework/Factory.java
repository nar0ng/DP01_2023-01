package framework;

public abstract class Factory {
    public final Product create(String owner){
        // 제품을 만들고
        Product p = createProduct(owner);
        // 등록한 후
        registerProduct(p);
        // 생성된 제품을 반환
        return p;
    }

    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
    
}
