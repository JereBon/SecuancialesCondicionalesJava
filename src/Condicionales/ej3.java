package Condicionales;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Elige tu género de libro favorito:");
        System.out.println("1. Fantasía");
        System.out.println("2. Misterio");
        System.out.println("3. Romance");
        System.out.println("4. Ciencia Ficción");
        System.out.print("Ingresa el número correspondiente a tu elección: ");

        int eleccion = lectura.nextInt();

        switch (eleccion) {
            case 1:
                System.out.println("Te recomendamos leer: 'El nombre del viento' de Patrick Rothfuss");
                break;
            case 2:
                System.out.println("Te recomendamos leer: 'El silencio de los corderos' de Thomas Harris");
                break;
            case 3:
                System.out.println("Te recomendamos leer: 'Orgullo y prejuicio' de Jane Austen");
                break;
            case 4:
                System.out.println("Te recomendamos leer: 'Dune' de Frank Herbert");
                break;
            default:
                System.out.println("Lo sentimos, esa no es una opción válida.");
                break;
        }
    }
}
