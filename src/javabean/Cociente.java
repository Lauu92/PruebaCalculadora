package javabean;

import java.util.Scanner;

public class Cociente {


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
                System.out.println("Introduce el dividendo: ");
                double dividendoInverso = leer.nextDouble();
                System.out.println("Introduce el divisor: ");
                double divisorInverso = leer.nextDouble();
                System.out.println(inversoReal(dividendoInverso,divisorInverso));
            break;
            case 4:
                System.out.println("Introduce el número a calcular: ");
                double raiz = leer.nextDouble();
                System.out.println(raizCuadrada(raiz));
            break;
        }

        leer.close();
    }

    public static double divisionReal(double dividendo, double divisor) {
        return dividendo/divisor;
    }

    public static int divisionEntero(int dividendo, int divisor) {
        return dividendo/divisor;
    }

    public static double inversoReal(double dividendoInverso, double divisorInverso) {
        return divisorInverso/dividendoInverso;
    }

    public static double raizCuadrada(double raiz) {
        return Math.sqrt(raiz);
    }
}
