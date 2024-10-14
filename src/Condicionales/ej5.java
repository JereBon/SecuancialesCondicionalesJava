package Condicionales;

import java.util.Random;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        Random random = new Random();

        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.print("Elige: piedra, papel o tijera: ");
        String eleccionUsuario = lectura.nextLine().toLowerCase();

        if (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera")) {
            System.out.print("La opción seleccionada no es válida");
        }

        int indiceComputadora = random.nextInt(3);
        String eleccionComputadora = opciones[indiceComputadora];

        System.out.println("La computadora eligió: " + eleccionComputadora);

        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("Es un empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("¡Perdiste!");
        }
    }
}
