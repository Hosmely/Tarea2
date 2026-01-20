package Tarea2;

public class Ejercicio11 {
      public void Calificacion(int nota) {

        if (nota >= 90 && nota <= 100) {
            System.out.println("Calificacion: A");
            System.out.println("Aprobado");
        } 
        else if (nota >= 80) {
            System.out.println("Calificacion: B");
            System.out.println("Aprobado");
        } 
        else if (nota >= 70) {
            System.out.println("Calificacion: C");
            System.out.println("Aprobado");
        } 
        else if (nota >= 60) {
            System.out.println("Calificacion: D");
            System.out.println("Reprobado");
        } 
        else {
            System.out.println("Calificacion: F");
            System.out.println("Reprobado");
        }
}
}
