import java.util.Scanner;

public class Müll4 {
    public static void main(String[]args){
        double konto = 1000;
        Scanner s = new Scanner(System.in);
        System.out.print("Wenn sie Geld abheben möchten drücken sie die 1 ,wenn sie Geld einzahlen möchten drücken sie die 2");
        int i;
        do {
        i = s.nextInt();

            if (i == 1){
                System.out.print("Wie viel geld wollen sie abheben?");
                int geld = s.nextInt();
                if (geld > konto){
                    System.out.print("Du kannst nicht diese Menge an Geld abheben");
                    continue;
                }
                konto -= geld;
                break;
            }
            if (i == 2){
                System.out.print("Wie viel Geld wollen sie einzahlen?");
                int geld = s.nextInt();
                konto += geld;
                break;
            }
            System.out.print("Bitte gib eins oder 2 ein");
        }while (i != 1 || i != 2);
            System.out.print("Du hast noch " + konto + "Geld");
    }
}
