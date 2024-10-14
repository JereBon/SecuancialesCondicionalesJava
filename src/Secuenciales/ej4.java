package Secuenciales;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Seleccione su estado de ánimo: (1) Feliz, (2) Triste, (3) Enérgico, (4) Relajado");
        int estado = lectura.nextInt();

        switch (estado) {
            case 1:
                System.out.println("Lista de reproducción para cuando estás feliz:");
                System.out.println("1. Pharrell Williams - Happy");
                System.out.println("2. Justin Timberlake - Can't Stop the Feeling!");
                System.out.println("3. Katrina and the Waves - Walking on Sunshine");
                System.out.println("4. Bruno Mars - Uptown Funk");
                System.out.println("5. Jason Mraz - I'm Yours");
                break;
            case 2:
                System.out.println("Lista de reproducción para cuando estás triste:");
                System.out.println("1. Adele - Someone Like You");
                System.out.println("2. Sam Smith - Too Good at Goodbyes");
                System.out.println("3. The Fray - How to Save a Life");
                System.out.println("4. Coldplay - Fix You");
                System.out.println("5. Lewis Capaldi - Someone You Loved");
                break;
            case 3:
                System.out.println("Lista de reproducción para cuando estás enérgico:");
                System.out.println("1. Survivor - Eye of the Tiger");
                System.out.println("2. AC/DC - Thunderstruck");
                System.out.println("3. Queen - We Will Rock You");
                System.out.println("4. Eminem - Lose Yourself");
                System.out.println("5. Kanye West - Stronger");
                break;
            case 4:
                System.out.println("Lista de reproducción para cuando estás relajado:");
                System.out.println("1. Norah Jones - Don't Know Why");
                System.out.println("2. John Mayer - Gravity");
                System.out.println("3. Coldplay - The Scientist");
                System.out.println("4. Jack Johnson - Banana Pancakes");
                System.out.println("5. Louis Armstrong - What a Wonderful World");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }
    }
}
