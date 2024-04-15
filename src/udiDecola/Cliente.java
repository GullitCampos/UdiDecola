package udiDecola;

import java.time.LocalDate;
import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = -3506105600864403851L;
	private String email;
	private Boolean vip;
	private LocalDate dataVip;
	private static double desconto = 0.05;
	private int nroCompras;
	private Boolean ehFunc;
	private static int nroComprasVip = 50;

	public Cliente(String nome, String cpf, LocalDate dataNasc, LocalDate dataCadas, 
		       String endereco, String email,
			Boolean vip, LocalDate dataVip, int nroCompras, Boolean ehFunc) {
		super(nome, cpf, dataNasc, dataCadas, endereco);
		this.email = email;
		this.vip = vip;
		this.dataVip = dataVip;
		this.nroCompras = nroCompras;
		this.ehFunc = ehFunc;
	}
	
	public Cliente(String nome, String cpf, LocalDate dataNasc,  String endereco, String email) {
		super(nome, cpf, dataNasc, endereco);
		this.email = email;
		setFunc();
		this.nroCompras = 0;
		this.vip = false;
		this.dataVip = null;
	}
	
	public Cliente(String nome, String cpf) {
		super(nome, cpf);
		setFunc();
	}

	public Cliente() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getVip() {
		return vip;
	}
	public void setVip() {
		if (nroCompras > nroComprasVip) {
			this.vip = true;
			setDataVip();
		} else vip = false;
	}

	public void setVip(Boolean vip){
		this.vip = vip;
	}
	
	public LocalDate getDataVip() {
		return dataVip;
	}

	public String getDataVipString() {
		return dataVip.format(formatter);
	}

	public void setDataVip() {
		this.dataVip = LocalDate.now();
	}

	public void setDataVip(LocalDate dataVip) {
		this.dataVip = dataVip;
	}

	public static double getDesconto() {
		return desconto;
	}

	public static void setDesconto(double desconto){
		Cliente.desconto = desconto;
	}

	public int getNroCompras() {
		return nroCompras;
	}

	public void setNroCompras(int nroCompras) {
		this.nroCompras = nroCompras;
	}

	public void incrementaCompras() {
		this.nroCompras++;
		this.setVip();
	}

	public void setFunc() {
		if(DAOFuncionario.buscar(this.getCpf()) != null) this.ehFunc = true;
		else this.ehFunc = false;
	}

	public boolean ehFunc() {
		return ehFunc;
	}
	
	public static int getNroComprasVip() {
		return nroComprasVip;
	}

	public static void setNroComprasVip(int nroComprasVip) {
		Cliente.nroComprasVip = nroComprasVip;
	}

	@Override
	public String toString() {
		return super.toString() + "\nE-mail: " + this.getEmail() + "\nVIP: " + this.getVip() + "\nData VIP: " + 
				this.getDataVip() + "\nNúmero de Compras: " + this.getNroCompras() + "\n" + "É funcionário?" + this.ehFunc();
	}

}
