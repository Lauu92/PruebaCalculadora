package calculadora;

import java.util.Scanner;

/**
 * @author Laura Vinseiro
 * @version 1.0
 * Clase que proporciona operaciones matemáticas relacionadas con el Cociente.
 *
 *
 */
public class Cociente {


    /**
     * Genera un menú con las opcinones a elegir. Cada opción invoca uno de los métodos de la clase.
     * La elección de los números es llevada a cabo mediante Scanner por el usuario, y se decide con
     * un Switch.
     */
    public static void menuCociente() {
        System.out.println("¿Qué quieres hacer? Introduce el número correspondiente a cada opción: ");
        System.out.println("1. División de dos números reales.");
        System.out.println("2. División de dos números enteros. ");
        System.out.println("3. Inverso de un número real. ");
        System.out.println("4. Raíz cuadrada de un número.");

        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduce el dividendo: ");
                double dividendoReal = leer.nextDouble();
                System.out.println("Introduce el divisor: ");
                double divisorReal = leer.nextDouble();
                System.out.println(divisionReal(dividendoReal,divisorReal));
                break;
            case 2:
                System.out.println("Introduce el dividendo: ");
                int dividendoEntero = leer.nextInt();
                System.out.println("Introduce el divisor: ");
                int divisorEntero = leer.nextInt();
                System.out.println(divisionEntero(dividendoEntero,divisorEntero));
            break;
            case 3:
                System.out.println("Introduce el número a calcular: ");
                double numeroInverso = leer.nextDouble();
                System.out.println(inversoReal(numeroInverso));
            break;
            case 4:
                System.out.println("Introduce el número a calcular: ");
                double raiz = leer.nextDouble();
                System.out.println(raizCuadrada(raiz));
            break;
        }

        leer.close();
    }

    /**
     * Calcula una división con números reales.
     * @param dividendo dividendo de la división.
     * @param divisor divisor de la división.
     */
    public static double divisionReal(double dividendo, double divisor) {
        return dividendo/divisor;
    }

    /**
     * Calcula una división con números enteros.
     * @param dividendo dividendo de la división.
     * @param divisor divisor de la división.
     */
    public static int divisionEntero(int dividendo, int divisor) {
        return dividendo/divisor;
    }

    /**
     * Calcula el inverso de un número real.
     * @param numeroInverso número a calcular.
     */
    public static double inversoReal(double numeroInverso) {
        return 1/numeroInverso;
    }

    /**
     * Calcula la raíz cuadrada de un número.
     * @param raiz número a calcular.
     */
    public static double raizCuadrada(double raiz) {
        return Math.sqrt(raiz);
    }
}
