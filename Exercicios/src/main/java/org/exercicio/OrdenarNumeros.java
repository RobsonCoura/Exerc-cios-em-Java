package org.exercicio;

import javax.swing.*;

/*
Este programa realiza os seguintes passos:

Lê três números inteiros diferentes.

Ordena os números em ordem crescente utilizando o método ordenarNumeros, que implementa um algoritmo simples de ordenação (Bubble Sort).

Retorna os números ordenados para o programa principal.

Exibe os números ordenados no programa principal.
*/

public class OrdenarNumeros {

    // Método para ordenar três números inteiros em ordem crescente
    public static int[] ordenarNumeros(int a, int b, int c) {
        int[] numeros = {a, b, c};
        int temp;

        // Algoritmo simples de ordenação (Bubble Sort)
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        return numeros;
    }

    public static void main(String[] args) {

        // Ler os três números inteiros diferentes via JOptionPane
        String num1Str = JOptionPane.showInputDialog(null, "Digite o primeiro número inteiro:");
        int num1 = Integer.parseInt(num1Str);

        String num2Str = JOptionPane.showInputDialog(null, "Digite o segundo número inteiro:");
        int num2 = Integer.parseInt(num2Str);

        String num3Str = JOptionPane.showInputDialog(null, "Digite o terceiro número inteiro:");
        int num3 = Integer.parseInt(num3Str);

        // Ordenar os números
        int[] numerosOrdenados = ordenarNumeros(num1, num2, num3);

        // Exibir os números ordenados via JOptionPane
        JOptionPane.showMessageDialog(null, String.format("Números ordenados em ordem crescente:\n%d\n%d\n%d", numerosOrdenados[0], numerosOrdenados[1], numerosOrdenados[2]));
    }
}
