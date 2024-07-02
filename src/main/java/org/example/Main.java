package org.example;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenidos al Sistema de Prácticas Preprofesionales");
        System.out.println("\t Menú");
        System.out.println("1. Tutor");
        System.out.println("2. Estudiante");
        System.out.println("Ingrese el perfil de usuario: ");
        Scanner opcion=new Scanner(System.in);
        int op=opcion.nextInt();
        if (op==1){
            System.out.println("\t TUTOR");
            System.out.println("Ingrese su nombre: ");
            String nombre=opcion.nextLine();
        }

        }
    }
}