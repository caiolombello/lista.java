/*
    3. Um banco concederá um crédito especial aos seus clientes, variável com o saldo
médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente e calcule
o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem informando o
saldo médio e o valor do crédito. (use o comando caso - de e não faça repetições)

Saldo médio     Percentual
de 0 a 200      nenhum crédito
de 201 a 400    20% do valor do saldo médio
de 401 a 600    30% do valor do saldo médio
acima de 601    40% do valor do saldo médio

- ler saldo médio do cliente
- calcular o valor do credito de acordo com a tabela
- informar saldo medio e valor do credito

*/

package lista;

import javax.swing.*;

public class ex3 {
    public static void main(String [] args){
        double saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("Informe seu saldo médio:"));

        if (saldoMedio > 601) {
            double credito = saldoMedio * 0.4;
            JOptionPane.showMessageDialog(null, String.format("Saldo médio: $%.2f\nCrédito: $%.2f", saldoMedio, credito));
        }
        else if (saldoMedio >= 401) {
            double credito = saldoMedio * 0.3;
            JOptionPane.showMessageDialog(null, String.format("Saldo médio: $%.2f\nCrédito: $%.2f", saldoMedio, credito));
        }
        else if (saldoMedio >= 201) {
            double credito = saldoMedio * 0.2;
            JOptionPane.showMessageDialog(null, String.format("Saldo médio: $%.2f\nCrédito: $%.2f", saldoMedio, credito));
        }
        else if (saldoMedio >= 0) {
            double credito = saldoMedio * 0;
            JOptionPane.showMessageDialog(null, String.format("Saldo médio: $%.2f\nCrédito: $%.2f", saldoMedio, credito));
        }
        else {
            JOptionPane.showMessageDialog(null, String.format("Você não pode ter um saldo de $%.2f", saldoMedio), "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
}
