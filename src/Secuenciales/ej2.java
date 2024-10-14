package Secuenciales;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos:");
        double peso = lectura.nextDouble();

        System.out.println("Ingrese la duración del ejercicio en minutos:");
        int tiempo = lectura.nextInt();

        System.out.println("Seleccione el tipo de ejercicio: (1) Correr, (2) Nadar, (3) Andar en bicicleta");
        int ejercicio = lectura.nextInt();

        double caloriasQuemadas = 0;

        double MET = 0;

        switch (ejercicio){
            case 1:
                MET = 9.8;
                System.out.println("Calorías quemadas corriendo: " + (0.0175 * MET * peso * tiempo));
                break;
            case 2:
                MET = 7.0;
                System.out.println("Calorías quemadas nadando: " + (0.0175 * MET * peso * tiempo));
                break;
            case 3:
                MET = 8.5;
                System.out.println("Calorías quemadas andando en bicicleta: " + (0.0175 * MET * peso * tiempo));
                break;
            default:
                System.out. println("Opción no válida. Intente de nuevo.");
                break;
        }
    }
}
