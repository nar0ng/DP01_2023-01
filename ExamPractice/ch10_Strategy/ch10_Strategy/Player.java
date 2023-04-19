
package ch10_Strategy;

public class Player {
    private String name = "";

    private Strategy strategy; // 현재의 전략을 보관함

    private int wincount = 0;
    private int losecount = 0;
    private int gamecount = 0;

    // 이름과 전략을 받아서 플레이어 생성
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    // 전략에 따라 다음 손을 결정함
    public Hand nextHand() {
        return strategy.nextHand(); // 자신의 다음손을 결정하지 않고 현재 전략 객체에게 위임한다. !! 위임 !!
    }

    // 승리
    public void win() {
        strategy.study(true);
        wincount++;
        gamecount++;
    }


    // 패배
    public void lose() {
        strategy.study(false);
        losecount++;
        gamecount++;
    }

    // 무승부
    public void even() {
        gamecount++;
    }

    @Override
    public String toString(){
        return "["
        +name+":"
        +gamecount+"games,"
        +wincount+"win,"
        +losecount+"lose"
        +"]";
    }

    // 전략을 교체하는 메소드
    public void setStrategy(Strategy s){
        this.strategy = s;
    }

}
