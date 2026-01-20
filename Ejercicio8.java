package Tarea2;
import java.util.Scanner;
public class Ejercicio8 {
    public void Temperatura(double temp){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige:\n1.Farenheit a Celcius\n2.Celcius a Farenheit");
        int opcion  = sc.nextInt();
        if(opcion == 1)
            {
            double farenheit = temp-32*5/9;
            System.out.printf("%.2f en farenheit es: .2f",temp,farenheit);
            }
        else{
           double celcius = temp*9/5+32;
            System.out.printf("%.2f en celcius es: .2f",temp,celcius);
        }
    }
}
