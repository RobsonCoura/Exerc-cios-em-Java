package org.exercicio;

import java.util.Scanner;

/*
Este programa realiza os seguintes passos:

Pergunta ao usuário se ele quer ver a tabuada.

Se o usuário responder "sim" ('s'), o programa lê um valor inteiro.

Verifica se o valor está no intervalo permitido (maior que 1 e menor que 11).

Passa o valor para o método exibirTabuada, que calcula e exibe a tabuada de multiplicação do valor até 10.

Repete o processo enquanto o usuário continuar respondendo "sim" ('s').
*/

public class CalcularTabuada {

    // Método para calcular e exibir a tabuada de multiplicação
    public static void exibirTabuada(int numero) {
        // Exibe a tabuada de 1 a 10 para o número fornecido
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        char resposta; // Variável para armazenar a resposta do usuário

        do {
            // Pergunta ao usuário se ele quer ver a tabuada
            System.out.print("Você quer ver a tabuada? (s/n): ");
            resposta = scanner.next().charAt(0); // Lê a primeira letra da resposta

            if (resposta == 's' || resposta == 'S') {
                // Se a resposta for 's' ou 'S', pede ao usuário para digitar um valor inteiro
                System.out.print("Digite um valor inteiro (maior que 1 e menor que 11): ");
                int valor = scanner.nextInt();

                // Verifica se o valor está no intervalo permitido
                if (valor > 1 && valor < 11) {
                    // Chama o método para exibir a tabuada do valor fornecido
                    exibirTabuada(valor);
                } else {
                    // Informa ao usuário que o valor está fora do intervalo permitido
                    System.out.println("Valor fora do intervalo permitido. Tente novamente.");
                }
            }

        } while (resposta == 's' || resposta == 'S'); // Repete o processo enquanto a resposta for 's' ou 'S'

        // Fecha o scanner para liberar os recursos
        scanner.close();
    }
}