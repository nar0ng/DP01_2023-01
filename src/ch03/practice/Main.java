package ch03.practice;

public class Main {
    public static void main(String[] args) {

        AbstractDisplay x;
        
        x = new CharDisplay('a');
        x.open();
        x.print();
        x.close();

        x.display();

        AbstractDisplay s = new StringDisplay("김나령");

        s.open();
        s.print();
        s.close();
        };
    }
    

