/*
    10 – A máquina de Refrigerante:

    Você está desenvolvendo um sistema para uma máquina de refrigerante. Essa máquina,
dá ao cliente, a opção de escolher refrigerantes de valores de R$ 1,00 ; R$ 1,50 ;
R$ 2,00 ; R$ 2,50 e R$ 3,00. E também pede ao cliente para depositar o dinheiro na
máquina. Desenvolva um algoritmo que receba estas informações e calcule o troco
considerando o dinheiro depositado pelo cliente e o refrigerante escolhido.( Caso o
dinheiro depositado for menor que o valor do refrigerante, a máquina deverá calcular
quanto falta e informar ao cliente.

- opção de escolher refrigerantes (R$ 1 a 3)
- pede cliente para depositar
- calcular troco
- mostrar dinheiro depositado
- mostrar refrigerante escolhido
- informar se deposito < valorRefri = quanto falta
 */

package lista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex10_11 {
    public static void main(String[] args){
        JFrame f = new JFrame("Máquina de Refrigerante");

        JButton coca = new JButton("Coca-Cola");
        coca.setBounds(10, 15, 120, 30);

        JButton guarana = new JButton("Guaraná");
        guarana.setBounds(130, 15, 120, 30);

        JButton fanta = new JButton("Fanta");
        fanta.setBounds(250, 15, 120, 30);

        JButton cocaZero = new JButton("Coca Zero");
        cocaZero.setBounds(10, 55, 120, 30);

        JButton sprite = new JButton("Sprite");
        sprite.setBounds(130, 55, 120, 30);

        JButton pepsi = new JButton("Pepsi");
        pepsi.setBounds(250, 55, 120, 30);

        f.add(coca);
        f.add(guarana);
        f.add(fanta);
        f.add(cocaZero);
        f.add(sprite);
        f.add(pepsi);

        coca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float valorCoca = 1;
                int comprar = JOptionPane.showConfirmDialog(null, String.format("Valor: $%.2f\n Deseja comprar?", valorCoca));
                if (comprar == JOptionPane.YES_OPTION) {
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:",valorCoca)));
                    if (deposito > valorCoca) {
                        double troco = deposito - valorCoca;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Coca-cola.", deposito, troco));
                    }
                    else {
                        double falta = valorCoca - deposito;
                        JOptionPane.showMessageDialog(null, String.format("Faltam $%.2f para comprar uma Coca-Cola.", falta), "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });

        guarana.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float valorGuarana = 1.50F;
                int comprar = JOptionPane.showConfirmDialog(null, String.format("Valor: $%.2f\n Deseja comprar?", valorGuarana));
                if (comprar == JOptionPane.YES_OPTION) {
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:",valorGuarana)));
                    if (deposito > valorGuarana) {
                        double troco = deposito - valorGuarana;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Guaraná.", deposito, troco));
                    }
                    else {
                        double falta = valorGuarana - deposito;
                        JOptionPane.showMessageDialog(null, String.format("Faltam $%.2f para comprar um Guaraná.", falta), "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });

        fanta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float valorFanta = 2;
                int comprar = JOptionPane.showConfirmDialog(null, String.format("Valor: $%.2f\n Deseja comprar?", valorFanta));
                if (comprar == JOptionPane.YES_OPTION) {
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:",valorFanta)));
                    if (deposito > valorFanta) {
                        double troco = deposito - valorFanta;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Fanta.", deposito, troco));
                    }
                    else {
                        double falta = valorFanta - deposito;
                        JOptionPane.showMessageDialog(null, String.format("Faltam $%.2f para comprar uma Fanta.", falta), "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });

        cocaZero.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float valorCocaZero = 2.50F;
                int comprar = JOptionPane.showConfirmDialog(null, String.format("Valor: $%.2f\n Deseja comprar?", valorCocaZero));
                if (comprar == JOptionPane.YES_OPTION) {
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:",valorCocaZero)));
                    if (deposito > valorCocaZero) {
                        double troco = deposito - valorCocaZero;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Coca-cola zero.", deposito, troco));
                    }
                    else {
                        double falta = valorCocaZero - deposito;
                        JOptionPane.showMessageDialog(null, String.format("Faltam $%.2f para comprar uma Coca-cola zero.", falta), "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });

        sprite.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float valorSprite = 3;
                int comprar = JOptionPane.showConfirmDialog(null, String.format("Valor: $%.2f\n Deseja comprar?", valorSprite));
                if (comprar == JOptionPane.YES_OPTION) {
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:",valorSprite)));
                    if (deposito > valorSprite) {
                        double troco = deposito - valorSprite;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Sprite.", deposito, troco));
                    }
                    else {
                        double falta = valorSprite - deposito;
                        JOptionPane.showMessageDialog(null, String.format("Faltam $%.2f para comprar uma Sprite.", falta), "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });

        pepsi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float valorPepsi = 3.50F;
                int comprar = JOptionPane.showConfirmDialog(null, String.format("Valor: $%.2f\n Deseja comprar?", valorPepsi));
                if (comprar == JOptionPane.YES_OPTION) {
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:",valorPepsi)));
                    if (deposito > valorPepsi) {
                        double troco = deposito - valorPepsi;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Pepsi.", deposito, troco));
                    }
                    else {
                        double falta = valorPepsi - deposito;
                        JOptionPane.showMessageDialog(null, String.format("Faltam $%.2f para comprar uma Pepsi.", falta), "Alerta", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        });

        f.setSize(400, 150);
        f.setLayout(null);
        f.setVisible(true);
    }
}

