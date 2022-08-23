

public class Usuario {

public static void main(String[] args) {

SmaTv1 smartv = new SmaTv1();

    System.out.println("Tv ligada ?" + smartv.ligada);

    System.out.println(smartv.canal);
    smartv.mudarCanal(13);
    System.out.println("Canal atual:" +smartv.canal);

    System.out.println(smartv.volume);
    //aqui vou imprimir o estado atual da minha Tv.


    smartv.diminuirVolume();
    smartv.diminuirVolume();
    smartv.diminuirVolume();
    smartv.aumentarVolume();
    System.out.println("volume Atual:"+ smartv.volume);

    smartv.ligar();
    System.out.println("novo status: + smartv.ligada");

    smartv.desligar();
    System.out.println("novo status:" + smartv.ligada);














}
}


