package udiDecola;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DAOPesquisas {
	
	private static HashMap<Integer,Pesquisas> listaPesquisa;
	static AtomicInteger nextId = new AtomicInteger();

	public static void inicializar() {
		if (listaPesquisa == null) 
			listaPesquisa = new HashMap<Integer,Pesquisas>();
	}
	
	public static void cadastrar(Pesquisas p) {
		int id = nextId.incrementAndGet();
		listaPesquisa.put(id, p);
	}
	
	public static String listar() {
		String lista = "";
		for(HashMap.Entry<Integer, Pesquisas> pesquisa : listaPesquisa.entrySet())
			lista.concat(pesquisa.getValue().toString());
		return lista;
	}
	
	public static Pesquisas buscar(int id) {
		Pesquisas p = listaPesquisa.get(id);
		return p;
		}

	
	public static boolean excluir(int id){
		Pesquisas p = buscar(id);
		if (p != null) {
			listaPesquisa.remove(id);
			return true;
		}
		else 
			return false;
	}
}
