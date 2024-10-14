package Condicionales;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("¿Cuántas horas duermes al día? ");
        int horasSueño = lectura.nextInt();

        System.out.print("¿Cuántas horas haces ejercicio al día? ");
        int horasEjercicio = lectura.nextInt();

        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = lectura.nextInt();

        System.out.println("Evaluación de tus hábitos saludables:");

        if (horasSueño < 7) {
            System.out.println("- Deberías intentar dormir al menos 7 horas al día para un mejor descanso.");
        } else if (horasSueño >= 7 && horasSueño <= 9) {
            System.out.println("- Tienes un buen hábito de sueño. ¡Sigue así!");
        } else {
            System.out.println("- Dormir más de 9 horas puede ser excesivo. Evalúa si realmente lo necesitas.");
        }

        if (horasEjercicio < 1) {
            System.out.println("- Intenta hacer al menos 1 hora de ejercicio al día para mantenerte activo.");
        } else if (horasEjercicio >= 1 && horasEjercicio <= 2) {
            System.out.println("- Estás haciendo un buen trabajo con el ejercicio diario.");
        } else {
            System.out.println("- ¡Excelente! Hacer más de 2 horas de ejercicio al día es impresionante.");
        }

        if (comidasSaludables < 3) {
            System.out.println("- Intenta consumir al menos 3 comidas saludables al día.");
        } else if (comidasSaludables == 3) {
            System.out.println("- Tienes un buen equilibrio de comidas saludables.");
        } else {
            System.out.println("- ¡Fantástico! Estás consumiendo muchas comidas saludables al día.");
        }
    }
}
