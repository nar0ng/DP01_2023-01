package ch10_Strategy;
public enum Hand {
    // 속성
    // 가위 바위 보를 나타내는 세 개의 enum 정수
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PARER("보", 2);

    // enum이 가진 필드
    private String name; // 가위, 바위, 보 손의 이름
    private int handvalue; // 가위, 바위, 보 손의 값

    // 손의 값으로 상수를 얻기 위한 배열
    private static Hand[] hands = {
        ROCK, SCISSORS, PARER
    };

    // 생성자
    private Hand(String name, int handvalue){
        this.name = name;
        this.handvalue = handvalue;
    }

    // 손의 값으로 enum 상수를 가져온다. 
    // getHand(): 가위바위보를 나타내는 숫자로부터 해당 손을 반환함.
    public static Hand getHand(int handvalue){
        return hands[handvalue]; // hand[1]
    }

    // isStrongerThan(): 현재 손이 입력인자로 들어온 손을 이기면 true
    public boolean isStrongerThan(Hand h){
        return fight(h) == 1;
    }

     // isWeakerThan(): 현재 손이 입력인자로 들어온 손에게 지면 true
    public boolean isWeakerThan(Hand h){
        return fight(h) == -1;
    }

    // fight(): 현재 손이 입력인자 손과 무승부-> 0, 이기면->1, 지면->-1
    private int fight(Hand h){
        if (this == h){
            return 0;
        } else if ((this.handvalue+1)%3 == h.handvalue){
            return 1;
            // 입력손이 2(가위), 현재 손이 1(보)
            // 입력 손(this.handvalue+1)%3=1
            // 현재 손 = 1
            // 이 경우에 입력손이 이긴다. 
            // (입력손+1)%3과 현재 손의 값이 같을 때 이긴다.
            
        } else {
            return -1;
        }
    }

    // toString(): 현재 손에 해당하는 문자열 반환
    @Override
    public String toString(){
        return name;
    }
}
