package ch11.practice;

public class Main {
    public static void main(String[] args) {

        // Entry f1 = new File("v1", 100);
        // System.out.println(f1.getName());
        // System.out.println(f1.getSize());
        // System.out.println(f1);

        // 타입은 entry 실제 들어가는 건 디렉토리

        // 방법1. root를 directry로 선언하기 
        //Entry root = new Directory("root");
        Directory root = new Directory("root");

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        // 방법 2. 타입 캐스팅
        //((Direcroty)root).add(bin);
        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 100));
        bin.add(new File("latex", 200));

        System.out.println(root.getSize());

        root.printList();
        // root.printList("");

    }
}
