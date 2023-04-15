package ch10.Q4;

import java.util.Comparator;

//public class ComparatorAscending implements Comparator {
public class ComparatorAscending implements Comparator<String>{

    @Override
    // 오름차순으로 정렬되도록 반환값을 리턴해야함
    //public int compare(Object a, Object b)
    public int compare(String a, String b) { // a과 b를 비교함 크기 비교 메소드
        // 뭐가 올 지 모르기 때문에 타입을 object를 쓴다.
        // 반환값: 양수, 음수 , 0
        // 정렬 주체(List)는 양수가 리턴되면 a와 b의 위치를 서로 바꾼다.
        // 오름차순: 작은 것이 앞에 옴
        // 큰 게 앞에 오면 양수를 리턴해야 함 <- 우리가 해줘야 할 일
        //return ((String) a).compareTo((String) b); // . 이 우선순위가 가장 높다. a.compare을 먼저한다.
        return a.compareTo(b);
        // a의 문자코드 - b의 문자코드
        // if a<b의 경우 음수가 리턴됨
        // if a>b의 경우 양수가 리턴됨 => a와 b의 위치를 바꾼다.=> 오름차순이 하는 일 -> 큰 거를 뒤로 보낸다'
        // 따라서 저거를 리턴해주면 됨
    }

}
