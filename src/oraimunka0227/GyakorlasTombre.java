package oraimunka0227;
public class GyakorlasTombre {
    public static void main(String[] args) {
        final int M = 9;
        char[] betuk = {'a', '\n', ' '};// üres  nem lehet
        betuk = new char[M];
        betuk[0] = 'x';
        betuk[1] = 'x';
        betuk[2] = 'x';
        betuk[3] = 'x';
        betuk[4] = 'x';
        for (int i = 0; i < betuk.length; i++) {
            System.out.print(betuk[i]+ " ");
        }
        System.out.println("");
    }
}
