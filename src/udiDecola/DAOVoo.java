package udiDecola;

import java.time.LocalTime;
import java.util.ArrayList;

public class DAOVoo {
	
	private static ArrayList<Voo> listaTodosVoos;
	
	public static void inicializar() {
		if (listaTodosVoos == null)
			listaTodosVoos = new ArrayList<Voo>();
	}
	
	public static void cadastrar(Voo v) {
		listaTodosVoos.add(v);
	}
	
	public static String listar() {
		String lista = "";
		for(Voo v: listaTodosVoos)
			lista.concat(v.toString());
		return lista;
	}
	
	public static Voo buscar(TrechoVoo tre, LocalTime chegada, LocalTime partida) {
		Voo v = null;
		for(Voo voo: listaTodosVoos) {
			if (voo.getTre().equals(tre) & voo.getHrChegada().equals(chegada) && voo.getHrPartida().equals(partida) ) {
				v = voo;
				break;
			}
		}
		return v;
	}

	
	public static boolean excluir(TrechoVoo tre, LocalTime chegada, LocalTime partida){
		Voo v = buscar(tre, chegada, partida);
		if (v != null) {
			listaTodosVoos.remove(v);
			return true;
		}
		else 
			return false;
	}
}
