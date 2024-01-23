/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jhonn
 */
public class TrianguloInverso {

    private final char[][] matriz;
    private final char relleno;

    public TrianguloInverso(int ma, char relleno) {
        matriz = new char[ma][ma];
        this.relleno = relleno;
        for (int i = 0; i < ma; i++) {
            for (int j = 0; j < ma; j++) {
                matriz[i][j] = ' ';
            }
        }

    }

    // Iteramos por las columnas de la matriz
    public void imprimirTrianguloB() {
        for (int i = 0; i < matriz.length; i++) {
            // Iteramos por las filas de la columna actual
            for (int j = matriz.length - 1; j >= i; j--) {
                // Imprimimos el carácter de relleno
                System.out.print(relleno);
            }
            // Saltamos una línea
            System.out.println();
        }
    }
    //Este método recorre la matriz e imprime sus elementos en el formato de una matriz
    private void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
