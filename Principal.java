package Tarea2;



public class Principal {
    public static void main(String[] args){
        Ejerciciio1 imprime = new Ejerciciio1();
        imprime.Imprimir();

        Ejercicio4 area = new Ejercicio4();
         System.out.println();
        System.out.println("El area del triangulo es: " + area.Area(5, 10));

        Ejercicio5 lineas = new Ejercicio5();
        System.out.println();
        lineas.Informacion();

        Ejercicio6 dato = new Ejercicio6();
        System.out.println();
        dato.variables();

        Ejercicio7 calculo = new Ejercicio7();
        calculo.calculadora();
        
        Ejercicio8 temperatura = new Ejercicio8();
        temperatura.Temperatura(15);

        Ejercicio9 circulo = new Ejercicio9();
        circulo.AreaCirculo();

        Ejercicio10 conversion = new Ejercicio10();
        conversion.Casting();

        Ejercicio11 nota = new Ejercicio11();
        nota.Calificacion(86);

        Ejercicio12 menu = new Ejercicio12();
        menu.Menu();

        Ejercicio13 tabla = new Ejercicio13();
        tabla.Tabla();

        Ejercicio14 primo = new Ejercicio14();
        primo.Primo();

        Ejercicio15 patron = new Ejercicio15();
        patron.Patron();
    }
}
