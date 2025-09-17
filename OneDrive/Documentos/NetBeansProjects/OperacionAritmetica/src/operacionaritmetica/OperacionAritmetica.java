/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionaritmetica;

/**
 *
 * @author camil
 */
import java.util.Scanner;
public class OperacionAritmetica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el primer número: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        int num2 = input.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Division:" + (num1 / num2));
        } else {
            System.out.println("Division: no se puede divivir entre cero");
        }
         input.close();
    }
}
