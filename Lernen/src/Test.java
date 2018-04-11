import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        double i;
        double o;
        int j;
        double k = 0;
        System.out.println("Bitte Zahl");
        do {
            i = s.nextInt();
        }while (i <= 0);
        do {
            o = s.nextInt();
        }while (o <= 0);
        System.out.println("1 + 2 - 3* 4/");
        j = s.nextInt();
        switch (j){
            case 1 : k = i+o;
            break;
            case 2 : k = i-o;
            break;
            case 3 : k = i*o;
            break;
            case 4 : k = i/o;
            break;

        }

        System.out.println("Hallo hier Zahl " + k);
    }
}
