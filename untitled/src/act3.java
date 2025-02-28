import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float peso;
        float alt;

        System.out.println("ingresa tu altura: ");
        alt = sc.nextFloat();
        System.out.println("ingresa tu peso: ");
        peso = sc.nextFloat();

        float imc = peso / (alt * alt);

        if (imc < 18.5) {
            System.out.println("bajo peso");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("normopeso");
        } else if (imc > 25 && imc < 26.9) {
            System.out.println("sobrepeso grado 1");
        } else if (imc > 27 && imc < 29.9) {
            System.out.println("sobrepeso grado 2");
        } else if (imc > 30 && imc < 34.9) {
            System.out.println("obesidad tipo 1");
        } else if (imc> 35 && imc<39.9) {
            System.out.println("obesidad tipo 2");
        } else if (imc>40 && imc<49.9) {
            System.out.println("obesidad tipo 3 (morbida)");
        } else {
            System.out.println("obesidad tipo 4 (extrema)");
        }
    }
}