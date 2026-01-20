package Tarea2;
import java.util.Scanner;

public class Ejercicio14 {
         public void Primo() {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
}
}
