package lista;

import javax.swing.*;
import java.awt.event.*;
import java.util.Calendar;

public class menuExs {
    public static void main(String[] args) {
        JFrame f = new JFrame("Lista de Exercícios");

        JButton ex1_2 = new JButton("1 e 2");
        ex1_2.setBounds(10, 15, 80, 30);

        JButton ex3 = new JButton("3");
        ex3.setBounds(90, 15, 80, 30);

        JButton ex4 = new JButton("4");
        ex4.setBounds(170, 15, 80, 30);

        JButton ex5 = new JButton("5");
        ex5.setBounds(10, 55, 80, 30);

        JButton ex6_7 = new JButton("6 e 7");
        ex6_7.setBounds(90, 55, 80, 30);

        JButton ex8 = new JButton("8");
        ex8.setBounds(170, 55, 80, 30);

        JButton ex9 = new JButton("9");
        ex9.setBounds(10, 95, 80, 30);

        JButton ex10_11 = new JButton("10 e 11");
        ex10_11.setBounds(90, 95, 80, 30);

        JButton ex12_13 = new JButton("12 e 13");
        ex12_13.setBounds(170, 95, 80, 30);

        f.add(ex1_2);
        f.add(ex3);
        f.add(ex4);
        f.add(ex5);
        f.add(ex6_7);
        f.add(ex8);
        f.add(ex9);
        f.add(ex10_11);
        f.add(ex12_13);

        ex1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ex1_2();
            }
        });

        ex3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ex3();
            }
        });

        ex4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ex4();
            }
        });

        ex5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ex5();
            }
        });

        ex6_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ex6_7();
            }
        });

        ex8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ex8();
            }
        });

        ex9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ex9();
            }
        });

        ex10_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ex10_11();
            }
        });

        ex12_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Não é possível executar este exercício, execute-o manualmente.", "Alerta", JOptionPane.WARNING_MESSAGE);
            }
        });

        f.setSize(275, 175);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void ex1_2() {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento:"));

        Calendar calendar = Calendar.getInstance();
        int ano = calendar.get(Calendar.YEAR);

        idade = ano - idade;

        if (idade > 60) {
            JOptionPane.showMessageDialog(null, String.format("[IDOSO] Você possui %2d anos.", idade));
        } else if (idade > 17) {
            JOptionPane.showMessageDialog(null, String.format("[ADULTO] Você possui %2d anos.", idade));
        } else if (idade >= 12) {
            JOptionPane.showMessageDialog(null, String.format("[ADOLESCENTE] Você possui %2d anos.", idade));
        } else if (idade >= 0) {
            JOptionPane.showMessageDialog(null, String.format("[CRIANÇA] Você possui %2d anos.", idade));
        } else {
            JOptionPane.showMessageDialog(null, String.format("Olá pessoa do futuro, o que faz em %2d?", ano), "Bem-vindo", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void ex3() {
        double saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("Informe seu saldo médio:"));

        if (saldoMedio > 601) {
            double credito = saldoMedio * 0.4;
            JOptionPane.showMessageDialog(null, String.format("Saldo médio: $%.2f\nCrédito: $%.2f", saldoMedio, credito));
        } else if (saldoMedio >= 401) {
            double credito = saldoMedio * 0.3;
            JOptionPane.showMessageDialog(null, String.format("Saldo médio: $%.2f\nCrédito: $%.2f", saldoMedio, credito));
        } else if (saldoMedio >= 201) {
            double credito = saldoMedio * 0.2;
            JOptionPane.showMessageDialog(null, String.format("Saldo médio: $%.2f\nCrédito: $%.2f", saldoMedio, credito));
        } else if (saldoMedio >= 0) {
            double credito = saldoMedio * 0;
            JOptionPane.showMessageDialog(null, String.format("Saldo médio: $%.2f\nCrédito: $%.2f", saldoMedio, credito));
        } else {
            JOptionPane.showMessageDialog(null, String.format("Você não pode ter um saldo de $%.2f", saldoMedio), "Alerta", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void ex4() {
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

    public static void ex5() {
        double custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fábrica:"));
        double porcDistribuidor = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do distribuidor:"));
        double impostos = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem dos impostos:"));

        double custo = (custoFabrica * (porcDistribuidor / 100)) + (custoFabrica * (impostos / 100));

        JOptionPane.showMessageDialog(null, String.format(
                "Custo de Fábrica: $%.2f\n" +
                        "Porcentagem Distribuidor: %.0f\n" +
                        "Imposto: %.0f\n" +
                        "Custo ao consumidor: $%.2f", custoFabrica, porcDistribuidor, impostos, custo));
    }

    public static void ex6_7() {
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:"));
        String cargo = JOptionPane.showInputDialog("Informe seu cargo:");

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

    public static void ex8() {
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

    public static void ex9() {
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:"));

        double imposto;
        if (salario >= 5100) {
            imposto = salario * 0.3;
            JOptionPane.showMessageDialog(null, String.format(
                    "Salário: $%.2f\n" +
                            "Imposto a pagar: $%.2f", salario, imposto));
        } else if (salario >= 2456) {
            imposto = salario * 0.2;
            JOptionPane.showMessageDialog(null, String.format(
                    "Salário: $%.2f\n" +
                            "Imposto a pagar: $%.2f", salario, imposto));
        } else if (salario >= 1878) {
            imposto = salario * 0.1;
            JOptionPane.showMessageDialog(null, String.format(
                    "Salário: $%.2f\n" +
                            "Imposto a pagar: $%.2f", salario, imposto));
        } else {
            JOptionPane.showMessageDialog(null, String.format(
                    "Salário: $%.2f\n" +
                            "Imposto isento.", salario));
        }
    }

    public static void ex10_11() {
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
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:", valorCoca)));
                    if (deposito > valorCoca) {
                        double troco = deposito - valorCoca;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Coca-cola.", deposito, troco));
                    } else {
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
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:", valorGuarana)));
                    if (deposito > valorGuarana) {
                        double troco = deposito - valorGuarana;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Guaraná.", deposito, troco));
                    } else {
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
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:", valorFanta)));
                    if (deposito > valorFanta) {
                        double troco = deposito - valorFanta;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Fanta.", deposito, troco));
                    } else {
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
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:", valorCocaZero)));
                    if (deposito > valorCocaZero) {
                        double troco = deposito - valorCocaZero;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Coca-cola zero.", deposito, troco));
                    } else {
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
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:", valorSprite)));
                    if (deposito > valorSprite) {
                        double troco = deposito - valorSprite;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Sprite.", deposito, troco));
                    } else {
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
                    float deposito = Float.parseFloat(JOptionPane.showInputDialog(String.format("Preço: $%.2f\nValor do depósito:", valorPepsi)));
                    if (deposito > valorPepsi) {
                        double troco = deposito - valorPepsi;
                        JOptionPane.showMessageDialog(null, String.format("Dinheiro depositado: $%.2f\nTroco: $%.2f\nProduto comprado: Pepsi.", deposito, troco));
                    } else {
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

