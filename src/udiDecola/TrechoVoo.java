	package udiDecola;

import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TrechoVoo {
	private String codigo;
	private String codigoOrigem;
	private String codigoDestino;
	private LocalTime horaSaida;
	private LocalTime horaChegada;
	private CompanhiaAerea cAerea;
	private ArrayList<Voo> listaVoos;
	public final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	public TrechoVoo(String codigo, String origem, String destino, LocalTime horaSaida, LocalTime horaChegada, CompanhiaAerea cAearea, ArrayList<Voo> listaVoos) {
		setCodigo(codigo);
		setCodigoOrigem(origem);
		setCodigoDestino(destino);
		this.horaSaida = horaSaida;
		this.horaChegada = horaChegada;
		this.cAerea = cAearea;
		this.listaVoos = listaVoos;
	}
	
	public TrechoVoo() {
	}
	
	public ArrayList<Voo> getListaVoos() {
		return listaVoos;
	}

	public void setListaVoos(ArrayList<Voo> listaVoos) {
		this.listaVoos = listaVoos;
	}

	public void addVoo(Voo v) {
		DAOVoo.cadastrar(v);
		this.listaVoos.add(v);
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		if (codigo.length() != 8) {
		    this.codigo = "";
		}
		int letraCount = 0, digitoCount = 0;
		for (int i = 0; i < 3; i++) {
		    char c = codigo.charAt(i);
		    if (c >= 'A' && c <= 'Z') {
		        letraCount++;
		    }
		}
		for (int i = 3; i < 8; i++) {
			char c = codigo.charAt(i);
			if (c >= '0' && c <= '9')
		        digitoCount++;
		}
		if (letraCount == 3 && digitoCount == 4)
			this.codigo = codigo;
		else codigo = "";
	}

	public String getCodigoOrigem() {
		return codigoOrigem;
	}

	public void setCodigoOrigem(String origem) {
		if (origem.length() != 3) {
		    this.codigo = "";
		}
		int letraCount = 0;
		for (int i = 0; i < 3; i++) {
		    char c = codigo.charAt(i);
		    if (c >= 'A' && c <= 'Z') {
		        letraCount++;
		    }
		}
		if (letraCount == 3)
			this.codigoOrigem = origem;
		else
			this.codigoOrigem = "";
	}

	public String getCodigoDestino() {
		return codigoDestino;
	}

	public void setCodigoDestino(String destino) {
		if (destino.length() != 3) {
		    this.codigo = "";
		}
		int letraCount = 0;
		for (int i = 0; i < 3; i++) {
		    char c = codigo.charAt(i);
		    if (c >= 'A' && c <= 'Z') {
		        letraCount++;
		    }
		}
		if (letraCount == 3)
			this.codigoDestino = destino;
		else
			this.codigoDestino = "";
	}

	public LocalTime getHoraSaida() {
		return horaSaida;
	}
	
	public String getHoraSaidaString() {
		return horaSaida.format(formatter);
	}
	
	public void setHoraSaida(LocalTime horaSaida) {
		this.horaSaida = horaSaida;
	}

	public LocalTime getHoraChegada() {
		return horaChegada;
	}
	
	public String getHoraChegadaString() {
		return horaChegada.format(formatter);
	}
	
	public void setHoraChegada(LocalTime horaChegada) {
		this.horaChegada = horaChegada;
	}

	public CompanhiaAerea getcAearea() {
		return cAerea;
	}

	public void setcAearea(CompanhiaAerea cAearea) {
		this.cAerea = cAearea;
	}
	
	public String ToString() {
		String listaString = "";
		for(Voo voo:listaVoos) {
			listaString.concat(voo.ToString());}
		return "\nCódigo: " + codigo + "\nAeroporto de Origem: " + codigoOrigem + "\nAeroporto de Destino: " + codigoDestino 
				+ "\nHora de Partida: " + getHoraSaidaString() + "\nHora de Chegada: " + getHoraChegadaString() + "\nCompanhia Aérea: "
				+ cAerea + "Lista de Voos: " + listaString;
	}
}
