/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author Sexxxrvio
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        int valor1 = ingresarValor();
        int valor2 = ingresarValor();

        int suma = operacionSuma(valor1, valor2);

        imprimirReporte(suma);

    }

    public static int ingresarValor() {
        boolean bandera = true;
        int valor1 = 0;

        while (bandera) {
            Scanner entrada = new Scanner(System.in);
            try {
                System.out.println("Ingrese valor: ");
                valor1 = entrada.nextInt();

                if (valor1 % 2 != 0) {
                    throw new Exception("Número impar");
                }
                if (valor1 < 0) {
                    throw new Exception("Número negativo");
                }

                bandera = false;

            } catch (Exception e) {

                System.out.printf("Valor no permitido\nError : %s\n", e);
            }
        }
        return valor1;
    }

    public static int operacionSuma(int a, int b) {
        int suma;
        suma = a + b;
        return suma;

    }

    public static void imprimirReporte(int a) {

        System.out.printf(" La suma total es %s\n", a);

    }

}
