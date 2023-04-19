package ch10_Strategy;
import java.util.Random;

import ch10_Strategy.Hand;

public class WinningStrategy implements Strategy{
    // Strategy 인터페이스를 구현한다
    // nextHand() 에서의 전략
    // 직전의 승부에서 승리-> 동일한 손을 낸다.
    // 직전의 승부에서 패배-> 0~2사이의 난수를 낸다.

    private Random random; //임의의 수 생성기
    private boolean won = false; 
    private Hand prevHand; // 이전에 냈던 손 

    public WinningStrategy(int seed){
        random = new Random(seed); // seed가 같으면 동일한 숫자가 생성된다.
    }
    
    @Override
    // nextHand() 전략
    public Hand nextHand(){
        if (!won){
            prevHand = Hand.getHand(random.nextInt(3)); // 0, 1, 2 중 하나
        }
        return prevHand;
    }

    @Override
    public void study(boolean win){
        won = win;
    }

    @Override
    public void setStrategy(Strategy s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setStrategy'");
    }
    
}
