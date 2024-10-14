package Condicionales;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Elige tu género de película favorito:");
        System.out.println("1. Acción");
        System.out.println("2. Comedia");
        System.out.println("3. Drama");
        System.out.println("4. Ciencia Ficción");
        System.out.print("Ingresa el número correspondiente a tu elección: ");

        int eleccion = lectura.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("Te recomendamos ver: 'Mad Max: Furia en el camino'");
                break;
            case 2:
                System.out.println("Te recomendamos ver: 'La gran apuesta'");
                break;
            case 3:
                System.out.println("Te recomendamos ver: 'El club de la pelea'");
                break;
            case 4:
                System.out.println("Te recomendamos ver: 'Blade Runner 2049'");
                break;
            default:
                System.out.println("Lo sentimos, esa no es una opción válida.");
                break;
        }
    }
}
