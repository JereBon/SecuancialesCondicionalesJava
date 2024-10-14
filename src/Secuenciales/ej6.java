package Secuenciales;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese cuántas horas al día puede estudiar:");
        int horasDia = lectura.nextInt();

        String[] materias = {"Matemáticas", "Ciencia", "Historia", "Lenguaje", "Programación", "Arte"};

        int horasSemanales = horasDia * 7;
        int horasMateria = horasSemanales / materias.length;
        int horasRestantes = horasSemanales % materias.length;

        System.out.println("Plan de estudio semanal:");
        for (int i = 0; i < materias.length; i++) {
            if (i < horasRestantes) {
                System.out.println(materias[i] + ": " + (horasMateria + 1) + " horas");
            } else {
                System.out.println(materias[i] + ": " + horasMateria + " horas");
            }
        }
    }
}
