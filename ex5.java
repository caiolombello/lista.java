/*
    5. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que
a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo
que leia o custo de fábrica de um carro e escreva o custo ao consumidor.

    custoFabrica + porcDistribuidor + impostos = custo
 */

package lista;

import javax.swing.*;

public class ex5 {
    public static void main(String[] args) {
        double custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fábrica:"));
        double porcDistribuidor = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do distribuidor:"));
        double impostos = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem dos impostos:"));

        double custo = ((custoFabrica * (porcDistribuidor / 100)) + (custoFabrica * (impostos / 100)) + custoFabrica);

        JOptionPane.showMessageDialog(null, String.format(
                "Custo de Fábrica: $%.2f\n" +
                "Porcentagem Distribuidor: %.0f\n" +
                "Imposto: %.0f\n" +
                "Custo ao consumidor: $%.2f", custoFabrica, porcDistribuidor, impostos, custo));
    }
}
