package udiDecola;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Voo{
	private LocalDate data;
	private LocalTime hrChegada;
	private LocalTime hrPartida;
	private int numVagas;
	private double precoPassagem;
	private TrechoVoo tre;
	public final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

	public Voo(LocalDate data, LocalTime hrChegada, LocalTime hrPartida, int numVagas, double precoPassagem, TrechoVoo tre) {
		this.data = data;
		this.hrChegada = hrChegada;
		this.hrPartida = hrPartida;
		this.numVagas = numVagas;
		this.precoPassagem = precoPassagem;
		this.tre = tre;
	}

	public Voo(String data, String hrChegada, String hrPartida, int numVagas, double precoPassagem, TrechoVoo tre) {
		setData(data);
		setHrChegada(hrChegada);
		setHrPartida(hrPartida);
		this.numVagas = numVagas;
		this.precoPassagem = precoPassagem;
		this.tre = tre;
	}

	public Voo() {
		
	}
	
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
	public Boolean passagensDisponiveis(int numPassagens) {
		if (this.numVagas - numPassagens >= 0) {
			this.numVagas -= numPassagens;
			return true;
		}	
		else return false;
	}
	
	public double totalVoo(int numPassagens) {
		return (precoPassagem * numPassagens);
	}
	
	public String ToString() {
		return "\nData: " + getDataString() + "\nHora de Partida: " + getHrPartidaString() +  "\nHora de Chegada: " + getHrChegadaString()
				+ "\nNúmero de Vagas: " + numVagas + "\nPreço da Passagem: " + precoPassagem;
	}
}
