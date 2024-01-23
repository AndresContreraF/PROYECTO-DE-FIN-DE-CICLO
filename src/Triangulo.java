/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhonn
 */
public class Triangulo {
    private final char [][]matriz;
    private final char relleno;

    public Triangulo(int ma, char relleno) {
        matriz = new char[ma][ma];
        this.relleno = relleno;
    }

    public void imprimirTrianguloA() {
        // Iteramos por las filas de la matriz
        for (int i = 0; i < matriz.length; i++) {
            // Iteramos por las columnas de la fila actual
            for (int j = 0; j <= i; j++) {
                // Imprimimos el carácter de relleno
                System.out.print(relleno);
            }
            // Saltamos una línea
            System.out.println();
        }
    }
    
}
