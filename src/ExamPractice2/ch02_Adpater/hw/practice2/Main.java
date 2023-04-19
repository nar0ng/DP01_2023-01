package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("20200903 김나령");
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            f.setValue("Year", "2023");
            f.setValue("bornYear", "2000");
            f.setValue("StudentId", "20200903");
            f.setValue("Name", "KimNaRyung");
            f.setValue("Location", "Seoul");
            f.writeToFile("KimNaRyung.txt");
            System.out.println("KimNaryung.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
