package org.exercicio;

import javax.swing.*;

/*
Este programa realiza os seguintes passos:

Lê a nota da 1ª prova, nota da 2ª prova e o número de faltas do aluno.

Calcula a média ponderada das notas utilizando o método calculaMedia.

Determina a situação do aluno (aprovado ou reprovado) com base na média e no número de faltas utilizando o método calculaSituacao.

Exibe a média e a situação do aluno.
*/

public class CalcularMedia {

    // Método para calcular a média
    public static double calculaMedia(double p1, double p2) {
        return ((p1 * 4) + (p2 * 6)) / 10;
    }

    // Método para calcular a situação do aluno
    public static String calculaSituacao(double media, int faltas) {
        if (media >= 6.0 && faltas <= 16) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {

        // Loop para continuar lendo novos alunos até que seja digitado "1" para nota da 1ª prova
        while (true) {
            try {
                // Entrada da nota da 1ª prova via JOptionPane e faz tratamento de exceções durante a execução do programa
                String notaP1Str = JOptionPane.showInputDialog(null, "Digite a nota da 1ª prova (ou '1' para sair):");
                double notaP1 = Double.parseDouble(notaP1Str);

                // Se a nota da 1ª prova for 1, o programa encerra o loop
                if (notaP1 == 1) {
                    break;
                }
                // Ler as notas e faltas do aluno via JOptionPane
                String notaP2Str = JOptionPane.showInputDialog(null, "Digite a nota da 2ª prova:");
                double notaP2 = Double.parseDouble(notaP2Str);

                String faltasStr = JOptionPane.showInputDialog(null, "Digite o número de faltas:");
                int faltas = Integer.parseInt(faltasStr);

                // Calcular a média do aluno
                double media = calculaMedia(notaP1, notaP2);

                // Determinar a situação do aluno com base na média e no número de faltas
                String situacao = calculaSituacao(media, faltas);

                // Exibição da média e da situação do aluno via JOptionPane
                JOptionPane.showMessageDialog(null, String.format("Média: %.2f\nSituação: %s", media, situacao));
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário.");
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Digite novamente.");
            }
        }
    }
}
