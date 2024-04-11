package udiDecola;

import java.time.LocalTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

//A classe possui várias variáveis de instância
public class Hotel {
	private String cnpj; //o CNPJ do hotel
	private String nomeOficial;//o nome oficial do hotel
	private String nomeDivulg;//o nome de divulgação do hotel
	private String endereco;//o endereço do hotel
	private int anoCriacao;//o ano de criação do hotel
	private int numEstrelas;//o número de estrelas do hotel
	private boolean pets;//se o hotel aceita pets ou não
	private int nroQuartos;//o número de quartos do hotel
	private LocalTime checkIn;//o horário de check-in do hotel
	private LocalTime checkOut;//o horário de check-out do hotel
	private String msgDivulg;//a mensagem de divulgação do hotel
	private FuncionarioParcerias func;/*um objeto da classe FuncionarioParcerias que representa o 
					funcionário que realizou a parceria*/
	private static float valFixoVenda = 50;//um valor fixo de venda
	private ArrayList<QuartoData> listaQuartos = new ArrayList<QuartoData>();//uma lista de quartos do hotel
	
	public final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

	/*primeiro o são construtores que aceita todo os detalhes do hotel como parâmetros
 	obs: primeiro aceita o horário de check-in e check-out como strings*/
	
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

	/*primeiro o são construtores que aceita todo os detalhes do hotel como parâmetros
 	obs:  o segundo aceita como LocalTime */
	
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
	/*
	 Este é um método chamado addDias na classe Hotel. 
  	Ele é usado para adicionar dias à lista de quartos do hotel.

   	O método aceita três parâmetros:
    
    	listaQuartos: uma lista de objetos QuartoData, que representa os quartos do hotel em datas específicas.
    	startDate: a data de início do intervalo de datas para o qual os quartos devem ser adicionados.
    	endDate: a data de fim do intervalo de datas para o qual os quartos devem ser adicionados.
	*/
	public void addDias(ArrayList<QuartoData> listaQuartos, LocalDate startDate, LocalDate endDate) {
		
		/*Dentro do método, há um loop que começa na startDate e termina um dia antes da endDate. 
  		Para cada dia nesse intervalo
    		Para cada dia nesse intervalo, o método faz o seguinte: */
		for (LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {

			/*Cria um novo objeto QuartoData para a data atual do loop e o hotel atual 
   			(representado pela palavra-chave this).*/
			QuartoData q = new QuartoData(date, this);
			
			/*Adiciona o novo objeto QuartoData à listaQuartos.*/
			listaQuartos.add(q);

			/*Chama o método cadastrar da classe DAOQuartoData para cadastrar 
   			o novo objeto QuartoData*/
			DAOQuartoData.cadastrar(q);

			/*obs: Portanto, este método efetivamente adiciona um QuartoData para cada dia 
   			no intervalo de datas fornecido à listaQuartos e cadastra cada um desses QuartoData.*/
		}
	}

	/*Este é um método chamado encontraQuartoData na classe Hotel. 
 	Ele é usado para encontrar um objeto QuartoData em uma data específica.*/

	public QuartoData encontraQuartoData(LocalDate date) {

		/*Dentro do método, há um loop que percorre cada QuartoData na lista de quartos 
  		do hotel (listaQuartos). Para cada QuartoData, ele verifica se a data do QuartoData
    		é igual à data fornecida. Se for, ele retorna esse QuartoData.*/
		for(QuartoData quarto : listaQuartos) {
			if(quarto.getData().equals(date))
				return quarto;
		}
		/*Se o método percorrer toda a lista de quartos e não encontrar um 
  		QuartoData com a data fornecida, ele retorna null*/
		return null;
	}

	/*Este é um método chamado quartosDisponiveis na classe Hotel. Ele é usado para 
 	verificar se há quartos disponíveis para um determinado número de quartos simples, 
  	duplos, triplos e luxuosos em um intervalo de datas.*/

	public Boolean quartosDisponiveis(int singles, int duplos, int triplos, int luxos, LocalDate startDate, LocalDate endDate) {

		/*No primeiro loop, para cada dia, ele verifica se há quartos suficientes disponíveis 
   		para o número de quartos simples, duplos, triplos e luxuosos solicitados. Ele faz 
      		isso subtraindo o número solicitado do número total de quartos disponíveis para cada 
	 	tipo de quarto. Se não houver quartos suficientes disponíveis para qualquer tipo de 
    		quarto, ele retorna false.*/
		
		for(LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			if(this.encontraQuartoData(date).getQtdSingle() - singles < 0 || this.encontraQuartoData(date).getQtdDuplo() - duplos < 0 ||
					   this.encontraQuartoData(date).getQtdTriplo() - triplos < 0 || this.encontraQuartoData(date).getQtdLuxo() - luxos < 0)
				return false;
		}
		
		/*No segundo loop, se houver quartos suficientes disponíveis para todos os tipos de quartos, 
  		ele decrementa o número de quartos disponíveis para cada tipo de quarto pelo número solicitado. 
    		Isso é feito chamando o método decrementaQuartos no objeto QuartoData para a data atual.*/
		
		for(LocalDate date = startDate; date.isBefore(endDate); date = date.plusDays(1)) {
			this.encontraQuartoData(date).decrementaQuartos(singles, duplos, triplos, luxos);
			
		}

		/*Finalmente, se houver quartos suficientes disponíveis para todos os 
  		tipos de quartos em todas as datas, o método retorna true*/
		return true;
	}
	public double totalHotel(int singles, int duplos, int triplos, int luxos, LocalDate startDate, LocalDate endDate) {
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
		return "CNPJ: " + this.getCnpj() + "\nNome Oficial: " + this.getNomeOficial() + "\nNome de Divulgação: "
				+ this.getNomeDivulg() + "\nEndereço: " + this.getEndereco() + "\nAno de Criação: " + this.getAnoCriacao() 
				+ "\nNúmero de Estrelas: " + this.getNumEstrelas() + "\nNúmero de Quartos: "+ this.getNroQuartos() 
				+ "\nHorário Check-In: " + this.getCheckInString() + "\nHorário Check-Out: "+ this.getCheckOutString() 
				+ "\nMensagem de Divulgação: " + this.getMsgDivulg() + "\nFuncionário que realizou parceria: "+ this.getFunc();
	}
}
