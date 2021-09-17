/* 4. Um vendedor necessita de um algoritmo que calcule o preço total devido por um
cliente. O algoritmo deve receber o código de um produto e a quantidade comprada e
calcular o preço total, usando a tabela abaixo:

Código do produto   Preço unitário
1001                5,32
1324                6,45
6548                2,37
0987                5,32
7623                6,45

*/

package lista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ex4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Produtos");

        JButton a = new JButton("1001");
        a.setBounds(10, 15, 75, 30);

        JButton b = new JButton("1324");
        b.setBounds(90, 15, 75, 30);

        JButton c = new JButton("6548");
        c.setBounds(180, 15, 75, 30);

        JButton d = new JButton("0987");
        d.setBounds(10, 55, 75, 30);

        JButton e = new JButton("7623");
        e.setBounds(90, 55, 75, 30);

        f.add(a);
        f.add(b);
        f.add(c);
        f.add(d);
        f.add(e);

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

//        JLabel valorTotal = null;
//        valorTotal = valorTotal + valor;
//        valorTotal = new JLabel(String.format("Valor Total: $%.2f.", valorTotal));
//        valorTotal.setBounds(180,55, 100,30);

        f.setSize(300, 150);
        f.setLayout(null);
        f.setVisible(true);
    }
}

