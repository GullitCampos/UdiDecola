Domínio do problema: Udi-Decola
 
a)	O Udi-Decola é uma companhia que permite realizar buscas e compras de passagens aéreas e diárias em hotéis. 
b)	Para o Udi-Decola é muito importante manter um cadastro dos trechos de voos disponíveis. Para cada trecho é importante saber o seu código identificador, que é formado por um conjunto de 3 letras e 5 nros. Também é importante armazenar o local de origem, o local de destino, a hora de saída e a hora de chegada.  Pense na melhor forma de representar o local de origem e saída, pois uma cidade pode ter mais de um aeroporto. Também é preciso saber a companhia aérea do trecho voo.
c)	As companhias aéreas devem ser previamente cadastradas. Cada companhia aérea tem um CNPJ, nome oficial, nome de divulgação e data de criação. 
d)	Cada trecho de voo é realizado em vários dias do mês. Por exemplo. O trecho Uberlândia para Garulhos-SP no horário das 8h e chegada as 9h, aconteceu todos os dias desta semana, sendo cada dia um voo diferente. É importante registrar os voos de cada trecho de voo. 
e)	Para cada voo é preciso saber a sua data, a hora programada de partida e hora programada de chegada, que podem ser diferentes da hora do trecho do voo devido a alguma mudança da companhia. É importante também saber o nro de vagas disponíveis nesse voo para passageiros da Udi-Decola. O mesmo trecho de voo pode ter diferentes valores em diferentes voos, que dependem da época do ano e de eventos externos. Assim cada voo tem um preço da passagem.
f)	Além de voos, o Udi-decola também permite a busca por hotéis. Assim, é importante armazenar cada um dos hotéis parceiros. Para cada hotel é importante registrar o seu CNPJ, nome oficial, nome de divulgação, endereço completo, ano de criação, nro de estrelas, se aceita pets ou não, nro total de quartos, horário do check-in e horário do chek-out. Também é importante uma mensagem de divulgação que será exibida na busca. Ex: “Hotel 4 estrelas com buffet de café da manhã”.  Uma breve descrição do hotel também deve ser exibida. Lembre-se que a cidade do hotel é importante para facilitar as buscas.
g)	Para cada hotel é importante registrar para cada data do ano, o nro de quartos disponíveis para locação do tipo single, duplos e triplos, bem como o valor da diária de cada quarto sem desconto, o valor do desconto e valor após aplicar o desconto. Estes são considerados os quartos standard. Em cada data o hotel pode aceitar ou não cancelamento. 
h)	 Para cada hotel é também importante registrar para cada data o nro de quartos de luxo, o valor da diária sem desconto, o valor do desconto e o valor após aplicar o desconto. 
i)	Os funcionários da empresa precisam ser cadastrados. Para isso é importante registrar o nome, CPF, endereço completo, nro da carteira de trabalho e data de nascimento. Cada funcionário tem um salário fixo. Lembre-se que um funcionário pode ser também um cliente da empresa.
j)	Há um tipo de funcionário, que são os responsáveis por nova parcerias de hotel. Cada vez que um hotel é registrado é importante saber o funcionário responsável. Também é importante saber quantos hotéis um funcionário foi responsável pelo cadastro. O salário deste tipo de funcionário é o seu salário fixo acrescida de uma porcentagem fixa para cada novo hotel que ele adiciona. 
k)	Para efetivar uma compra no Udi-Decola, os clientes devem ser previamente cadastrados. Para isso é preciso saber, CPF, nome, endereço completo, data de nascimento, data de cadastro e email. Quando um cliente efetua mais que um dado número de compras, ele se torna um cliente VIP e neste caso é importante armazenar o valor do desconto que o cliente terá em novas compras, bem como a data em que ele se tornou vip. O cálculo deste valor segue regras específicas da empresa, que não serão detalhadas aqui. 
l)	As pesquisas feitas por cliente devem ser registradas. Para cada pesquisa é importante registrar a origem, o destino, data de início e data de fim. Isso ajudará a verificar os destinos e datas mais procurados. Também é importante armazenar a data e hora que a pesquisa foi realizada. 
m)	Cada compra deve ser registrada. Uma compra é composta por informações sobre a passagem aérea, diárias em hotel ou ambas. Obviamente é importante armazenar a quantidade de cada um desses itens, já que uma compra pode envolver passagens para mais de uma pessoa em mais de um quarto de hotel.
n)	Para cada compra é importante registrar também a data e hora em que foi realizada, bem como o cliente da compra. A compra também armazena o seu valor total, que é a soma dos itens comprados, bem como a forma de pagamento realizada. 
o)	Para cada compra é importante atualizar o número de compras do cliente, já que ele pode se tornar um cliente VIP após realizar uma compra e atingir o nro limite de comprar. 
p)	Cada hotel paga um valor fixo para o Udi-Decola por cada diária de hotel vendida.
q)	Cada companhia aérea paga um valor fixo para o Udi-Decola por cada passagem aérea vendida.  
 
 
 
2-	Implemente em Java, usando técnicas de encapsulamento todo o seu Sistema para a Udi-Decola. A seguir um exemplo: 
public void setNome(String nome){ 
if (nome.length() > 0) { 
this.nome = nome;
} 
}
a.	Para validação de cpf, implemente o algoritmo real de validação de cpf (que é encontrado facilmente na Internet, implementado nas mais diversas linguagens).
 
3-	Considerando o uso de construtores:
a.	Crie um construtor para a classe cliente que receba como parâmetro o seu nome e o seu CPF. 
b.	Crie um construtor default (sem parâmetros) explicitamente para a classe cliente.
c.	Crie um construtor para a classe Compra de forma que este receba como parâmetro o cliente que fez a compra, o vôo da compra, bem como a data e hora. Desta forma, obriga-se a associação da compra com o cliente e vôo, que já foram previamente criados no sistema.
d.	Crie construtores para cada uma das classes do problema de forma a atribuir valor aos atributos da classe com os parâmetros recebidos. Toda classe deve ter pelo menos um construtor criado por você.
 
4-	Considerando os casos de herança, implemente todas as situações de herança descritas nos requisitos.
 
5-	Implemente todos os atributos estáticos para o funcionamento do sistema, tais como o valor fixo que os hotéis e companhias aéreas pagam para o Udi-Decola, o nro fixo de compras que um cliente deve fazer para se tornar um cliente VIP e o valor fixo pago para funcionário que registram novos hotéis. 
 
6-	Implemente a realização de uma compra. Lembre-se que a realização de uma compra tem impacto na conversão de um cliente para VIP. Lembre-se de calcular para cada compra, o valor total a ser pago pelo cliente e o valor total a ser pago para o Udi-Decola. 


7-	Classes Abstratas
a.	Veja se alguma classe do problema deveria ser abstrata.

1.	Considerando o sistema do Udi-Decola desenvolvido de acordo com os requisitos fornecidos nas atividades “Projeto Final - Parte 1”, você deverá complementar a implementação em Java de acordo com o que se pede a seguir.
a)	Classes para manter os dados
i.	Crie classes especiais capazes de manter os dados gerados no sistema. Por manter, entende-se: cadastrar, consultar e excluir. Para isto, crie as classes “DadosTrechoVoo”, “DadosHoteis”, “DadosFuncionarios”, “DadosCliente”, etc.. Estas classes serão responsáveis por encapsular o acesso a cada tipo de dado específico. Para isto, estas classes devem implementar um ArrayList privado para armazenar a informação, e métodos públicos para permitir o acesso à informação (inserir um novo objeto, buscar um objeto, excluir um objeto, etc.). Os objetos de dados deverão ser criados apenas uma vez na classe principal e utilizados ao longo da execução da aplicação. Exemplo:
 
Public class DadosFuncionarios{
private ArrayList<Funcionario> vetFunc = new ArrayList<Funcionario>();
public void cadastrar(Funcionario f) {
this.vetFunc.add(f); //ADICIONA  O Funcionário NO ARRAY
}
public void listar(){
for (Funcionario objeto: this.vetFunc) {
objeto.mostrarDados();
//método mostrarDados(); 
}
}
 
//este método retorna o objeto Funcionario caso encontrado, ou null, caso não encontrado
public Funcionario buscar(String cpf) {
Funcionario f = null;
for ( Funcionario objeto: this.vetFunc) {
if (objeto.getCPF().equals(cpf)) {
f = objeto;
break;
}
}
return f;
}
//este método usa o método buscar já implementado
public boolean excluir(String cpf){
Funcionario f = this.buscar(cpf);
if (f != null) {
this.vetFunc.remove(f);
return true;
}
else {
return false;
}
}
}
b)	Use recursos de interface gráfica em Java (pacote Swing e/ou Awt do Java), banco de dados e arquivos para o desenvolvimento do que se pede a seguir: 
i.	Para uma das classes do sistema (Ex: trecho de vôo, hotel, cliente,  funcionário, etc. ) deverão ser criadas telas para manutenção dos objetos desta classe (cadastro, consulta e remoção). Estas telas deverão chamar as classes e métodos apropriadas para sua execução, que foram criados na parte 1 do trabalho e no item 1 deste trabalho.
ii.	Ainda considerando a classe escolhida, faça com que cada objeto da classe escolhida seja salvo em um Banco de Dados e em um arquivo. Para o banco de dados, use o SGBD PostgresSQL. O Banco de Dados poderá ter apenas uma tabela que contém os campos de tipos básicos da classe escolhida.
iii.	Crie também telas para os demais requisitos do sistema. Neste caso, você poderá fazer apenas as telas de cadastro.


 
 
8-	Requisito extra
a.	Invente um requisito no problema que justifique a criação de uma nova classe ou de um novo método (podem ou não ser abstratos) ou de uma nova subclasse. Não esqueça de descrever o requisito
