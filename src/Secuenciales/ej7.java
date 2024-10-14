package Secuenciales;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese su nivel de satisfacción con la vida (1-10):");
        int satisfaccionVida = lectura.nextInt();

        System.out.println("Ingrese su nivel de estrés (1-10):");
        int nivelEstres = lectura.nextInt();

        System.out.println("Ingrese su nivel de salud (1-10):");
        int nivelSalud = lectura.nextInt();

        System.out.println("Ingrese su nivel de satisfacción con las relaciones personales (1-10):");
        int relacionesPersonales = lectura.nextInt();

        System.out.println("Ingrese su nivel de equilibrio trabajo-vida (1-10):");
        int equilibrioTrabajoVida = lectura.nextInt();

        int sumaFactores = satisfaccionVida + (10 - nivelEstres) + nivelSalud + relacionesPersonales + equilibrioTrabajoVida;
        double indiceFelicidad = sumaFactores / 5.0;

        System.out.println("Su índice de felicidad es: " + indiceFelicidad + "/10");
    }
}
