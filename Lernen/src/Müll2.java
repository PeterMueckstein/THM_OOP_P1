import java.util.Scanner;

public class Müll2 {
    public static void main(String[]args){
        System.out.print("Bitte geben sie erst den Vor- und dan den Nachnamen ein");
        Scanner s = new Scanner(System.in);
        String name;
        name = s.nextLine();
        System.out.print("Hallo " + name);
    }
}
