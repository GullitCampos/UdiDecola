package udiDecola;

import java.util.ArrayList;

public class DAOTrechoVoo{
	
	private static ArrayList<TrechoVoo> listaTrechoVoo;
	
	public static void inicializar() {
		if (listaTrechoVoo == null)
			listaTrechoVoo = new ArrayList<TrechoVoo>();
	}
	
	public static void cadastrar(TrechoVoo t) {
		listaTrechoVoo.add(t);
	}
	
	public static String listar() {
		String lista = "";
		for(TrechoVoo t: listaTrechoVoo)
			lista.concat(t.toString());
		return lista;
	}
	
	public static TrechoVoo buscar(String codigo) {
		TrechoVoo t = null;
		for(TrechoVoo trecho: listaTrechoVoo) {
			if (trecho.getCodigo().equals(codigo)) {
				t = trecho;
				break;
			}
		}
		return t;
	}

	
	public static boolean excluir(String codigo){
		TrechoVoo t = buscar(codigo);
		if (t != null) {
			listaTrechoVoo.remove(t);
			return true;
		}
		else 
			return false;
	}
}
