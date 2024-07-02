package org.exercicio;

import javax.swing.*;

/*
Este programa realiza os seguintes passos:

Lê o modelo do veículo, a marca e o custo de fabricação.

Calcula o preço de venda com um acréscimo de 30% utilizando o método calculaPrecoVenda.

Exibe o modelo, a marca e o preço de venda do veículo.
*/

public class CalcularPrecoVeiculo {

    // Método para calcular o preço de venda do veículo com acréscimo de 30%
    public static double calculaPrecoVenda(double custoFabricacao) {
        return custoFabricacao * 1.30;
    }

    public static void main(String[] args) {

        try {
            // Ler os dados do veículo via JOptionPane e faz tratamento de exceções durante a execução do programa
            String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do veículo:");

            String marca = JOptionPane.showInputDialog(null, "Digite a marca do veículo:");

            String custoFabricacaoStr = JOptionPane.showInputDialog(null, "Digite o custo de fabricação do veículo:");

            // Substituir vírgula por ponto, se necessário
            custoFabricacaoStr = custoFabricacaoStr.replace(",", ".");

            // Converter para double
            double custoFabricacao = Double.parseDouble(custoFabricacaoStr);

            // Calcular o preço de vendaa
            double precoVenda = calculaPrecoVenda(custoFabricacao);

            // Formatar o preço de venda para duas casas decimais, no formato "R$ X,XXX.XX", onde X são dígitos numéricos
            String precoVendaFormatado = String.format("R$ %,.2f", precoVenda);

            // Exibir os resultados
            JOptionPane.showMessageDialog(null, String.format("Modelo: %s\nMarca: %s\nPreço de venda: %s", modelo, marca, precoVendaFormatado));
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido. Programa encerrado.");
        }
    }
}
