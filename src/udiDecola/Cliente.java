package udiDecola;

import java.time.LocalDate;
import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3506105600864403851L;
	private String email;
	private Boolean vip;
	private LocalDate dataVip;
	private static double desconto = 0.05;
	private int nroCompras;
	private Boolean ehFunc;
	private static int nroComprasVip = 50;

	public Cliente(String nome, String cpf, LocalDate dataNasc, LocalDate dataCadas, String endereco, String email,
			Boolean vip, LocalDate dataVip, int nroCompras, Boolean ehFunc) {
		super(nome, cpf, dataNasc, dataCadas, endereco);
		this.email = email;
		this.vip = vip;
		this.dataVip = dataVip;
		this.nroCompras = nroCompras;
		this.ehFunc = ehFunc;
	}
	
	public Cliente(String nome, String cpf, LocalDate dataNasc,  String endereco, String email) {
		super(nome, cpf, dataNasc, endereco);
		this.email = email;
		setFunc();
		this.nroCompras = 0;
		this.vip = false;
		this.dataVip = null;
	}
	
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
		setFunc();
	}

	public Cliente() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getVip() {
		return vip;
	}

	/*Este é o método setVip() na classe Cliente. Aqui está uma análise detalhada:
	O método setVip() é usado para definir o status VIP de um cliente. Ele verifica 
	 se o número de compras (nroCompras) feitas pelo cliente é maior que o número de compras 
 	necessárias para se tornar um cliente VIP (nroComprasVip).
	Se o número de compras for maior que nroComprasVip, o cliente se torna um cliente VIP (this.vip = true;) 
 	e a data em que se tornou VIP é definida como a data atual (setDataVip();).
	Se o número de compras não for maior que nroComprasVip, o cliente não é um cliente VIP (vip = false;).*/
	public void setVip() {
		if (nroCompras > nroComprasVip) {
			this.vip = true;
			setDataVip();
		} else vip = false;
	}

	public void setVip(Boolean vip){
		this.vip = vip;
	}
	
	public LocalDate getDataVip() {
		return dataVip;
	}

	public String getDataVipString() {
		return dataVip.format(formatter);
	}

	public void setDataVip() {
		this.dataVip = LocalDate.now();
	}

	public void setDataVip(LocalDate dataVip) {
		this.dataVip = dataVip;
	}

	public static double getDesconto() {
		return desconto;
	}

	public static void setDesconto(double desconto){
		Cliente.desconto = desconto;
	}

	public int getNroCompras() {
		return nroCompras;
	}

	public void setNroCompras(int nroCompras) {
		this.nroCompras = nroCompras;
	}

	public void incrementaCompras() {
		this.nroCompras++;
		this.setVip();
	}

	/*Este é o método setFunc() na classe Cliente. Aqui está uma análise detalhada:

O método setFunc() é usado para verificar se um cliente também é um funcionário. 
Ele faz isso chamando o método buscar() da classe DAOFuncionario com o CPF do cliente como argumento.
Se o método buscar() retornar um objeto não nulo, isso significa que um funcionário com esse CPF 
existe no banco de dados. Nesse caso, a variável ehFunc é definida como true, indicando que
o cliente também é um funcionário.
Se o método buscar() retornar null, isso significa que não existe um funcionário com esse CPF no banco de dados. 
Nesse caso, a variável ehFunc é definida como false, indicando que o cliente não é um funcionário.*/
	
	public void setFunc() {
		if(DAOFuncionario.buscar(this.getCpf()) != null) this.ehFunc = true;
		else this.ehFunc = false;
	}

	public boolean ehFunc() {
		return ehFunc;
	}
	
	public static int getNroComprasVip() {
		return nroComprasVip;
	}

	public static void setNroComprasVip(int nroComprasVip) {
		Cliente.nroComprasVip = nroComprasVip;
	}

	/*
	Este é o método toString() na classe Cliente. Aqui está uma análise detalhada:

	O método toString() é usado para criar uma representação em string de um objeto Cliente.
	Ele é útil para depuração e registro de informações.
	O método começa chamando super.toString(), que invoca o método toString() da superclasse Pessoa. 
	Isso retorna uma string com as informações da Pessoa.
	Em seguida, ele adiciona informações específicas do Cliente à string retornada pelo super.toString(). 
	Isso inclui o email do cliente, se o cliente é VIP, a data em que se tornou VIP, o número de compras 
	que o cliente fez e se o cliente também é um funcionário.
	O resultado é uma string que contém todas as informações sobre o Cliente, incluindo as informações da Pessoa.*/
	@Override
	public String toString() {
		return super.toString() + "\nE-mail: " + this.getEmail() + "\nVIP: " + this.getVip() + "\nData VIP: " + 
				this.getDataVip() + "\nNúmero de Compras: " + this.getNroCompras() + "\n" + "É funcionário?" + this.ehFunc();
	}

}
