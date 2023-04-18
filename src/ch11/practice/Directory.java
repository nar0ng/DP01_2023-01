package ch11.practice;

import java.util.ArrayList;
import java.util.List;

// compose(그릇)을 나타내는 클래스 
public class Directory extends Entry {
    private String name;

    // 자기 내용물 리스트를 관리하는 변수
    private List<Entry> directory = new ArrayList<>(); // Entry: 부모 타입 이 리스트는 엔트리를 담는 리스트
    // 엔트리의 자식은 파일, 디렉토리
    // 그래서 부모로 선언하면자식을 다 담을 수 있다. 

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    // 자기 내용물들의 getSize()를 호출함
    public int getSize() {
        int size = 0;

        // 확장 for 문
        for (Entry entry: directory) {
            size += entry.getSize(); // 재귀적 호출
        }
        return size;
    }

    @Override
    // prefix 앞의 폴더
    // 자기 찍고 자식 찍고
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);

        for (Entry entry: directory) {
            entry.printList(prefix + "/" + name); // 재귀적 호출. 전달받은 prefix/자기이름-> 새로운 prefix
                                                  //   경로가 차곡차곡 쌓임
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    // 부모타입이기 때문에 파일이나 엔트리 다 받을 수 있다.
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
