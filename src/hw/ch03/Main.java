package hw.ch03;

public class Main {
    public static void main(String[] args) {
        System.out.println("20200903 김나령");
        AbstractDisplay d1 = new KimNaRyungDisplay("김나령","20200903", 3);

        d1.display(10);
        d1.display(5);
    }
}
