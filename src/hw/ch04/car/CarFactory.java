package hw.ch04.car;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import java.util.Iterator;
import java.util.Vector;


public class CarFactory extends Factory<Product>{
    private Vector<String> modelNames = new Vector<>();
    
    @Override
    protected Car_KimNaRyung createProduct(String modelNames){
        return new Car_KimNaRyung(modelNames);
    }
    @Override
    protected void registerProduct(Product product) {
        modelNames.add(product.getModelName());
    }
    public void printAllModelNames() {
        Iterator<String> iterator = modelNames.iterator();
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
