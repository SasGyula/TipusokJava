package oraimunka0227;

import java.util.Random;

public class BetukTomb {
    static Random rnd = new Random();
    public static void main(String[] args) {
        final int M = 9;
        char[] betuk = new char[M];
        for (int i = 0; i < M; i++) {
            betuk[i] = (char)(i+97);
        }
        for (int i = 0; i < M; i++) {
        if(i != 0 && i % 3 == 0){
            System.out.println("");
        }
            System.out.print(betuk[i]);
        }
        System.out.println("\n");
        int[] sorrend = {2,4,6,3,5,1,8,7,0};
        for (int i = 0; i < M; i++) {
        if(i != 0 && i % 3 == 0){
            System.out.println("");
        }
            System.out.print(betuk[sorrend[i]]);
        }
        System.out.println("\n");
        for (int i = 0; i < M; i++) {
            int j = (int) (Math.random()*M);
            int s = sorrend[i];
            sorrend[i] = sorrend[j];
            sorrend[j] = sorrend[s];
        if(i != 0 && i % 3 == 0){
            System.out.println("");
        }
            System.out.print(betuk[sorrend[i]]);
        }
            
        }
        
    }

