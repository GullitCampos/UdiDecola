package udiDecola;

import java.util.ArrayList;

public class DAOFuncionario {
	public static ArrayList<Funcionario> listaFuncionario;
	
	public static void inicializar() {
		if (listaFuncionario == null)
			listaFuncionario = new ArrayList<Funcionario>();
	}
	
	public static void cadastrar(Funcionario f) {
		listaFuncionario.add(f);
	}
	
	public static String listar() {
		String lista = "";
		for(Funcionario f: listaFuncionario)
			lista.concat(f.toString());
		return lista;
	}
	
	public static Funcionario buscar(String cpf) {
		Funcionario f = null;
		for(Funcionario funcionario: listaFuncionario) {
			if (funcionario.getCpf().equals(cpf)) {
				f = funcionario;
				break;
			}
		}
		return f;
		}

	public static boolean excluir(String cpf){
		Funcionario f = buscar(cpf);
		if (f != null) {
			listaFuncionario.remove(f);
			return true;
		}
		else 
			return false;
	}
}
