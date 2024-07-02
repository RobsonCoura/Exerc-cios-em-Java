package org.exercicio;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        // Ler as notas e o número de faltas
        System.out.print("Digite a nota da 1ª prova: ");
        double notaP1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2ª prova: ");
        double notaP2 = scanner.nextDouble();

        System.out.print("Digite o número de faltas: ");
        int faltas = scanner.nextInt();

        // Calcular a média
        double media = calculaMedia(notaP1, notaP2);

        // Determinar a situação do aluno
        String situacao = calculaSituacao(media, faltas);

        // Exibir os resultados
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação: " + situacao);

        scanner.close();
    }
}
