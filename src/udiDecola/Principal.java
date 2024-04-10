package udiDecola;

public class Principal {
	
	public static void main(String[] args) {
		DAOCompanhiaAerea.inicializar();
		DAOCliente.inicializar();
		DAOCompra.inicializar();
		DAOFuncionario.inicializar();
		DAOHotel.inicializar();
		DAOPesquisas.inicializar();
		DAOQuartoData.inicializar();
		DAOTrechoVoo.inicializar();
		DAOVoo.inicializar();
		PrincipalGUI pringui = new PrincipalGUI();
	}

}
