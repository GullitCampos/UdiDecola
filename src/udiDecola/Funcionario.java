package udiDecola;

import java.time.LocalDate;
//

public class Funcionario extends Pessoa {
	
	private String carteiraTrabalho;
	protected double salario;

	public Funcionario() {
	}
	
	public Funcionario(String nome, String cpf, LocalDate dataNasc, LocalDate dataCadas, String endereco,
			String carteiraTrabalho, double salario) {
		super(nome, cpf, dataNasc, dataCadas, endereco);
		this.carteiraTrabalho = carteiraTrabalho;
		this.salario = salario;
	}

	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}

	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCarteira de Trabalho: " + this.getCarteiraTrabalho() + "\nSalario: " + this.getSalario();
	}
}
