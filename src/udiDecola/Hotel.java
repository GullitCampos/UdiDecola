	package udiDecola;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Hotel {
	private String cnpj; 
	private String nomeOficial;
	private String nomeDivulg;
	private String endereco;
	private int anoCriacao;
	private int numEstrelas;
	private boolean pets;
	private int nroQuartos;
	private LocalTime checkIn;
	private LocalTime checkOut;
	private String msgDivulg;
	private FuncionarioParcerias func;
	
	private static float valFixoVenda = 50;
	private ArrayList<QuartoData> listaQuartos = new ArrayList<QuartoData>();
	
	public final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

	
	public Hotel(String cnpj, String nomeOficial, String nomeDivulg, String endereco, int anoCriacao, int numEstrelas,
				 boolean pets, int nroQuartos, String checkIn, String checkOut, String msgDivulg, FuncionarioParcerias func) {
		this.cnpj = cnpj;
		this.nomeOficial = nomeOficial;
		this.nomeDivulg = nomeDivulg;
		this.endereco = endereco;
		this.anoCriacao = anoCriacao;
		this.numEstrelas = numEstrelas;
		this.pets = pets;
		this.nroQuartos = nroQuartos;
		setCheckIn(checkIn);
		setCheckOut(checkOut);
		setMsgDivulg(msgDivulg);
		this.func = func;
		this.func.getHoteisCadas().add(this);
		func.incrementaQtd();
	}
	
	public Hotel(String cnpj, String nomeOficial, String nomeDivulg, String endereco, int anoCriacao, int numEstrelas,
				 boolean pets, int nroQuartos, LocalTime checkIn, LocalTime checkOut, String msgDivulg, FuncionarioParcerias func)
	{
		this.cnpj = cnpj;
		this.nomeOficial = nomeOficial;
		this.nomeDivulg = nomeDivulg;
		this.endereco = endereco;
		this.anoCriacao = anoCriacao;
		this.numEstrelas = numEstrelas;
		this.pets = pets;
		this.nroQuartos = nroQuartos;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		setMsgDivulg(msgDivulg);
		this.func = func;
		this.func.getHoteisCadas().add(this);
		func.incrementaQtd();
	}

	public Hotel() {
	}
	
	public FuncionarioParcerias getFunc() {
		return func;
	}

	public void setFunc(FuncionarioParcerias func) {
		this.func = func;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeOficial() {
		return nomeOficial;
	}

	public void setNomeOficial(String nomeOficial) {
		this.nomeOficial = nomeOficial;
	}

	public String getNomeDivulg() {
		return nomeDivulg;
	}

	public void setNomeDivulg(String nomeDivulg) {
		this.nomeDivulg = nomeDivulg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getAnoCriacao() {
		return anoCriacao;
	}

	public void setAnoCriacao(int anoCriacao) {
		this.anoCriacao = anoCriacao;
	}

	public int getNumEstrelas() {
		return numEstrelas;
	}

	public void setNumEstrelas(int numEstrelas) {
		this.numEstrelas = numEstrelas;
	}

	public boolean isPets() {
		return pets;
	}

	public void setPets(boolean pets) {
		this.pets = pets;
	}

	public int getNroQuartos() {
		return nroQuartos;
	}

	public void setNroQuartos(int nroQuartos) {
		this.nroQuartos = nroQuartos;
	}

	public LocalTime getCheckIn() {
		return checkIn;
	}

	public String getCheckInString() {
		return checkIn.format(timeFormatter);
	}
	
	public void setCheckIn(LocalTime checkIn) {
		this.checkIn = checkIn;
	}
	
	public void setCheckIn(String checkIn) {
		LocalTime time = LocalTime.parse(checkIn);
		this.checkIn = time;
	}

	public LocalTime getCheckOut() {
		return checkOut;
	}
	
	public String getCheckOutString() {
		return checkIn.format(timeFormatter);
	}
	
	public void setCheckOut(LocalTime checkOut) {
		this.checkOut = checkOut;
	}

	public void setCheckOut(String checkOut) {
		LocalTime time = LocalTime.parse(checkOut);
		this.checkOut = time;
	}

	public String getMsgDivulg() {
		return msgDivulg;
	}
	
	public void setMsgDivulg(String msgDivulg) {
		this.msgDivulg = "Hotel " + numEstrelas + "." + msgDivulg;
	}

	public static float getValFixoVenda() {
		return valFixoVenda;
	}

	public static void setValFixoVenda(float valFixoVenda) {
		Hotel.valFixoVenda = valFixoVenda;
	}

	public ArrayList<QuartoData> getListaQuartos() {
		return listaQuartos;
	}

	public void setListaQuartos(ArrayList<QuartoData> listaQuartos) {
		this.listaQuartos = listaQuartos;
	}
	
	public void addDias(ArrayList<QuartoData> listaQuartos, LocalDate startDate, LocalDate endDate) {

		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {

			QuartoData q = new QuartoData(date, this);
			
			listaQuartos.add(q);
			DAOQuartoData.cadastrar(q);

		}
	}

	public QuartoData encontraQuartoData(LocalDate date) {

		for(QuartoData quarto : listaQuartos) {
			if(quarto.getData().equals(date))
				return quarto;
		}
		/*Se o método percorrer toda a lista de quartos e não encontrar um 
  		QuartoData com a data fornecida, ele retorna null*/
		return null;
	}

	public Boolean quartosDisponiveis(int singles, int duplos, int triplos, int luxos, LocalDate startDate, LocalDate endDate) {

		
		for(LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			if(this.encontraQuartoData(date).getQtdSingle() - singles < 0 || this.encontraQuartoData(date).getQtdDuplo() - duplos < 0 ||
					   this.encontraQuartoData(date).getQtdTriplo() - triplos < 0 || this.encontraQuartoData(date).getQtdLuxo() - luxos < 0)
				return false;
		}
		
		
		for(LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			this.encontraQuartoData(date).decrementaQuartos(singles, duplos, triplos, luxos);
			
		}

		return true;
	}
	public double totalHotel(int singles, int duplos, int triplos, int luxos, LocalDate startDate, LocalDate endDate) {
		
		/*método, ele inicializa uma variável totalHotel como 0.0.
  		Esta variável será usada para acumular o custo total.*/
		double totalHotel = 0.0;
		
		for(LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			totalHotel += singles* (this.encontraQuartoData(date).getDiariaSingle()) + 
					duplos* (this.encontraQuartoData(date).getDiariaDuplo()) + 
					triplos* (this.encontraQuartoData(date).getDiariaTriplo()) +
					luxos* (this.encontraQuartoData(date).getDiariaLuxo());
		}

		return totalHotel;
	}

	public String toString() {
		
		/*o método toString retorna uma string que contém todas as informações sobre o hotel*/
		
		return "CNPJ: " + this.getCnpj() + "\nNome Oficial: " + this.getNomeOficial() + "\nNome de Divulgação: "
				+ this.getNomeDivulg() + "\nEndereço: " + this.getEndereco() + "\nAno de Criação: " + this.getAnoCriacao() 
				+ "\nNúmero de Estrelas: " + this.getNumEstrelas() + "\nNúmero de Quartos: "+ this.getNroQuartos() 
				+ "\nHorário Check-In: " + this.getCheckInString() + "\nHorário Check-Out: "+ this.getCheckOutString() 
				+ "\nMensagem de Divulgação: " + this.getMsgDivulg() + "\nFuncionário que realizou parceria: "+ this.getFunc();
	}
}
