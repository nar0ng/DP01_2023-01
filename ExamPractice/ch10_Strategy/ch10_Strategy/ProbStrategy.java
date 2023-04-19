package ch10_Strategy;
import java.util.Random;

import ch10_Strategy.Hand;

public class ProbStrategy implements Strategy {
    // ProbStrategy는 Strategy 인터페이스를 구현
    // 이전에 내보낸 손의 정보와 이전에 내보낸 손이 이긴 경우
    // 그 다음에 내보낼 손을 선택하는 알고리즘을 가지고 있다. 
    private Random random; // 임의의 수
    private int prevHandValue = 0;
    private int currentHandValue = 0;

    // history 필드: 과거의 승패를 유지하는 테이블
    // history [직전에 낸 손][이번에 낼 손]
    // 이력이 높을수록 컴퓨터가 해당 손을 낼 확률이 높아진다.
    //-> 가위, 바위, 보에 대한 승패기록이 각각 다른 위치에 저장된다.  
    private int[][] history = {
            { 1, 1, 1 },
            { 1, 1, 1 },
            { 1, 1, 1 },
    };
    // history[0][0]: 이전에 바위를 냈을 때 이번에도 바위를 낼 확률
    // history[0][1]: 이전에 바위를 냈을 때 이번에는 가위를 낼 확률
    // history[0][2]: 이전에 바위를 냈을 때 이번에는 보를 낼 확률

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    // nextHand(): 컴퓨터가 다음에 낼 손을 반환한다.
    @Override
    public ch10_Strategy.Hand nextHand() {
        // 이전에 낸 손 (prev)와 현재까지 낸 손(current)를 이용하여 
        // 다음에 낼 손을 확률적으로 계산한다. 

        int bet = random.nextInt(getSum(currentHandValue));
        int handvalue = 0; // 다음에 낼 손의 값 저장

        // 행 고정
        if (bet < history[currentHandValue][0]) { // 첫 번째 구간 3
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) { // 두 번째 구간 3+5
            handvalue = 1;
        } else { // 3+5+8
            handvalue = 2;
        }
        prevHandValue = currentHandValue; // 직전의 것을 pre에 담음
        currentHandValue = handvalue; // 이번 것을 current에 담음
        return Hand.getHand(handvalue);

    }

    private int getSum(int handvalue){
        int sum =0;
        for(int i = 0; i<3; i++){
            sum += history[handvalue][i]; // handvalue
        }
        return sum;
        // history[0][0]+ history[0][1]+ history[0][2]: 값이 반환된다.
        // 이번에 낼 손의 범위를 결정한다. 
    }

    // Strategy 인터페이스의 study를 구현함
    @Override
    public void study(boolean win){
        if(win){
            history[prevHandValue][currentHandValue]++; // 이겼으면 이 칸에 1을 더한다.
        } else {
            history[prevHandValue][(currentHandValue+1)%3]++; // 졌으면 나머지 칸에 1을 더한다. 
            history[prevHandValue][(currentHandValue+2)%3]++;
        }
    }

    @Override
    public void setStrategy(Strategy s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStrategy'");
    }


}
