import java.util.Scanner;

public class Müll5 {
    public static void main(String[]args){
        System.out.print("Bitte geben sie Die höhe und den durchmesser ein");
        Scanner s = new Scanner(System.in);
        double h;
        double d;
        double r;
        double umfang;
        double flaechboden;
        double mantelflaeche;
        double flaeche;
        double v;
        h = s.nextDouble();
        d = s.nextDouble();
        r = d /2;
        umfang = d * Math.PI;
        flaechboden = Math.PI * (r*r);
        mantelflaeche = 2 * Math.PI * r * (r + h);
        flaeche = 2 * flaechboden + mantelflaeche;
        v = Math.PI * (r*r) * h;
        System.out.print(" Die Dose hat dem Umfang von : " + umfang + "\n Höhe :" + h + "\n Durchmesser vom Boden: " + d + "\n Fläche vom Boden: " + flaechboden + "\n Mantelfläche: " + mantelflaeche + "\n Gesamtfläche: " + flaeche + "\n Volumen: "+ v);
    }
}
