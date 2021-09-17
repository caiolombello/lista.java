/*
    1 – Algoritmo onde o usuário digite o ano de nascimento. O algoritmo deve calcular a idade do usuário e dizer se ele é criança ou adulto com base nas comparações à seguir:
- se a idade for maior que 16, exibir a mensagem dizendo que é adulto
- se a idade for menor que 17, exibir que é criança

    2 – Melhore o algorítmo anterior, de modo que as mensagens exibidas sejam:
“criança”, se a idade for menor que 12
“adolescente”, se a idade for maior ou igual a 12 e menor ou igual a 17
“adulto”, se a idade for maior que 17 e menor que 60
“idoso”, sde a idade for maior que 60 */

package lista;

import javax.swing.*;
import java.util.Calendar;

public class ex1_2 {
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento:"));

        Calendar calendar = Calendar.getInstance();
        int ano = calendar.get(Calendar.YEAR);

        idade = ano - idade;

        if (idade > 60) {
            JOptionPane.showMessageDialog(null, String.format("[IDOSO] Você possui %2d anos.", idade));
        }
        else if (idade > 17) {
            JOptionPane.showMessageDialog(null, String.format("[ADULTO] Você possui %2d anos.", idade));
        }
        else if (idade >= 12) {
            JOptionPane.showMessageDialog(null, String.format("[ADOLESCENTE] Você possui %2d anos.", idade));
        }
        else if (idade >= 0) {
            JOptionPane.showMessageDialog(null, String.format("[CRIANÇA] Você possui %2d anos.", idade));
        }
        else {
            JOptionPane.showMessageDialog(null, String.format("Olá pessoa do futuro, o que faz em %2d?", ano), "Bem-vindo", JOptionPane.WARNING_MESSAGE);
        }
    }
}
