import java.util.Scanner;

public class Müll3 {
    public static void main(String[]args){
        System.out.print("Bitte geben sie zwei Zahlen ein");
        Scanner s = new Scanner(System.in);
        int i;
        int j;
        int ergSumme;
        int ergdifferenz;
        int ergProduct;
        int ergQuotient;
        i = s.nextInt();
        j = s.nextInt();
        ergSumme = i +j;
        ergdifferenz = i- j;
        ergProduct = i*j;
        ergQuotient= i/j;
        System.out.print("Summe "+ergSumme + " Differenz "+ ergdifferenz+ " Product " + ergProduct + " Qutienten "+ ergQuotient);
    }
}
