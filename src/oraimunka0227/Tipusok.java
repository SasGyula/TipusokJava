package oraimunka0227;

public class Tipusok {
    public static void main(String[] args) {
        final byte SZAM = 13;
        long f = 1;
        for (int i = 1; i <= SZAM; i++) {
            f *= i;  
        }
        System.out.println(SZAM+ "! = " + f);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE); 
        System.out.println(Long.MIN_VALUE); 
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        
        /*int feletti érték a végére L*/
        long nagy = 123_456_789_098L;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        System.out.println((int)Character.MIN_VALUE);
        System.out.println((int)Character.MAX_VALUE);
        /*ASCII a=97, b=98, A=65*/
        System.out.println("char és int");
        System.out.println("\'a\' ASCII kódja:" + (int) 'a');
        System.out.println("\'a\' ASCII kódja:" + (char) 98);
        
        System.out.println("valósak kezelése:");
        double dPi = Math.PI;
        float fPi = (float)Math.PI;
        System.out.println(dPi);
        System.out.println(fPi);
        System.out.printf("printf: %f\n" + dPi);
        System.out.printf("printf: %f\n" + fPi);
        System.out.printf("printf (15): %f\n" + dPi);
        System.out.printf("printf (15): %f\n" + fPi);
        if(dPi == fPi){
            System.out.println("dPi = fPi");
        }else{
            System.out.println("dPi != fPi");
        }
   }
}
