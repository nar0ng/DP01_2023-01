package ch06.Sample.framework;

import java.util.HashMap;
import java.util.Map;

// Product 라는 부모 타입으로 코딩이 되어 있음
// 원칙: Programming to Interface/Abstract Class
// framework.Manager: createCopy를 사용하여 인스턴스를 복제하는 클래스
public class Manager { 
    private Map<String,Product> showcase = new HashMap<>();

    // register(): 이름과 인스턴스를 showcase에 저장한다.
    public void register(String name, Product prototype) {
        showcase.put(name, prototype); // put- 넣기
    }
    // create(): 등록된 제품의 createCopy()를 호출하여 복사본을 만든 다음, 이것을 반환함ㅠ
    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName); // get- 꺼내오기
        // return p;
        // return p.clone(); // 호출 주체가 manager이니까 안 된다.: clone()은 자기 자신만 호출할 수 있다. 
        return p.createCopy();

    }
}
