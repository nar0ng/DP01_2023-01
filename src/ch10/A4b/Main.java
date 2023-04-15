package ch10.A4b;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서
        // 람디식을 이용함
        // Funtional interface: 메소드가 한 개만 선언되어 있는 인터페이스
        // Functional Interface 들어갈 자리에 람다식을 넣을 수 있다. 
        // Comparator 인터페이스 functional 인터페이스이다.
        //list.sort(인자))->바디 
        list.sort((a, b) -> a.compareTo(b)); //compare 메소드 바디를 제공한 것과 같다
        System.out.println(list);

        // 사전식 순으로 큰 순서
        list.sort((a, b) -> b.compareTo(a));
        System.out.println(list);
    }
}
