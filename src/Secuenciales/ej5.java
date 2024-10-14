package Secuenciales;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese la distancia del viaje en kilómetros:");
        double distancia = lectura.nextDouble();

        System.out.println("Ingrese el consumo de combustible del vehículo (litros por kilómetro):");
        double consumoCombustible = lectura.nextDouble();

        System.out.println("Ingrese el precio del combustible por litro:");
        double precioCombustible = lectura.nextDouble();

        double costoTotal = distancia * consumoCombustible * precioCombustible;

        System.out.println("El costo total del viaje es: $" + costoTotal);
    }
}