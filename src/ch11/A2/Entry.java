package ch11.A2;

public abstract class Entry {
    // 자기 부모를 가리킴
    private Entry parent;

    // 부모를 설정한다
    protected void setParent(Entry parent) {
        this.parent = parent;
    }

    // 이름을 가져온다 
    public abstract String getName();

    // 크기를 가져온다 
    public abstract int getSize();

    // 목록을 표시한다 
    public void printList() {
        printList("");
    }

    // prefix를 앞에 붙여 목록을 표시한다
    protected abstract void printList(String prefix);

    // 문자열 표시
    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }

    // 전체 경로를 가져온다 
    public String getFullName() {
        // 문자열의 내용을 계속 바꿀 수 있는 객체
        // 계속내용이 바뀐는 string을 만들 수 있다.
        // 마지막에 toString()을 하면 최종 결과가 나온다. 
        StringBuilder fullname = new StringBuilder();  // StringBuilder: 문자열 구축을 위한 객체
        Entry entry = this; // entry가 현재 객체를 가리키게 함
        do {
            fullname.insert(0, entry.getName()); // offset:0 -> 현재 객체의 이름을 뺀 맨 앞에 삽입한다. 
            fullname.insert(0, "/");
            // entry 변수는 현재 노드를 가리킴
            entry = entry.parent; // 현재 위치(포인터)를 부모로 옮긴다. 
            // entry.parent는 엔트리의 부모인데 다시 그거를 엔트리로 한다.
        
        } while (entry != null); // 부모가 더 이상 없으면 루프를 빠져나옴
        // 이름을 얻어와서 계속 결과에 쌓아둔다. 
        return fullname.toString(); // 최종 문자열을 얻음
    }
}
