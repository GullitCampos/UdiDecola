	package udiDecola;

import java.util.ArrayList;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TrechoVoo { //classe Trecho de Voo
	//váriveis de instância: 
	private String codigo;//codigo do trecho do voo
	private String codigoOrigem;//codigo dos aeroporto de Origem
	private String codigoDestino;//codigo do aeroporto de Destino
	private LocalTime horaSaida; //hora de saida do voo
	private LocalTime horaChegada;//hora de chegada do voo
	private CompanhiaAerea cAerea;//Objeto de uma classe CompanhiaAerea, que representa a companhia aérea do Voo
	private ArrayList<Voo> listaVoos;//Lista de voo que ocorre no trecho. 
	
	public final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	
	//Construtor que aceita todos os detalhes do trecho do voo como parâmentros. 
	public TrechoVoo(String codigo, String origem, String destino, LocalTime horaSaida, LocalTime horaChegada, CompanhiaAerea cAearea, ArrayList<Voo> listaVoos) {
		
		//
		setCodigo(codigo);
		setCodigoOrigem(origem);
		setCodigoDestino(destino);
		this.horaSaida = horaSaida;
		this.horaChegada = horaChegada;
		this.cAerea = cAearea;
		this.listaVoos = listaVoos;
	}
	
	
	//Construtor padrão, que não aceita nenhum argumento.
	public TrechoVoo() {}
	
	public ArrayList<Voo> getListaVoos() {
		return listaVoos;
	}

	public void setListaVoos(ArrayList<Voo> listaVoos) {
		this.listaVoos = listaVoos;
	}

	//Método que adiciona um voo à lista de voos deste trecho.
	public void addVoo(Voo v) {
		//chama o método cadastrar da classe DAOVoo para fazer cadastro. 
		DAOVoo.cadastrar(v);
		this.listaVoos.add(v);}
	
	public String getCodigo() {
		return codigo;
	}
	/*Este é um método setter chamado setCodigo que é usado para definir o 
	 valor da variável de instância codigo na classe a que pertence. 
	 O código do voo deve seguir um formato específico, e este método 
	 garante que o código fornecido segue esse formato antes de definir 
	 a variável codigo.*/
	
	/*Verifica se o comprimento do código fornecido é 8. 
	 Se não for, define codigo como uma string vazia.*/
	public void setCodigo(String codigo) {
		if (codigo.length() != 8) {
		    this.codigo = "";
		}
		/*
		Conta o número de letras maiúsculas nos primeiros 3
		 caracteres do código fornecido.
		 */
		int letraCount = 0, digitoCount = 0;
		for (int i = 0; i < 3; i++) {
		    char c = codigo.charAt(i);
		    if (c >= 'A' && c <= 'Z') {
		        letraCount++;
		    }
		}
		/*
		 Conta o número de dígitos nos últimos 5 caracteres 
		 do código fornecido.
		 */
		for (int i = 3; i < 8; i++) {
			char c = codigo.charAt(i);
			if (c >= '0' && c <= '9')
		        digitoCount++;
		}
		/*
		 Se o código fornecido tiver exatamente 3 letras maiúsculas 
		 seguidas por 4 dígitos, ele define codigo como o código 
		 fornecido. 
		 */
		if (letraCount == 3 && digitoCount == 4)
			this.codigo = codigo;
		
		/* Caso contrário, define codigo como uma string vazia.*/
		else codigo = "";
	}

	public String getCodigoOrigem() {
		return codigoOrigem;
	}

	/*Este é um método setter chamado setCodigoOrigem que é usado para definir 
	 o valor da variável de instância codigoOrigem na classe a que pertence. 
	 O código de origem deve seguir um formato específico, e este método garante 
	 que o código de origem fornecido segue esse formato antes de definir a 
	 variável codigoOrigem.
	 */
	public void setCodigoOrigem(String origem) {
		
		/*Verifica se o comprimento do código de origem fornecido é 3. Se não 
		 for, define codigo como uma string vazia.
		 */
		if (origem.length() != 3) {
		    this.codigo = "";
		}
		
		/*Conta o número de letras maiúsculas no código de origem fornecido.*/
		int letraCount = 0;
		for (int i = 0; i < 3; i++) {
		    char c = codigo.charAt(i);
		    if (c >= 'A' && c <= 'Z') {
		        letraCount++;
		    }
		}
		/*
		 Se o código de origem fornecido tiver exatamente 3 letras maiúsculas, 
		 ele define codigoOrigem como o código de origem fornecido. 
		 */
		if (letraCount == 3)
			this.codigoOrigem = origem;
		else
			/*Caso contrário, define codigoOrigem como uma string vazia.*/
			this.codigoOrigem = "";
	}

	public String getCodigoDestino() {
		return codigoDestino;
	}
	/*
 	Este é um método setter chamado setCodigoDestino que é usado para definir o 
  	valor da variável de instância codigoDestino na classe a que pertence. O 
   	código de destino deve seguir um formato específico, e este método garante 
    	que o código de destino fornecido segue esse formato antes de definir a variável 
    	codigoDestino.
 	*/
	public void setCodigoDestino(String destino) {
		
		/*Verifica se o comprimento do código de destino fornecido é 3. 
  		Se não for, define codigo como uma string vazia.*/
		if (destino.length() != 3) {
		    this.codigo = "";
		}

		/*Conta o número de letras maiúsculas no código de destino fornecido*/
		int letraCount = 0;
		for (int i = 0; i < 3; i++) {
		    char c = codigo.charAt(i);
		    if (c >= 'A' && c <= 'Z') {
		        letraCount++;
		    }
		}
		
		/*Se o código de destino fornecido tiver exatamente 3 letras maiúsculas, 
  		ele define codigoDestino como o código de destino fornecido. */
		if (letraCount == 3)
			this.codigoDestino = destino;
			
		/*Caso contrário, define codigoDestino como uma string vazia.*/
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
	
	/*
	 Este é um método chamado ToString na classe TrechoVoo. Ele retorna uma representação 
	 em string do objeto TrechoVoo.
	 */
	public String ToString() {
		
		/*Inicializa uma string vazia chamada listaString.*/
		String listaString = "";
		
		/*Para cada objeto Voo na lista de voos (listaVoos), ele chama o método 
		 ToString do objeto Voo e concatena o resultado à listaString. Isso cria 
		 uma string que representa todos os voos na lista.*/
		
		for(Voo voo:listaVoos) {
			listaString.concat(voo.ToString());}
		
		/*Retorna uma string que contém todas as informações do TrechoVoo, incluindo o código, 
		aeroporto de origem, aeroporto de destino, hora de partida, hora de chegada, companhia 
		aérea e a lista de voos.*/
		
		return "\nCódigo: " + codigo + "\nAeroporto de Origem: " + codigoOrigem + "\nAeroporto de Destino: " + codigoDestino 
				+ "\nHora de Partida: " + getHoraSaidaString() + "\nHora de Chegada: " + getHoraChegadaString() + "\nCompanhia Aérea: "
				+ cAerea + "Lista de Voos: " + listaString;
	}
}
