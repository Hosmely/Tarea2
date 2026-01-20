package Tarea2;

import java.util.Scanner;

public class Ejercicio12 {
    public void Menu() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese dos numeros: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Resultado: " + (a + b));
                    break;

                case 2:
                    System.out.print("Ingrese dos numeros: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Resultado: " + (a - b));
                    break;

                case 3:
                    System.out.print("Ingrese dos numeros: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    System.out.println("Resultado: " + (a * b));
                    break;

                case 4:
                    System.out.print("Ingrese dos numeros: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    if (b != 0) {
                        System.out.println("Resultado: " + (a / b));
                    } else {
                        System.out.println("No se puede dividir entre cero");
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opción no valida");
            }

            System.out.println();

        } while (opcion != 5);
    }
}
