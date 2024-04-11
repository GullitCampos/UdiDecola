package udiDecola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//A classe CompanhiaAerea tem várias variáveis de instância
public class CompanhiaAerea {
	private String cnpj;//o CNPJ da companhia aérea
	private String oficial;//o nome oficial da companhia aérea
	private String nomeDivul;//o nome de divulgação da companhia aérea
	private LocalDate dataCria;//a data de criação da companhia aérea
	private static float valFixoVenda = 100; //(um valor fixo de venda

	
	public final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	/*construtor aceita todos os detalhes da companhia aérea como parâmetros*/
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

	/* Este é o método toString na classe CompanhiaAerea. Ele está sobrescrevendo o método 
 	toString da classe Object no Java. O método toString é usado para fornecer uma representação 
  	em string de um objeto.*/
	
	@Override
	public String toString() {

		/*Retorna uma string que contém todas as informações sobre a companhia aérea, incluindo 
  		o nome oficial (oficial), o nome de divulgação (nomeDivul), o CNPJ (cnpj) e a data de criação (dataCria).
		Usa o método getDataCriaString para obter a data de criação da companhia aérea como uma string formatada.*/
		
		return "\nNome Oficial: " + oficial + "\nNome de Divulg: " + nomeDivul + "\nCNPJ: " + cnpj + 
				"\nData de Criação: " + getDataCriaString(); 
	}
}

