public class Müll6 {
    public static void main(String[]args){
     double[] d = new double[20];
     for (int i = 0;i < 20;i++){
         d[i] = Math.random();
     }
     double b=0;
     for (int i = 0;i < 20;i++){
         if (d[i] > b){
             b = d[i];
         }
            System.out.println(d[i]);
     }
     System.out.println("Die größte Zahl ist " + b);
    }
}