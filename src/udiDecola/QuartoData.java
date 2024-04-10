package udiDecola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class QuartoData {
	
	private Hotel hotel;
	private LocalDate data;
	private int qtdSingle;
	private int qtdDuplo;
	private int qtdTriplo;
	private int qtdLuxo;
	private double diariaSingle;
	private double diariaDuplo;
	private double diariaTriplo;
	private double diariaLuxo;
	private double desconto;
	private Boolean temDesconto;
	private Boolean cancelamento;
	public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	public QuartoData(Hotel hotel, LocalDate data, int qtdSingle, int qtdDuplo, int qtdTriplo, int qtdLuxo, double diariaSingle,
					  double diariaDuplo, double diariaTriplo, double diariaLuxo, double desconto, Boolean cancelamento,
					  Boolean temDesconto) {
		this.data = data;
		this.qtdSingle = qtdSingle;
		this.qtdDuplo = qtdDuplo;
		this.qtdTriplo = qtdTriplo;
		this.qtdLuxo = qtdLuxo;
		this.desconto = desconto;
		this.diariaSingle = diariaSingle;
		this.diariaDuplo = diariaDuplo;
		this.diariaTriplo = diariaTriplo;
		this.diariaLuxo = diariaLuxo;
		this.cancelamento = cancelamento;
		this.temDesconto = temDesconto;
		this.hotel = hotel;
	}

	public QuartoData(LocalDate data, Hotel hotel) {
		this.data = data;
		this.hotel = hotel;
	}

	public LocalDate getData() {
		return data;
	}

	public String getDataString() {
		return data.format(formatter);
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void setData(String data) {
		this.data = LocalDate.parse(data, formatter);
	}

	public int getQtdSingle() {
		return qtdSingle;
	}

	public void setQtdSingle(int qtdSingle) {
		this.qtdSingle = qtdSingle;
	}

	public int getQtdDuplo() {
		return qtdDuplo;
	}

	public void setQtdDuplo(int qtdDuplo) {
		this.qtdDuplo = qtdDuplo;
	}

	public int getQtdTriplo() {
		return qtdTriplo;
	}

	public void setQtdTriplo(int qtdTriplo) {
		this.qtdTriplo = qtdTriplo;
	}

	public int getQtdLuxo() {
		return qtdLuxo;
	}

	public void setQtdLuxo(int qtdLuxo) {
		this.qtdLuxo = qtdLuxo;
	}

	public double getDiariaSingle() {
		if(temDesconto) {
			return diariaSingle*(1-desconto);
		}
		return diariaSingle;
	}
	public void setDiariaSingle(double diariaSingle) {
		this.diariaSingle = diariaSingle;
	}

	public double getDiariaDuplo() {
		if(temDesconto) {
			return diariaDuplo*(1-desconto);
		}
		return diariaDuplo;
	}

	public void setDiariaDuplo(double diariaDuplo) {
		this.diariaDuplo = diariaDuplo;
	}

	public double getDiariaTriplo() {
		if(temDesconto) {
			return diariaTriplo*(1-desconto);
		}
		return diariaTriplo;
	}

	public void setDiariaTriplo(double diariaTriplo) {
		this.diariaTriplo = diariaTriplo;
	}

	public double getDiariaLuxo() {
		if(temDesconto) {
			return diariaLuxo*(1-desconto);
		}
		return diariaLuxo;
	}

	public void setDiariaLuxo(double diariaLuxo) {
		this.diariaLuxo = diariaLuxo;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public Boolean getCancelamento() {
		return cancelamento;
	}

	public void setCancelamento(Boolean cancelamento) {
		this.cancelamento = cancelamento;
	}

	public Boolean getTemDesconto() {
		return temDesconto;
	}

	public void setTemDesconto(Boolean temDesconto) {
		this.temDesconto = temDesconto;
	}
	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public double getTotal(int singles, int duplos, int triplos, int luxos) {
		if(temDesconto) {
			return (singles * diariaSingle + duplos * diariaDuplo + triplos * diariaTriplo + luxos * diariaLuxo) * 
					(1 - desconto);
		}
		else
			return singles * diariaSingle + duplos * diariaDuplo + triplos * diariaTriplo + luxos * diariaLuxo;
	}
	
	public void decrementaQuartos(int singles, int duplos, int triplos, int luxos) {
		setQtdSingle(qtdSingle - singles);
		setQtdDuplo(qtdDuplo - duplos);
		setQtdTriplo(qtdTriplo - triplos);
		setQtdLuxo(qtdLuxo - luxos);
	}
	
	public String ToString() {
		return "\nHotel: " + hotel + "\nData: " + getDataString() + "\nQuantidade Quartos Single: " + qtdSingle
				+ "\nDiária Single: " + diariaSingle  + "\nQuantidade Quartos Duplo: " + qtdDuplo + "\nDiárias Duplo: " 
				+ diariaDuplo + "\nQuantidade Quartos Triplo: " + qtdTriplo + "\nDiária Triplo: " + diariaTriplo +
				"\nQuantidade Quartos Luxo: " + qtdLuxo + "\nDiária Luxo: " + diariaLuxo + "\nDesconto: " + desconto +
				"\nTem Desconto? " + temDesconto.toString() + "\nCancelamento: " + cancelamento.toString();
	}
}
