package Condicionales;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");

        double precioInicial = lectura.nextDouble();

        System.out.println("Elija su categoria de cliente:");
        System.out.println("1. Estudiante");
        System.out.println("2. Adulto");
        System.out.println("3. Jubilado");
        System.out.println("Ingrese el número de su categoria de cliente: ");

        int categoria = lectura.nextInt();

        switch (categoria){
            case 1:
                System.out.println("Precio final con descuento: $" + (precioInicial * 0.9));
                break;
            case 2:
                System.out.println("Precio final con descuento: $" + (precioInicial * 0.95));
                break;
            case 3:
                System.out.println("Precio final con descuento: $" + (precioInicial * 0.85));
                break;
        }
    }
}
