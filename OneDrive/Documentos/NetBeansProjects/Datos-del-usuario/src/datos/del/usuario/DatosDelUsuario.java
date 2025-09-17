/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datos.del.usuario;





import java.util.Scanner;

public class DatosDelUsuario {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = input.nextInt();
        input.nextLine(); // consume el salto de linea pendiente

        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);
    }
}

    

