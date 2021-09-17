package lista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuExs {
    public static void main(String[] args){
        JFrame f = new JFrame("Lista de Exercícios");

        JButton ex1_2 = new JButton("1 e 2");
        a.setBounds(10, 15, 75, 30);

        JButton ex3 = new JButton("3");
        b.setBounds(90, 15, 75, 30);

        JButton ex4 = new JButton("4");
        c.setBounds(180, 15, 75, 30);

        JButton ex5 = new JButton("5");
        d.setBounds(10, 55, 75, 30);

        JButton ex6_7 = new JButton("6 e 7");
        e.setBounds(90, 55, 75, 30);

        JButton ex8 = new JButton("8");
        e.setBounds(90, 55, 75, 30);

        JButton ex9 = new JButton("9");
        e.setBounds(90, 55, 75, 30);

        JButton ex10_11 = new JButton("10 e 11");
        e.setBounds(90, 55, 75, 30);

        JButton ex12_13 = new JButton("12 e 13");
        e.setBounds(90, 55, 75, 30);

        f.add(ex1_2);
        f.add(ex3);
        f.add(ex4);
        f.add(ex5);
        f.add(ex6_7);
        f.add(ex8);
        f.add(ex9);
        f.add(ex10_11);
        f.add(ex12_13);

        a.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que quer comprar:"));
                double valor = 5.72 * qtd;

                JOptionPane.showMessageDialog(null, String.format("Preço Total: %.2f", valor));
            }
        });

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que quer comprar:"));
                double valor = 6.45 * qtd;

                JOptionPane.showMessageDialog(null, String.format("Preço Total: %.2f", valor));
            }
        });

        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que quer comprar:"));
                double valor = 2.37 * qtd;

                JOptionPane.showMessageDialog(null, String.format("Preço Total: %.2f", valor));
            }
        });

        d.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que quer comprar:"));
                double valor = 5.32 * qtd;

                JOptionPane.showMessageDialog(null, String.format("Preço Total: %.2f", valor));
            }
        });

        e.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que quer comprar:"));
                double valor = 6.45 * qtd;

                JOptionPane.showMessageDialog(null, String.format("Preço Total: %.2f", valor));
            }
        });

        f.setSize(300, 150);
        f.setLayout(null);
        f.setVisible(true);
    }
}
