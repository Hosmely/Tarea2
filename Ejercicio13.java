package Tarea2;

import java.util.Scanner;

public class Ejercicio13 {
    public void Tabla() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
}
}
