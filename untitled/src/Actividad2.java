import java.util.Random;
import java.util.Scanner;


public class Actividad2 {
    public static void main(String[] args) {

        int max = 50;
        int min = 1;
        int num;
        int user;
        int i = 0;

        Random ale = new Random();

        num = ale.nextInt((max - min + 1)) + min;
        Scanner teclado = new Scanner(System.in);

        while (i < 3){
            System.out.println("inserta un numero: ");
            user = teclado.nextInt();
            System.out.println(user);

            if (user > num) {
                System.out.println("es numero correcto es menor");
                System.out.println();
            }
              else if (user < num) {
                System.out.println("es numero correcto es menor");
                System.out.println();
            }
              else if (user == num) {
                    System.out.println("es numero correcto es menor");
                    System.out.println();
                    break;
            }
            else {
                System.out.println("perdiste, el numero es :" + num);
                System.out.println();
            }
            i++ ;
        }
    }

}
