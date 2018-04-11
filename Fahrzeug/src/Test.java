import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        Fahrzeug f = new Fahrzeug(4,"Auto");
        System.out.println("Dein Auto hat vier Räder welche Farbe soll es haben");
        String r;
        r = s.next();
        f.setFarbe(r);
        System.out.println("Dein Tyn des Fahrzeugs ist " + f.getTyp() + " und es hat " + f.getAnzahlräder() + " Räder und es ist " + f.getFarbe());
    }
}
