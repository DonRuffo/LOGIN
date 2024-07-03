package org.example;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner opcion = new Scanner(System.in);


        boolean aux = true;
        while (aux) {
            System.out.println("Bienvenidos al Sistema de Prácticas Preprofesionales");
            System.out.println("\t Menú");
            System.out.println("1. Tutor");
            System.out.println("2. Estudiante");
            System.out.println("3. Administrador");
            System.out.println("4. Salir");
            System.out.println("Ingrese el perfil de usuario: ");
            int op = opcion.nextInt();

            opcion.nextLine();
            if (op == 1) {
                System.out.println("*****************************");
                System.out.println("\tTUTOR");
                System.out.println("Ingrese su nombre: ");
                String nombre = opcion.nextLine();
            } else if (op == 2) {
                System.out.println("*****************************");
                System.out.println("\tEstudiante");
                System.out.println("Ingrese su nombre: ");
                String nombreEst = opcion.nextLine();
            }

            if (op == 4) {
                aux = false;
            }
        }


    }
}
