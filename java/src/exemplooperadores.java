
public class exemplooperadores {
/**
 * @param args
 */
public static void main(String[] args) {

    System.out.println("prePos");
    prePos();
    System.out.println("aritmétrico");
    aritimetico();
    System.out.println("atribuição");
    atribuiçao();
    System.out.println("precedência");
    precedencia();

    
}

private static void precedencia() {
    int i = 10;
    int j = 20;
    int k = 30;
    int a = i++ + --j * k; // 10 + 19 *30 -> 10+ 570 -> 580

    System.out.println(i);
    System.out.println(j);
    System.out.println(k);
    System.out.println(a);

   
   

}

private static void atribuiçao() {
    
    int i = 1500;
    short j = 15;
    int k = 35 ;
    float f = 3.5f;
    double d = f;

    System.out.println("d: " +d);
    
    i += 5; //i= i + 5
    j -= 3; //j = j -3
    d /= 2.7d; // d = d / 2.7
    k %= 2; //k = k %2

    i = k =j; //j = 12, k recebe 12, e recebe 12

    System.out.println(k);
    System.out.println(i);

    System.out.println("d:" + d);
    i += 5; //i = i +5
    j -= 3; //j = j - 3
    d /= 2.7d;// d = d / 2.7
    k %= 2; // k = k %2



}

private static void aritimetico() {

    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;
    int e = 50;

    int r1 = a+b;
    int r2 = c-a;
    int r3 = d*d;
    int r4 = e/a;
    int r5 = c%b;

    System.out.println("a + b + " + r1);
    System.out.println("c - a = "+ r2);
    System.out.println("d * b" + r3);
    System.out.println("e/a = " + r4);
    System.out.println("c % b =" + r5);



}

private static void prePos() {

int k = 10;
int i = ++k; //soma 1 =11
int j = k--;//j recebe 11 e o k se transforma em 10 subtrai 1 de 11
int x = k;
System.out.println("i: " + i);
System.out.println("j" + j);
System.out.println("x; " + x);





}






}




    
