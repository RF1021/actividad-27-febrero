import java.util.Random;
import java.util.Scanner;


public class act4 {
    public static void main(String[] args) {
        Random ale = new Random();
        Scanner sc = new Scanner(System.in);
        boolean segu = true;
        int $;
        int rand = 0;
        int next;
        System.out.println("ingresa monto de dinero que va a apostar: ");
        $ = sc.nextInt();

        do {
            rand = ale.nextInt((3 - 1 + 1)) + 1;
            if (rand == 1) {
                $ = $ * 2;
                System.out.println("ganaste, tu dinero sube!, saldo actual :" + $ + "quieres seguir?");
                System.out.println("si: 1, no: 2");
                next = sc.nextInt();
                if (next == 1) {
                    System.out.println("continumeos");
                } else if (next == 2) {
                    System.out.println("hasta la proxima!, tu dinero actual es:" + $);
                }
            } else if (rand == 2) {
                $ = $ / 2;
                System.out.println("tu dinero ha bajado por la mitad!, saldo actual :" + $ + "quieres seguir?");
                System.out.println("si: 1, no: 2");
                next = sc.nextInt();
                if (next == 1) {
                    System.out.println("continumeos");
                } else if (next == 2) {
                    System.out.println("hasta la proxima!, tu dinero actual es:" + $);
                }
            } else {
                $ = 0;
                System.out.println("no tienes dinero,suerte a la siguiente");
                System.out.println("tu dinero actual es:" + $);
                segu = false;

            }
        } while (segu);
    }
}