package oraimunka0227;

import java.util.Scanner;

public class Beugro {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.print("Adjon meg egy számot:");
//        int abszolutErtek = sc.nextInt();
        for (int i = 3; i > -3; i--) {
            System.out.println(i + " " +Math.abs(i));   
        }

        final int DB = 10;
        int[] tomb = new int[DB];
        for (int i = 0; i < DB; i++) {
            tomb[i] = (int) (Math.random()*45)*2+11;
        }
        tomb[DB/2]++;
        for (int i = 0; i < DB; i++) {
            if (tomb[i] % 2 == 0){
                System.out.println(tomb[i]+" ");
            }
        }
    }
    
   
}
