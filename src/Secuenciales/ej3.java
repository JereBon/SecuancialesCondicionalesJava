package Secuenciales;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Seleccione su nivel de condición física: (1) Principiante, (2) Intermedio, (3) Avanzado");
        int nivel = lectura.nextInt();

        switch (nivel) {
            case 1:
                System.out.println("Rutina semanal para Principiante:");
                System.out.println("Lunes: Correr - 20 minutos");
                System.out.println("Martes: Yoga - 30 minutos");
                System.out.println("Miércoles: Andar en bicicleta - 25 minutos");
                System.out.println("Jueves: Descanso");
                System.out.println("Viernes: HIIT - 15 minutos");
                System.out.println("Sábado: Nadar - 20 minutos");
                System.out.println("Domingo: Descanso");
                break;
            case 2:
                System.out.println("Rutina semanal para Intermedio:");
                System.out.println("Lunes: Correr - 30 minutos");
                System.out.println("Martes: Levantamiento de pesas - 40 minutos");
                System.out.println("Miércoles: Andar en bicicleta - 40 minutos");
                System.out.println("Jueves: HIIT - 25 minutos");
                System.out.println("Viernes: Nadar - 30 minutos");
                System.out.println("Sábado: Saltos de tijera - 20 minutos");
                System.out.println("Domingo: Descanso");
                break;
            case 3:
                System.out.println("Rutina semanal para Avanzado:");
                System.out.println("Lunes: Correr - 45 minutos");
                System.out.println("Martes: Levantamiento de pesas - 50 minutos");
                System.out.println("Miércoles: Andar en bicicleta - 60 minutos");
                System.out.println("Jueves: HIIT - 40 minutos");
                System.out.println("Viernes: Nadar - 50 minutos");
                System.out.println("Sábado: Saltos de tijera - 30 minutos");
                System.out.println("Domingo: Descanso activo - 30 minutos");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }
}
