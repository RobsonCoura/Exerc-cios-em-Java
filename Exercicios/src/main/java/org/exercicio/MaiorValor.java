package org.exercicio;

import java.util.Scanner;

public class MaiorValor {

    // Método para retornar o maior entre dois valores
    public static int maiorValor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Ler os dois valores
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        // Chamar o método para determinar o maior valor
        int maior = maiorValor(valor1, valor2);

        // Exibir o maior valor
        System.out.println("O maior valor é: " + maior);

        scanner.close();
    }
}
