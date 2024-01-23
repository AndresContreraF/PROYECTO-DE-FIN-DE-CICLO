/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Proyecto con Matrices el siguiente ejercicio
//Jhonny Andrés Contrera Farías
/**
 *
 * @author jhonny
 */
import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaramos las variables
        int ma;
        char relleno;

        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario el tamaño de la matriz
        System.out.println("Ingrese el tamaño de la matriz: ");
        ma = scanner.nextInt();

        // Solicitamos al usuario el carácter de relleno
        System.out.println("Ingrese el carácter de relleno: ");
        relleno = scanner.next().charAt(0);

        // Creamos una instancia de la clase Triangulo
        Triangulo triangulo = new Triangulo(ma, relleno);
        System.out.println("Triángulo A:");
        triangulo.imprimirTrianguloA ();

        TrianguloInverso trianguloInverso = new TrianguloInverso(ma, relleno);
        System.out.println("Triángulo B:");
        trianguloInverso.imprimirTrianguloB ();
        
        
    }

}
