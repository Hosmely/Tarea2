package Tarea2;
public class Ejercicio10 {

    public void Casting(){
        int entero = 5;
        double decimal;
         
        //conversion implicita de int a double
        decimal = entero; 
        System.out.println(entero);
        System.out.println(decimal);

        //conversion explicita de double a int
        double decimal2 = 8.7;
        int entero2;

        entero2 = (int) decimal2;
        System.out.println(decimal2);
        System.out.println(entero2);
    }
}
