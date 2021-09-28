# Lista de Exercícios 20/09/2021

Utilizando Java Swing na resolução dos exercícios:
---
1. Algoritmo onde o usuário digite o ano de nascimento. O algoritmo deve calcular
a idade do usuário e dizer se ele é criança ou adulto com base nas comparações à
seguir:
- se a idade for maior que 16, exibir a mensagem dizendo que é adulto
- se a idade for menor que 17, exibir que é criança

2. Melhore o algorítmo anterior, de modo que as mensagens exibidas sejam:
- “criança”, se a idade for menor que 12
- “adolescente”, se a idade for maior ou igual a 12 e menor ou igual a 17
- “adulto”, se a idade for maior que 17 e menor que 60
- “idoso”, sde a idade for maior que 60
 

3. Um banco concederá um crédito especial aos seus clientes, variável com o saldo
médio no último ano. Faça um algoritmo que leia o saldo médio de um cliente e calcule
o valor do crédito de acordo com a tabela abaixo. Mostre uma mensagem informando o
saldo médio e o valor do crédito. (use o comando caso - de e não faça repetições)

- Saldo médio 	Percentual
- de 0 a 200 		nenhum crédito
- de 201 a 400 	20% do valor do saldo médio
- de 401 a 600 	30% do valor do saldo médio
- acima de 601 	40% do valor do saldo médio


4. Um vendedor necessita de um algoritmo que calcule o preço total devido por um
cliente. O algoritmo deve receber o código de um produto e a quantidade comprada e
calcular o preço total, usando a tabela abaixo:


- Código do produto 	Preço unitário
- 1001 				5,32
- 1324 				6,45
- 6548 				2,37
- 0987 				5,32
- 7623 				6,45


5. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que 
a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo
que leia o custo de fábrica de um carro e escreva o custo ao consumidor.


6. Uma empresa concederá um aumento de salário aos seus funcionários, variável de
acordo com o cargo, conforme a tabela abaixo. Faça um algoritmo que leia o salário e o
cargo de um funcionário e calcule o novo salário. Se o cargo do funcionário não estiver
na tabela, ele deverá, então, receber 40% de aumento. Mostre o salário antigo, o novo
salário e a diferença.


- Código 		Cargo 		Percentual
- 101 		Gerente 		10%
- 102 		Engenheiro 		20%
- 103 		Técnico 		30%


7. Uma empresa concederá um aumento de salário aos seus funcionários, variável de
acordo com o cargo, conforme a tabela abaixo. Faça um algoritmo que leia o salário e o
cargo de um funcionário e calcule o novo salário. Se o cargo do funcionário não estiver
na tabela, ele deverá, então, receber 40% de aumento. Mostre o salário antigo, o novo
salário e a diferença.


- Código 		Cargo 		Percentual
- 101 		Gerente 		10%
- 102 		Engenheiro 		20%
- 103 		Técnico 		30%


8. Uma companhia de seguros classifica seus segurados em três categorias de grupo de
risco baseadas na idade. Somente pessoas com pelo menos 18 anos e não mais de 70 anos
podem adquirir apólices de seguros, caso esteja fora dessa faixa informar “impossível
seguro”.
A tabela a seguir fornece o grupo de risco com sua respectiva idade:


- Idade 		Grupo de Risco
- 18 a 24 	Baixo
- 25 a 40 	Médio
- 41 a70 		Alto


Desenvolva um programa que leia a idade de uma pessoa e informe o seu grupo
de risco, ou se é impossível realizar o seguro.


9. Imposto de renda.
O algorítmo deve calcular e exibir o valor a ser pago em imposto, com base no valor do
salário do empregado. Considere as condições abaixo para o cálculo:


- se salário < 1878,00, “ISENTO”
- se salário >=1878,00 e salário < 2456,00, 10% de imposto
- se salário >= 2456,00 e salário < 5100,00, 20% de imposto
- se salário >=5100,00 , 30% de imposto


10. A máquina de Refrigerante:
Você está desenvolvendo um sistema para uma máquina de refrigerante.Essa máquina,
dá ao cliente, a opção de escolher refrigerantes de valores de R$ 1,00 ; R$ 1,50 ;
R$ 2,00 ; R$ 2,50 e R$ 3,00. E também pede ao cliente para depositar o dinheiro na
máquina.Desenvolva um algoritmo que receba estas informações e calcule o troco
considerando o dinheiro depositado pelo cliente e o refrigerante escolhido.( Caso o
dinheiro depositado for menor que o valor do refrigerante, a máquina deverá calcular
quanto falta e informar ao cliente.


11. Após desenvolver o diagrama anterior, teste-o com os valores abaixo (cole o
print screen da parte da tela que contem as variáveis):


- depósito= R$ 10,00 refrigerante= R$ 1,50
- depósito= R$ 0,50 refrigerante= R$ 3,00


12. O Caminhão
Um caminhão irá transportar sacos de arroz de Curitiba até Rio Grande do Sul.O dono
da transpostadora quer um sistema que calcule a relação custo-benefício entre peso da
carga, e estrada escolhida.Para tal, faça o diagrama de blocos considerando as seguintes
premissas:


a) Para cada quilo de carga, a transportadora lucrará em R$ 2,00

b) A transportadora poderá escolher entre a BR 23 e a BR 25.

c)Se escolher a BR 23 , devido aos buracos, perderá R$ 100,00 referente à
manuntenção ( Lucro = Lucro – 100 ), e só poderá levar até 1000 quilos de
carga. ( Caso o
peso seja maior que 1000, deverá ser mostrada a mensagem “ Peso excedente “.

d) Se escolher a BR 25 , pagará R$ 200,00 de pedágio e R$ 500,00 à mais de
combustível, porém, poderá levar até 2200 quilos de carga. ( Caso o peso seja
maior que 2200, deverá ser mostrada a mensagem “Peso excedente”.

e) O total será o lucro menos despesas.


13. Após desenvolver o algoritmo anterior, teste-o com os valores abaixo (cole o
print screen da parte da tela que contem as variáveis):

    
- Carga = 900 caminho= BR 25
- Carga = 2500 caminho = BR 25
- Carga = 1300 caminho = BR 23
- Carga = 2000 caminho = BR 23
- Carga = 2000 caminho = BR 25
