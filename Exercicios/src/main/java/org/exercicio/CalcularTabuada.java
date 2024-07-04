package org.exercicio;

import javax.swing.*;

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
        StringBuilder tabuada = new StringBuilder();
        tabuada.append("Tabuada de ").append(numero).append(":\n");
        for (int i = 1; i <= 10; i++) {
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
        }
        JOptionPane.showMessageDialog(null, tabuada.toString());
    }

    public static void main(String[] args) {

        char resposta; // Variável para armazenar a resposta do usuário

        do {
            try {
                // Pergunta ao usuário se ele quer ver a tabuada e faz tratamento de exceções durante a execução do programa
                resposta = JOptionPane.showInputDialog(null, "Você quer ver a tabuada? (s/n):").charAt(0); // Lê a primeira letra da resposta

                // Se a resposta for 's' ou 'S', pede ao usuário para digitar um valor inteiro
                if (resposta == 's' || resposta == 'S') {
                    // Se a resposta for 's' ou 'S', pede ao usuário para digitar um valor inteiro
                    String valorStr = JOptionPane.showInputDialog(null, "Digite um valor inteiro (maior que 1 e menor que 11):");
                    int valor = Integer.parseInt(valorStr);

                    // Verifica se o valor está no intervalo permitido
                    if (valor > 1 && valor < 11) {
                        // Chama o método para exibir a tabuada do valor fornecido
                        exibirTabuada(valor);
                    } else {
                        // Informa ao usuário que o valor está fora do intervalo permitido
                        JOptionPane.showMessageDialog(null, "Valor fora do intervalo permitido. Tente novamente.");
                    }
                }

                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário.");
                return;

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Programa cancelado pelo usuário.");
                return;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Programa encerrado.");
                return;
            }

        } while (resposta == 's' || resposta == 'S'); // Repete o processo enquanto a resposta for 's' ou 'S'
    }
}