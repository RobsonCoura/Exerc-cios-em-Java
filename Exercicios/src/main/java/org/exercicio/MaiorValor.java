package org.exercicio;

import javax.swing.*;

public class MaiorValor {

    // Método para retornar o maior entre dois valores
    public static int maiorValor(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {

        // Ler os dois valores via JOptionPane e faz tratamento de exceções durante a execução do programa
        try {
            String valor1Str = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
            int valor1 = Integer.parseInt(valor1Str);
            String valor2Str = JOptionPane.showInputDialog(null, "Digite o segundo valor:");
            int valor2 = Integer.parseInt(valor2Str);

            // Chamar o método para determinar o maior valor
            int maior = maiorValor(valor1, valor2);

            // Exibir o maior valor via JOptionPane
            JOptionPane.showMessageDialog(null, "O maior valor é: " + maior);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário."); // Captura exceção se o usuário cancelar a operação
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Programa encerrado."); // Captura exceção se o usuário digitar um valor inválido
        }
    }
}
