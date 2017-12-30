import java.lang.reflect.Array;
import static  java.lang.System.out;
import java.util.*;

public class Test {
    public static void main(String[]args){
        /*String[] m = new String[]{"felix","Theodor"};
        Arryswords a = new Arryswords();
        for (int i = 0;i < m.length;i++)
        System.out.println(a.getLengths(m)[i]);
        */
        Scanner s = new Scanner(System.in);
        Random rnd = new Random();
        Set<Integer> lotto = new HashSet<Integer>();
        Set<Integer> numbers = new HashSet<Integer>();
        for (int i = 0;i < 6;i++){
            System.out.print("Bitte gib eine Lotto Zahhl ein");
            numbers.add(s.nextInt());
        }
        int i = 0;
        while (true){
        do {
            lotto.add(1 + rnd.nextInt(49));
            }while (lotto.size() < 6);
            Object[] lottoarray = lotto.toArray();
            Object[] numberarray = numbers.toArray();
            Arrays.sort(numberarray);
            Arrays.sort(lottoarray);
            //System.out.println(Arrays.toString(lottoarray));
            //System.out.println(Arrays.toString(numberarray) + i);
            i++;

            if (lottoarray[0] == numberarray[0]&&lottoarray[1] == numberarray[1]&&lottoarray[2] == numberarray[2]&&lottoarray[3] == numberarray[3]&&lottoarray[4] == numberarray[4]&&lottoarray[5] == numberarray[5]){
                out.println(i);
                break;
                }
             lotto.clear();
            }
        }
    }

