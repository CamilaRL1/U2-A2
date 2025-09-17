/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package division.dos.enteros;

import java.util.Scanner;
public class DivisionDosEnteros {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
        System.out.print("Ingresa el primer numero: ");
        double num1 = input.nextDouble ();
        
        System.out.print("Ingresa el segundo numero: ");
        double num2 = input.nextDouble ();


        if (num2!= 0) {
            double resultado = num1 / num2;
            System.out.println("Resultado de la división: " + resultado);
        } else {
            System.out.println(" La divisiónes por cero no estan permitidas.");
}
}
}