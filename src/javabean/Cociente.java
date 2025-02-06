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
            case 1: divisionReal();
            break;
            case 2: divisionEntero();
            break;
            case 3: inversoReal();
            break;
            case 4: raizCuadrada();
            break;
        }
    }

    public static double divisionReal() {
        double resultado = 0;
        return resultado;

    }

    public static int divisionEntero() {
        int resultado = 0;
        return resultado;
    }

    public static double inversoReal() {
        double resultado = 0;
        return resultado;
    }

    public static double raizCuadrada() {
        double resultado = 0;
        return resultado;
    }
}
