package ch11.practice;

public class Main {
    public static void main(String[] args) {
        Entry f1 = new File("v1", 100);
        System.out.println(f1.getName());
        System.out.println(f1.getSize());
        System.out.println(f1);
    }
}
