package ch10.practice;

import java.util.Random;
// 전략2: 바로 전에 내밀었던 손으로부터, 다음에 내밀 손을 확률적으로 계산한다.
public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0;
    private int currentHandValue = 0;
    // 2차원 배열
    // 직선 -> 평면 x축, y축
    // history-> 과거의 승패를 유지하는 테이블
    private int[][] history = {
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue)); //currentHandValue - 직전에 냈던 손-> 임의의 수
        int handvalue = 0;

        if (bet < history[currentHandValue][0]) { // 첫 번째 구간 
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) { // 두 번째 구간 3+5
            handvalue = 1;
        } else { // 세 번째 구간 3+5+8
            handvalue = 2;
        }
        prevHandValue = currentHandValue; // 직전의 것을 pre에 담음
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i]; // handvalue
        }
        return sum;
    }

    @Override
    public void study(boolean win) { 
        if (win) {
            history[prevHandValue][currentHandValue]++; // 이겼으면 이 칸에 1을 더한다.
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++; //졌으면 나머지 칸에 1을 더한다. %3을 하는 이유 0 때문이다. 
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }

    @Override
    public void setStrategy(Strategy s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStrategy'");
    }
}
