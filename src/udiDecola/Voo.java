
package udiDecola;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*Este é um código em Java que define uma classe chamada Voo. 
 A classe Voo representa um voo em uma companhia aérea.*/

//A classe Voo tem várias variáveis de instância.
public class Voo{

	private LocalDate data;//a data do voo
	private LocalTime hrChegada;//a hora de chegada do voo
	private LocalTime hrPartida;//e hora partida do voo
	private int numVagas;//o número de vagas disponíveis no voo
	private double precoPassagem;//o preço de uma passagem para o voo
	private TrechoVoo tre;//um objeto da classe TrechoVoo que representa o trecho do voo
	
	public final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

	//construtor aceita todos os detalhes do voo como parâmetros.
	public Voo(LocalDate data, LocalTime hrChegada, LocalTime hrPartida, int numVagas, double precoPassagem, TrechoVoo tre) {
		this.data = data;
		this.hrChegada = hrChegada;
		this.hrPartida = hrPartida;
		this.numVagas = numVagas;
		this.precoPassagem = precoPassagem;
		this.tre = tre;
	}

	/*construtor aceita os mesmos detalhes, mas a data e as horas são passadas como 
 	strings, que são então convertidas para LocalDate e LocalTime respectivamente.*/
	public Voo(String data, String hrChegada, String hrPartida, int numVagas, double precoPassagem, TrechoVoo tre) {
		setData(data);
		setHrChegada(hrChegada);
		setHrPartida(hrPartida);
		this.numVagas = numVagas;
		this.precoPassagem = precoPassagem;
		this.tre = tre;
	}
	
	/* construtor padrão que não aceita nenhum argumento.*/
	public Voo() {
		
	}
	
	/*Este método verifica se há vagas suficientes disponíveis 
 	para o número de passagens solicitadas.*/
	public Boolean vagasDisponiveis(int passagens) {
		if(this.getNumVagas() >= passagens)
			return true;
		return false;
	}
	public LocalDate getData() {
		return data;
	}

	public String getDataString() {
		return data.format(formatter);
	}

	public void setData(String data) {
		this.data = LocalDate.parse(data, formatter);
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHrChegada() {
		return hrChegada;
	}

	public String getHrChegadaString() {
		return hrChegada.format(timeFormatter);
	}

	public void setHrChegada(String hrChegada) {
		this.hrChegada = LocalTime.parse(hrChegada);
	}

	public void setHrChegada(LocalTime hrChegada) {
		this.hrChegada = hrChegada;
	}

	public LocalTime getHrPartida() {
		return hrPartida;
	}

	public String getHrPartidaString() {
		return hrPartida.format(timeFormatter);
	}

	public void setHrPartida(String hrPartida) {
		this.hrPartida = LocalTime.parse(hrPartida);
	}

	public void setHrPartida(LocalTime hrPArtida) {
		this.hrPartida = hrPArtida;
	}

	public int getNumVagas() {
		return numVagas;
	}

	public void setNumVagas(int numVagas) {
		this.numVagas = numVagas;
	}

	public double getPrecoPassagem() {
		return precoPassagem;
	}

	public void setPrecoPassagem(double precoPassagem) {
		this.precoPassagem = precoPassagem;
	}

	public TrechoVoo getTre() {
		return tre;
	}

	public void setTre(TrechoVoo tre) {
		this.tre = tre;
	}

	/*Este método verifica se há passagens suficientes disponíveis para o número 
 	de passagens solicitadas.*/
	public Boolean passagensDisponiveis(int numPassagens) {

		/*Se houver, ele deduz o número de passagens do número total de vagas e 
  		retorna true*/
		if (this.numVagas - numPassagens >= 0) {
			this.numVagas -= numPassagens;
			return true;
		}
		/*Caso contrário, retorna false*/
		else return false;
	}
	
	/*Este método calcula o custo total do voo para o número de passagens fornecido.*/
	public double totalVoo(int numPassagens) {
		return (precoPassagem * numPassagens);
	}
	
	/*ToString na classe Voo. Ele retorna uma representação em string do objeto Voo*/
	public String ToString() {
		/*Concatena várias strings e valores de variáveis de instância para criar uma representação 
  		em string do objeto Voo.

      		 método é chamado, ele retorna uma string que contém todas as informações sobre o voo, incluindo 
	 	a data, a hora de partida, a hora de chegada, o número de vagas e o preço da passagem.

   		Inclui o número de vagas (numVagas) e o preço da passagem (precoPassagem) na string */
		return "\nData: " + getDataString() + "\nHora de Partida: " + getHrPartidaString() +  "\nHora de Chegada: " + getHrChegadaString()
				+ "\nNúmero de Vagas: " + numVagas + "\nPreço da Passagem: " + precoPassagem;
	}
}
