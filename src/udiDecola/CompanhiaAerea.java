package udiDecola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CompanhiaAerea {
	private String cnpj;
	private String oficial;
	private String nomeDivul;
	private LocalDate dataCria;
	private static float valFixoVenda = 100;
	public final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	
	public CompanhiaAerea(String cnpj, String oficial, String nomeDivul, LocalDate dataCria) {
		this.cnpj = cnpj;
		this.oficial = oficial;
		this.nomeDivul = nomeDivul;
		this.dataCria = dataCria;
	}
	
	public CompanhiaAerea() {
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getOficial() {
		return oficial;
	}

	public void setOficial(String oficial) {
		this.oficial = oficial;
	}

	public String getNomeDivul() {
		return nomeDivul;
	}

	public void setNomeDivul(String nomeDivul) {
		this.nomeDivul = nomeDivul;
	}

	public LocalDate getDataCria() {
		return dataCria;
	}
	
	public String getDataCriaString() {
		return dataCria.format(formatter);
	}

	public void setDataCria(LocalDate dataCria) {
		this.dataCria = dataCria;
	}
	
	public static float getValFixoVenda() {
		return valFixoVenda;
	}

	public static void setValFixoVenda(float valFixoVenda) {
		CompanhiaAerea.valFixoVenda = valFixoVenda;
	}
	
	@Override
	public String toString() {
		return "\nNome Oficial: " + oficial + "\nNome de Divulg: " + nomeDivul + "\nCNPJ: " + cnpj + 
				"\nData de Criação: " + getDataCriaString(); 
	}
}

