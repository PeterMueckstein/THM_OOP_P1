public class Arryswords {
    public int[] getLengths(String[] words){
        int[] x = new int[words.length];
        for (int i = 0;i < words.length;i++){
            x[i] = words[i].length();
        }
        return x;
    }
}
