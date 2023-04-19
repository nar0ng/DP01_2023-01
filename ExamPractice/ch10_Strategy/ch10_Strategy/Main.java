package ch10_Strategy;

import ch10_Strategy.Hand;
import ch10_Strategy.Player;

public class Main {
public static void main(String[] args) {

    // 1. 플레이어 생성
    Player p1 = new Player("신짱구", new ProbStrategy(100));
    Player p2 = new Player("김철수", new WinningStrategy(200));

   // p2.setStrategy(new ProbStrategy(300)); // 전략을 동적으로 교체함

    // 2. 게임 시작
    for (int i=0; i<500; i++){
        Hand h1 = p1.nextHand();
        Hand h2 = p2.nextHand();

        if (h1.isStrongerThan(h2)){
            System.out.println("winner"+p1);
            p1.win();
            p2.lose();
        } else if (h1.isWeakerThan(h2)){
            System.out.println("winner"+p2);
            p2.win();
            p1.lose();
        }
        else {
            System.out.println("Even!!");
            p1.even();
            p2.even();
        }
    }
    System.out.println("Total result:");
    System.out.println(p1);
    System.out.println(p2);
}
}
