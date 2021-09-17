/*
    6. Uma empresa concederá um aumento de salário aos seus funcionários, variável de
acordo com o cargo, conforme a tabela abaixo. Faça um algoritmo que leia o salário e o
cargo de um funcionário e calcule o novo salário. Se o cargo do funcionário não estiver
na tabela, ele deverá, então, receber 40% de aumento. Mostre o salário antigo, o novo
salário e a diferença.

Código      Cargo       Percentual
101         Gerente     10%
102         Engenheiro  20%
103         Técnico     30%

- ler salario
- ler cargo
- calcular novo salario
- se cargo não existe receber 40%
- mostrar salario antigo, o novo e a diferença
 */

package lista;

import javax.swing.*;

public class ex6_7 {
    public static void main(String[] args){
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:"));
        String cargo  = JOptionPane.showInputDialog("Informe seu cargo:");

        double salarioNovo;
        double dif;

        switch (cargo) {
            case "Gerente":
            case "gerente":
                salarioNovo = salario + (salario * 0.10);
                dif = salarioNovo - salario;
                JOptionPane.showMessageDialog(null, String.format("Salário antigo: $%.2f\nSalário novo: $%.2f\nDiferença de $%.2f", salario, salarioNovo, dif));
                break;
            case "Engenheiro":
            case "engenheiro":
                salarioNovo = salario + (salario * 0.20);
                dif = salarioNovo - salario;
                JOptionPane.showMessageDialog(null, String.format("Salário antigo: $%.2f\nSalário novo: $%.2f\nDiferença de $%.2f", salario, salarioNovo, dif));
                break;
            case "Técnico":
            case "Tecnico":
            case "técnico":
            case "tecnico":
                salarioNovo = salario + (salario * 0.30);
                dif = salarioNovo - salario;
                JOptionPane.showMessageDialog(null, String.format("Salário antigo: $%.2f\nSalário novo: $%.2f\nDiferença de $%.2f", salario, salarioNovo, dif));
                break;
            default:
                salarioNovo = salario + (salario * 0.40);
                dif = salarioNovo - salario;
                JOptionPane.showMessageDialog(null, String.format("Salário antigo: $%.2f\nSalário novo: $%.2f\nDiferença de $%.2f", salario, salarioNovo, dif));
                break;

        }
    }
}
