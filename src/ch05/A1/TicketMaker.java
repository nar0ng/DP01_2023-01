package ch05.A1;

public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();

    private TicketMaker() {
    }


    public static TicketMaker getInstance() {
        return singleton;
    }

    // synchronized -> 다수의 스레드가 동시에 이 메소드를 호출하면 같은 값을 반환할 위험 있음
    // 한 스레드가 synchronized 메소드를 호출하여 실행 시, 다른 스레드가 그 메소드를 호출하면
    // 그 메소드 실행이 완료될 때까지 기다려야 한다.                                                                                                                                                                                                                                                                                                                                                                                  
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
