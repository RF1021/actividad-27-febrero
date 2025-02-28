import java.util.Random;
import java.util.Scanner;

public class adivinarnumero {
    public static void main(String[] args) {
        int max = 50;
        int min = 1;
        int num_ale;

        Random ale = new Random();
        Scanner scanner = new Scanner(System.in);

        num_ale = ale.nextInt((max - min + 1)) + min;

        System.out.println("He generado un numero aleatorio entre 1 y 50. ¡Intenta adivinarlo!");
        System.out.println();

        int intentos = 3;

        for (int i = 1; i <= intentos; i++) {
            System.out.println("Intento: " + i + " - Ingrese un número");
            int int_us = scanner.nextInt();

            if (int_us == num_ale) {
                System.out.println("¡Felicidades, adivinaste el número!");
                break; // Termina el ciclo si el número es correcto
            } else if (int_us > num_ale) {
                System.out.println("El número es menor. Intenta nuevamente.");
            } else {
                System.out.println("El número es mayor. Intenta nuevamente.");
            }

            if (i == intentos) {
                System.out.println("Se han agotado tus intentos. El número era: " + num_ale);
            }
        }
    }
}