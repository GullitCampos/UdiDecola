package udiDecola;

import java.time.LocalDate;
import java.util.ArrayList;

public class FuncionarioParcerias extends Funcionario {
	private int qtdHoteis;
	private static double porcentagemFixa = 0.02;
	private ArrayList<Hotel> hoteisCadas;

	public FuncionarioParcerias() {
		super();
	}

	public FuncionarioParcerias(String nome, String cpf, LocalDate dataNasc, LocalDate dataCadas, String endereco,
			String carteiraTrabalho, double salario, int qtdHoteis) {
		super(nome, cpf, dataNasc, dataCadas, endereco, carteiraTrabalho, salario);
		this.qtdHoteis = qtdHoteis;
	}
	
	public int getQtdHoteis() {
		return qtdHoteis;
	}

	public void setQtdHoteis(int qtdHoteis) {
		this.qtdHoteis = qtdHoteis;
	}

	public static double getPorcentagemFixa() {
		return porcentagemFixa;
	}

	public static void setPorcentagemFixa(double porcentagemFixa) {
		FuncionarioParcerias.porcentagemFixa = porcentagemFixa;
	}

	public void incrementaQtd() {
		this.qtdHoteis++;
	}
	
	public double getSalario() {
		return salario + qtdHoteis*porcentagemFixa*salario;
	}

	
	public ArrayList<Hotel> getHoteisCadas() {
		return hoteisCadas;
	}

	public void setHoteisCadas(ArrayList<Hotel> hoteisCadas) {
		this.hoteisCadas = hoteisCadas;
	}

	@Override
	public String toString() {
		return super.toString() + "Parcerias Realizadas: " + getQtdHoteis();
	}
}
