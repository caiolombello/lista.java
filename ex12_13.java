/*
    12 – O Caminhão

Um caminhão irá transportar sacos de arroz de Curitiba até Rio Grande do Sul. O dono
da transpostadora quer um sistema que calcule a relação custo-benefício entre peso da
carga, e estrada escolhida. Para tal, faça o diagrama de blocos considerando as seguintes
premissas:

a) Para cada quilo de carga, a transportadora lucrará em R$ 2,00

b) A transportadora poderá escolher entre a BR 23 e a BR 25.

c)Se escolher a BR 23 , devido aos buracos, perderá R$ 100,00 referente à
manuntenção ( Lucro = Lucro – 100 ), e só poderá levar até 1000 quilos de
carga. ( Caso o peso seja maior que 1000, deverá ser mostrada a mensagem “ Peso excedente “.

d) Se escolher a BR 25 , pagará R$ 200,00 de pedágio e R$ 500,00 à mais de
combustível, porém, poderá levar até 2200 quilos de carga. ( Caso o peso seja
maior que 2200, deverá ser mostrada a mensagem “Peso excedente”.

e) O total será o lucro menos despesas.

 - 1 kg = R$ 2
 - BR 23 ou BR 25
 - se BR = 23 entao  lucro - 100
 se limite > 1000 kg entao "Peso excedente"
 - se BR = 25 entao lucro - 200 - 500
 se limite > 2200 entao "peso excedente"
 - total = lucro - despesa

    13 - Após desenvolver o algoritmo anterior, teste-o com os valores abaixo (cole o
print screen da parte da tela que contem as variáveis):

Carga = 900 caminho= BR 25
Carga = 2500 caminho = BR 25
Carga = 1300 caminho = BR 23
Carga = 2000 caminho = BR 23
Carga = 2000 caminho = BR 25
 */

package lista;

import javax.swing.*;
import java.awt.event.*;


public class ex12_13 extends JFrame implements ActionListener {

    JRadioButton BR23,BR25;
    JButton b;
    ex12_13(){
        BR23 = new JRadioButton("BR23");
        BR23.setBounds(100,50,100,30);
        BR25 = new JRadioButton("BR25");
        BR25.setBounds(100,100,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(BR23); bg.add(BR25);
        b = new JButton("Calcular");
        b.setBounds(100,150,100,30);
        b.addActionListener(this);
        add(BR23); add(BR25); add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        double lucro;
        float kg;
        kg = Float.parseFloat(JOptionPane.showInputDialog(null, String.format("Informe a carga em KG:")));
        if(BR23.isSelected()){
            lucro = kg * 2;
            if (kg > 1000) {
                JOptionPane.showMessageDialog(null, String.format("%.2f kg excede o peso permitido.", kg), "Alerta", JOptionPane.WARNING_MESSAGE);
            }
            else {
                lucro = lucro - 100;
                JOptionPane.showMessageDialog(null, String.format("O lucro por este caminho será de $%.2f", lucro));
            }
        }
        if(BR25.isSelected()){
            lucro = kg * 2;
            if (kg > 2200) {
                JOptionPane.showMessageDialog(null, String.format("%.2f kg excede o peso permitido.", kg), "Alerta", JOptionPane.WARNING_MESSAGE);
            }
            else {
                lucro = lucro + (- 200 - 500);
                JOptionPane.showMessageDialog(null, String.format("O lucro por este caminho será de $%.2f", lucro));
            }
        }
    }
    public static void main(String args[]){
        new ex12_13();
    }
}