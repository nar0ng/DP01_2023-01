package hw.ch10;

import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20200903 이름: 김나령");
        // 1. Student List 생성
        List<Student> list = new ArrayList<Student>();

        // 2. Studnet 객체 5개 생성
        Student s1 = new Student("최승훈", "1", 180);
        Student s2 = new Student("김나령", "2", 175);
        Student s3 = new Student("신짱구", "3",100);
        Student s4 = new Student("김철수", "3",95);
        Student s5 = new Student("흰둥이", "3",120);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        // 3. 키 순으로 오름차순 정렬된 학생 리스트 출력하기
        System.out.println("** (1) 정렬 결과 (오름차순)");
        list.sort(new Comparator<Student>() {
            public int compare(Student a, Student b){
                return a.compareTo(b);
            }
        });
        System.out.println(list.toString());

        // 4. 키 순으로 내림차순 정렬된 학생 리스트 출력하기 
        System.out.println("** (2) 정렬 결과 (내림차순)" );
        list.sort(new Comparator<Student>() {
            public int compare(Student a, Student b){
                return b.compareTo(a);
            }
        });
        System.out.println(list.toString());
    }
}
