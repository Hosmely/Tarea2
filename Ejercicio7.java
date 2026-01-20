package Tarea2;
import java.util.Scanner;
/*Crea un programa que lea dos números desde el teclado y muestre:
- La suma
- La resta
- La multiplicación
- La división
- El módulo (residuo)

**Pista:** Usa `Scanner` para leer los datos. */
public class Ejercicio7 {
    public void calculadora(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese el primer numero: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        double b =sc.nextDouble();
        System.out.printf("Suma: %.2f ",a+b );
        System.out.printf("resta: %.2f ",a-b);
        System.out.printf("Multiplicacion: %.2f ",a*b);
        System.out.printf("Division: %.2f  ",a/b);
        System.out.printf("Modulo: %.2f ",a%b);
    }
}
