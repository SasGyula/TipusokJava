package oraimunka0227;
public class Gyakorlas {
    public static void main(String[] args) {
        final int M = 9;
        for (int i = 0; i < M; i++) {
            System.out.print((char) Math.random()*11+ " ");
        }
        for (char c = 'a'; c <= 'i'; c++) {
            System.out.println((int) c+ " = "+ c);
        }
        for (int i = 97; i < 106; i++) {
            System.out.print((char) i);
            if(i % 3 == 0){
                System.out.println("");
            }
        }
    }
}
