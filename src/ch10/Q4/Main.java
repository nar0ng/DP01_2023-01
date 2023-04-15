package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서
        // list: 전략을 가지는 컨텍스트
        // comparator: 전략에 해당됨
        list.sort( new ComparatorAscending() );
        System.out.println(list);

        // 사전순으로 큰 순서 
        list.sort( new ComparatorDesending() );
        System.out.println(list);
    }
}
