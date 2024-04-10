package udiDecola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.Period;

public class Compra {
	private Voo ida;
	private Voo retorno;
	private Cliente cliente;
	private Hotel hotel;
	private int quantidadePassagens;
	private int quantidadeQuartosSingle;
	private int quantidadeQuartosDuplo;
	private int quantidadeQuartosTriplo;
	private int quantidadeQuartosLuxo;
	private LocalDate dataSaida;
	private LocalDate dataRetorno;
	private Boolean compraRealizada;
	private LocalDateTime horaCompra;
	public final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public final DateTimeFormatter datetimeformat = DateTimeFormatter.RFC_1123_DATE_TIME;
	private double valorUdiDecola;

	public Compra(Voo ida, Voo retorno, Cliente cliente, Hotel hotel, int quantidadePassagens, 
			int quantidadeQuartosSingle, int quantidadeQuartosDuplo, int quantidadeQuartosTriplo, 
			int quantidadeQuartosLuxo) {
		this.ida = ida;
		this.retorno = retorno;
		this.cliente = cliente;
		this.hotel = hotel;
		this.quantidadePassagens = quantidadePassagens;
		this.quantidadeQuartosSingle = quantidadeQuartosSingle;
		this.quantidadeQuartosDuplo = quantidadeQuartosDuplo;
		this.quantidadeQuartosTriplo = quantidadeQuartosTriplo;
		this.quantidadeQuartosLuxo = quantidadeQuartosLuxo;
		this.cliente.incrementaCompras();
		setCompraRealizada();
		setHoraCompra();
		setValorUdiDecola();
	}

	public Compra(Voo ida, Voo retorno, Cliente cliente, int quantidadePassagens) {
		this.ida = ida;
		this.retorno = retorno;
		this.cliente = cliente;
		this.quantidadePassagens = quantidadePassagens;
		this.cliente.incrementaCompras();
		setHoraCompra();
		setCompraRealizada();
		setValorUdiDecola();
	}

	public Compra(Cliente cliente, Hotel hotel, int quantidadeQuartosSingle,
			int quantidadeQuartosDuplo, int quantidadeQuartosTriplo, int quantidadeQuartosLuxo) {
		this.cliente = cliente;
		this.hotel = hotel;
		this.quantidadeQuartosSingle = quantidadeQuartosSingle;
		this.quantidadeQuartosDuplo = quantidadeQuartosDuplo;
		this.quantidadeQuartosTriplo = quantidadeQuartosTriplo;
		this.quantidadeQuartosLuxo = quantidadeQuartosLuxo;
		this.cliente.incrementaCompras();
		setHoraCompra();
		setCompraRealizada();
		setValorUdiDecola();
	}

	public LocalDateTime getHoraCompra() {
		return horaCompra;
	}
	
	public String getHoraCompraString() {
		return horaCompra.format(datetimeformat);
	}

	public void setHoraCompra() {
		this.horaCompra = LocalDateTime.now();
	}
	
	public void setHoraCompra(LocalDateTime horaCompra) {
		this.horaCompra = horaCompra;
	}

	public Voo getIda() {
		return ida;
	}

	public void setIda(Voo ida) {
		this.ida = ida;
	}

	
	public Voo getRetorno() {
		return retorno;
	}

	public void setRetorno(Voo retorno) {
		this.retorno = retorno;
	}

	public LocalDate getDataSaida() {
		return dataSaida;
	}
	
	public String getDataSaidaString() {
		return dataSaida.format(formatter);
	}
	
	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}

	public LocalDate getDataRetorno() {
		return dataRetorno;
	}

	public String getDataRetornoString() {
		return dataRetorno.format(formatter);
	}
	
	public void setDataRetorno(LocalDate dataRetorno) {
		this.dataRetorno = dataRetorno;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public int getQuantidadePassagens() {
		return quantidadePassagens;
	}

	public void setQuantidadePassagens(int quantidadePassagens) {
		this.quantidadePassagens = quantidadePassagens;
	}

	public int getQuantidadeQuartosSingle() {
		return quantidadeQuartosSingle;
	}

	public void setQuantidadeQuartosSingle(int quantidadeQuartosSingle) {
		this.quantidadeQuartosSingle = quantidadeQuartosSingle;
	}

	public int getQuantidadeQuartosDuplo() {
		return quantidadeQuartosDuplo;
	}

	public void setQuantidadeQuartosDuplo(int quantidadeQuartosDuplo) {
		this.quantidadeQuartosDuplo = quantidadeQuartosDuplo;
	}

	public int getQuantidadeQuartosTriplo() {
		return quantidadeQuartosTriplo;
	}

	public void setQuantidadeQuartosTriplo(int quantidadeQuartosTriplo) {
		this.quantidadeQuartosTriplo = quantidadeQuartosTriplo;
	}

	public int getQuantidadeQuartosLuxo() {
		return quantidadeQuartosLuxo;
	}

	public void setQuantidadeQuartosLuxo(int quantidadeQuartosLuxo) {
		this.quantidadeQuartosLuxo = quantidadeQuartosLuxo;
	}

	public Boolean getCompraRealizada() {
		return compraRealizada;
	}

	public void setCompraRealizada() {
		if(hotel.quartosDisponiveis(this.quantidadeQuartosSingle,
				this.quantidadeQuartosDuplo, this.quantidadeQuartosTriplo, this.quantidadeQuartosLuxo, this.dataSaida, this.dataRetorno) && ida.passagensDisponiveis(quantidadePassagens))
			this.compraRealizada = true;
		else this.compraRealizada = false;
	}

	public double getValorUdiDecola() {
		return valorUdiDecola;
	}

	public void setValorUdiDecola() {
		Period periodo = Period.between(dataSaida, dataRetorno);
		this.valorUdiDecola = quantidadePassagens * CompanhiaAerea.getValFixoVenda() * 2 + periodo.getDays() * Hotel.getValFixoVenda();
	}
	

	public double totalCompra() {
		double totalCompra = 0.0;
		if(cliente.getVip())
			totalCompra = (hotel.totalHotel(quantidadeQuartosSingle, quantidadeQuartosDuplo, 
					quantidadeQuartosTriplo, quantidadeQuartosLuxo, dataSaida, dataRetorno) + ida.totalVoo(quantidadePassagens) + 
					retorno.totalVoo(quantidadePassagens)) * (1 - Cliente.getDesconto());
		else
			totalCompra = (hotel.totalHotel(quantidadeQuartosSingle, quantidadeQuartosDuplo, 
					quantidadeQuartosTriplo, quantidadeQuartosLuxo, dataSaida, dataRetorno) 
					+ ida.totalVoo(quantidadePassagens) + retorno.totalVoo(quantidadePassagens));
		return totalCompra;
	}

	@Override
	public String toString() {
		return "Cliente: " + cliente + "\nData de Saída: " + getDataSaidaString() +
				"\nData de Retorno: " + getDataRetornoString() + "\nVoo de Ida\nHora de Partida: " + 
				ida.getHrPartidaString() + "\nHora de Chegada: " + ida.getHrChegadaString()+ 
				"\nVoo de Volta\nHora de Partida: " + retorno.getHrPartidaString() + 
				"\nHora de Chegada: " + retorno.getHrChegadaString()+ 
				"\nQuantidade de Passagens: " + quantidadePassagens + "\nHotel: " + hotel.getNomeDivulg() + 
				"\nQuantidade Quartos Single: " + quantidadeQuartosSingle + "\nQuantidade Quartos Duplo: " + 
				quantidadeQuartosDuplo + "\nQuantidade Quartos Triplo: " + quantidadeQuartosTriplo +
				"\nQuantidade Quartos Luxo: " + quantidadeQuartosLuxo + "\n Compra Sucedida?: " 
				+ compraRealizada.toString();
	}
}
