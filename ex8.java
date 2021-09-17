/*
    8. Uma companhia de seguros classifica seus segurados em três categorias de grupo de
risco baseadas na idade. Somente pessoas com pelo menos 18 anos e não mais de 70 anos
podem adquirir apólices de seguros, caso esteja fora dessa faixa informar “impossível
seguro”.

A tabela a seguir fornece o grupo de risco com sua respectiva idade:

Idade       Grupo de Risco
18 a 24         Baixo
25 a 40         Médio
41 a 70         Alto

Desenvolva um programa que leia a idade de uma pessoa e informe o seu grupo
de risco, ou se é impossível realizar o seguro.

- ler idade
- informar grupo de risco
- idade > 70 = impossivel de adquirir seguro
*/

package lista;

import javax.swing.*;

public class ex8 {
    public static void main(String[] args){
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));

        boolean seguro;

        if (idade > 70) seguro = false;
        else if (idade < 18) seguro = false;
        else seguro = true;

        if (seguro) {
            JOptionPane.showMessageDialog(null, "Você pode adquirir um seguro.");
        } else {
            JOptionPane.showMessageDialog(null, "Você não pode adquirir um seguro.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }
}
