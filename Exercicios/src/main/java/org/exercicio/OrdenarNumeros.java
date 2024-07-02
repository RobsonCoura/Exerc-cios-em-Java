package org.exercicio;

import java.util.Scanner;

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

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Ler os três números inteiros diferentes
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = scanner.nextInt();

        // Ordenar os números
        int[] numerosOrdenados = ordenarNumeros(num1, num2, num3);

        // Exibir os números ordenados
        System.out.println("Números ordenados em ordem crescente: ");
        for (int num : numerosOrdenados) {
            System.out.println(num);
        }

        scanner.close();
    }
}
