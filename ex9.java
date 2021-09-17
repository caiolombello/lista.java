/*
    9 – Imposto de renda.

    O algorítmo deve calcular e exibir o valor a ser pago em imposto, com base no valor do
salário do empregado. Considere as condições abaixo para o cálculo:

se salário < 1878,00, “ISENTO”
se salário >=1878,00 e salário < 2456,00, 10% de imposto
se salário >= 2456,00 e salário < 5100,00, 20% de imposto
se salário >=5100,00 , 30% de imposto
 */

package lista;

import javax.swing.*;

public class ex9 {
    public static void main(String[] args){
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:"));

        double imposto;
        if (salario >= 5100) {
            imposto = salario * 0.3;
            JOptionPane.showMessageDialog(null, String.format(
                    "Salário: $%.2f\n" +
                            "Imposto a pagar: $%.2f", salario, imposto));
        }
        else if (salario >= 2456) {
            imposto = salario * 0.2;
            JOptionPane.showMessageDialog(null, String.format(
                    "Salário: $%.2f\n" +
                            "Imposto a pagar: $%.2f", salario, imposto));
        }
        else if (salario >= 1878) {
            imposto = salario * 0.1;
            JOptionPane.showMessageDialog(null, String.format(
                    "Salário: $%.2f\n" +
                            "Imposto a pagar: $%.2f", salario, imposto));
        }
        else {
            JOptionPane.showMessageDialog(null, String.format(
                    "Salário: $%.2f\n" +
                            "Imposto isento.", salario));
        }
    }
}

