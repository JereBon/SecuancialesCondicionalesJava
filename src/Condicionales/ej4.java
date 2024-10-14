package Condicionales;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = lectura.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        double altura = lectura.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Tu IMC es:" + imc);

        if (imc < 18.5) {
            System.out.println("Tienes bajo peso. Considera consultar a un especialista para mejorar tu salud.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Tienes un peso normal. ¡Sigue así y cuida tu salud!");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Tienes sobrepeso. Sería bueno considerar un estilo de vida más activo.");
        } else {
            System.out.println("Tienes obesidad. Te recomendamos consultar a un médico para una evaluación adecuada.");
        }
    }
}
