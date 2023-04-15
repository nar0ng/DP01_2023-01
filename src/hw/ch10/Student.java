package hw.ch10;

public class Student implements Comparable<Student> {
    // 속성
    private String name="";
    private String id = "";
    private int height = 0;

    // 생성자
    public Student(String name, String id, int height){
        this.name = name;
        this.id = id;
        this.height = height;
    }

    // 메소드
    // compareTo(): 객체의 height 크기를 오름차순으로 정렬될 수 있도록 결과값을 반환한다.
    @Override
    public int compareTo(Student s){
        if (this.height < s.getHeight()){
            return -1;
        } else if (this. height > s.getHeight()){
            return 1;
        }
        else {
            return 0;
        }
    }
    // toString(): 학생들의 이름과 키를 읽기 좋게 출력합니다. 
    @Override
    public String toString(){
    return("(이름:"+name+", 학번:"+id + ", 키:" + height+")");
    }

    public int getHeight() {
        return height;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }


}
