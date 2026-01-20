package Tarea2;
import java.util.Scanner;
/*Crea un programa que calcule el área y perímetro de un círculo:
- Usa una constante para PI (3.14159)
- Lee el radio desde el teclado
- Calcula y muestra área y perímetro

**Fórmulas:**
- Área = π × r²
- Perímetro = 2 × π × r
 */
public class Ejercicio9 {
    public void AreaCirculo(){
        Scanner sc = new Scanner(System.in);
        double pi =3.14159;
        System.out.println("Ingrese el radio: " );
        int radio =sc.nextInt();
        double area = pi *radio*radio;
        double perimetro = 2 * pi * radio;
         System.out.printf("Area: %.2f Perimetro: %.2f ", area, perimetro );
    }
}
