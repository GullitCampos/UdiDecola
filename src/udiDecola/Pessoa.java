package udiDecola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private LocalDate dataNasc;
	private LocalDate dataCadas;
	private String endereco;
	protected DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Pessoa(String nome, String cpf, LocalDate dataNasc, LocalDate dataCadas, String endereco) {
		this.nome = nome;
		setCpf(cpf);
		this.dataNasc = dataNasc;
		this.dataCadas = dataCadas;
		this.endereco = endereco;
	}
	
	public Pessoa(String nome, String cpf, LocalDate dataNasc,  String endereco) {
		this.nome = nome;
		setCpf(cpf);
		this.dataNasc = dataNasc;
		this.dataCadas = LocalDate.now();
		this.endereco = endereco;
	}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		setCpf(cpf);
	}
	
	public Pessoa() {
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(ValidaCPF.isCPF(cpf))
			this.cpf = cpf;
		else
			this.cpf = "";
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public String getDataNascString() {return dataNasc.format(formatter);}

	public void setDataNasc(LocalDate dataNasc) {this.dataNasc = dataNasc;}

	public LocalDate getDataCadas() {return dataCadas;}

	public String getDataCadasString() {return dataCadas.format(formatter);}

	public void setDataCadas(LocalDate dataCadas) {
		this.dataCadas = dataCadas;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + getDataNascString() + 
				"\nData de Cadastro: " + getDataCadasString() + "\nEndereço: " + getEndereco(); 
	}
}
