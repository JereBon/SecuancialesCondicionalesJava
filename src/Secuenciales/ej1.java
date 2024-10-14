package Secuenciales;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento en formato DD/MM/AAAA");
        String fechaNacimiento = lectura.nextLine();

        String[] diaMes = fechaNacimiento.split("/");
        int dia = Integer.parseInt(diaMes[0]);
        int mes = Integer.parseInt(diaMes[1]);

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Acuario");
            System.out.println("Hoy es un buen día para innovar. ¡Sé creativo!");
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.println("Piscis");
            System.out.println("Escucha a tu intuición, te guiará por el camino correcto.");
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Aries");
            System.out.println("La energía está de tu lado, ¡aprovéchala al máximo!");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Tauro");
            System.out.println("La estabilidad será clave hoy. Mantente firme en tus decisiones.");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Géminis");
            System.out.println("La comunicación será tu herramienta más poderosa hoy.");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Cáncer");
            System.out.println("El amor y el apoyo de tu familia te harán sentir en paz.");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Leo");
            System.out.println("Hoy es un buen día para brillar y mostrar tu confianza.");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Virgo");
            System.out.println("La organización será tu aliada para cumplir tus metas.");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Libra");
            System.out.println("Busca el equilibrio en todas tus acciones hoy.");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Escorpio");
            System.out.println("Es un día para la introspección y el crecimiento personal.");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Sagitario");
            System.out.println("Es un día para la introspección y el crecimiento personal.");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Capricornio");
            System.out.println("La disciplina y el esfuerzo te acercarán a tus objetivos.");
        } else {
            System.out.println("Desconocido");
            System.out.println("Signo no reconocido. Intenta de nuevo.");
        }
    }
}