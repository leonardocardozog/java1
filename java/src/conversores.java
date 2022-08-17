public class conversores {

    public static void main(String[] args) {
        
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        int i2;
        long l2= 1000000000000000L;
        i2 = (int) l2; //= 148664554

        int i3;
        long l3 = 10000l;
        i3 = (int) l3; // downcast sem perda, pq 100000 cabe no inteiro

        double d1;
        float f1 = 10.5F;
        d1 = f1; // upcast

        float f2;
        float f3;
        double d2 = 10000.58d; // downcas cabe dentro do float

        f2 = (float) d2;
        double d3 = 10000.58888888888888888888888888888888888888888888; //houe perda de informação
        f3 = (float) d3;

        int i4;
        float f4 = 11.5697f;
        i4 = (int) f4;

        System.out.print(+b1);
        //System.out.print(+l1);
        System.out.print(+i2);
        System.out.print(+i3);
        System.out.print(+d1);
        System.out.print(+f2);
        System.out.print(+f3);
        System.out.print(+i4);
       
    }
    
}
