package Condicionales;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = lectura.nextLine().toLowerCase();

        switch (estadoAnimo) {
            case "feliz":
                System.out.println("Te recomiendo salir a pasear o disfrutar de un buen libro.");
                break;
            case "triste":
                System.out.println("Tal vez ver una película divertida o hablar con un amigo te ayude.");
                break;
            case "enérgico":
                System.out.println("¿Qué tal hacer ejercicio o practicar algún deporte?");
                break;
            case "relajado":
                System.out.println("Es un buen momento para meditar o disfrutar de un baño relajante.");
                break;
            default:
                System.out.println("Estado de ánimo no reconocido. Por favor elige entre: feliz, triste, enérgico o relajado.");
                break;
        }
    }
}
