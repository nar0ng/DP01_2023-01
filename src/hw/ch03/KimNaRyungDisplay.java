package hw.ch03;

import hw.ch03.AbstractDisplay;

public class KimNaRyungDisplay implements AbstractDisplay {
    private String name; 
    private String studentid; 
    private int grade;     

    // 생성자 
    public KimNaRyungDisplay (String name, String studentid, int grade) {
        this.name = name;
        this.studentid = studentid;
        this.grade = grade;
    }

    @Override
    public void open() {
        System.out.println("====================");
        System.out.println("덕성여대 컴퓨터공학과");
    }

    @Override
    public void print() {
        System.out.println("학번 " + studentid + "/ " + grade + "학년" + "/ " + name );
    }

    @Override
    public void close() {
        System.out.println("템플릿 메소드 패턴 숙제입니다.");
        System.out.println("====================");
    }
}

