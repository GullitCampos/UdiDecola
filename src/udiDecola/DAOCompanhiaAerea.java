package udiDecola;

import java.util.ArrayList;

public class DAOCompanhiaAerea {
	
	private static ArrayList<CompanhiaAerea> listaCiaAerea;
	
	public static void inicializar() {
		if (listaCiaAerea == null)
			listaCiaAerea = new ArrayList<CompanhiaAerea>();
	}
	
	public static void cadastrar(CompanhiaAerea c) {
		listaCiaAerea.add(c);
	}
	
	public static String listar() {
		String lista = "";
		for(CompanhiaAerea c: listaCiaAerea)
			lista.concat(c.toString());
		return lista;
	}
	
	public static CompanhiaAerea buscar(String cnpj) {
		CompanhiaAerea c = null;
		for(CompanhiaAerea ciaAerea: listaCiaAerea) {
			if (ciaAerea.getCnpj().equals(cnpj)) {
				c = ciaAerea;
				break;
			}
		}
		return c;
		}

	
	public static boolean excluir(String cnpj){
		CompanhiaAerea c = buscar(cnpj);
		if (c != null) {
			listaCiaAerea.remove(c);
			return true;
		}
		else 
			return false;
	}
}
