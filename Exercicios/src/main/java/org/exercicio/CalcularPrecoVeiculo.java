package org.exercicio;

import java.util.Scanner;

/*
Este programa realiza os seguintes passos:

Lê o modelo do veículo, a marca e o custo de fabricação.

Calcula o preço de venda com um acréscimo de 30% utilizando o método calculaPrecoVenda.

Exibe o modelo, a marca e o preço de venda do veículo.
*/

public class CalcularPrecoVeiculo {

    // Método para calcular o preço de venda do veículo
    public static double calculaPrecoVenda(double custoFabricacao) {
        return custoFabricacao * 1.30;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler os dados do veículo
        System.out.print("Digite o modelo do veículo: ");
        String modelo = scanner.nextLine();

        System.out.print("Digite a marca do veículo: ");
        String marca = scanner.nextLine();

        System.out.print("Digite o custo de fabricação do veículo: ");
        double custoFabricacao = scanner.nextDouble();

        // Calcular o preço de venda
        double precoVenda = calculaPrecoVenda(custoFabricacao);

        // Exibir os resultados
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.printf("Preço de venda: R$ %.2f\n", precoVenda);

        scanner.close();
    }
}
