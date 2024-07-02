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

        // Ler os dados do veículo via JOptionPane
        String modelo = JOptionPane.showInputDialog(null, "Digite o modelo do veículo:");

        String marca = JOptionPane.showInputDialog(null, "Digite a marca do veículo:");

        String custoFabricacaoStr = JOptionPane.showInputDialog(null, "Digite o custo de fabricação do veículo:");

        double custoFabricacao = Double.parseDouble(custoFabricacaoStr);
        // Calcular o preço de venda
        double precoVenda = calculaPrecoVenda(custoFabricacao);

        // Exibir os resultados
        JOptionPane.showMessageDialog(null, String.format("Modelo: %s\nMarca: %s\nPreço de venda: R$ %.2f", modelo, marca, precoVenda));
    }
}
