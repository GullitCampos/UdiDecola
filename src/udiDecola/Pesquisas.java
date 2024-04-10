package udiDecola;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pesquisas {
	private String origem;
	private String destino;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private LocalDateTime horaPesquisa;
	private Cliente cliente;
	public final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public final DateTimeFormatter datetimeformat = DateTimeFormatter.RFC_1123_DATE_TIME;

	public Pesquisas(String origem, String destino, LocalDate dataInicio, LocalDate dataFim,
			LocalDateTime horaPesquisa, Cliente cliente) {
		this.origem = origem;
		this.destino = destino;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		setHoraPesquisa();
		this.cliente = cliente;
	}

	public Pesquisas() {
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public String getDataInicioString() {
		return dataInicio.format(formatter);
	}
	
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}
	
	public String getDataFimString() {
		return dataFim.format(formatter);
	}
	
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public LocalDateTime getHoraPesquisa() {
		return horaPesquisa;
	}
	
	public String getHoraPesquisaString() {
		return horaPesquisa.format(datetimeformat);
	}
	
	public void setHoraPesquisa(LocalDateTime horaPesquisa) {
		this.horaPesquisa = horaPesquisa;
	}

	public void setHoraPesquisa() {
		this.horaPesquisa = LocalDateTime.now();
	}
	
	public String ToString() {
		return "\nCliente: " + cliente + "\nOrigem: " + origem + "\nDestino: " + destino +  "\nData de Ida: " 
				+ getDataInicioString() + "\nData de Retorno: " + getDataFimString() + "\nHora da Pesquisa: "
				+ getHoraPesquisaString();
	}
}
