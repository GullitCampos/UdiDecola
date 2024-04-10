package udiDecola;

import java.time.LocalDate;
import java.util.ArrayList;

public class DAOQuartoData {
	
	private static ArrayList<QuartoData> listaQuartoData;
	
	public static void inicializar() {
		if (listaQuartoData == null)
			listaQuartoData = new ArrayList<QuartoData>();
	}
	
	public static void cadastrar(QuartoData q) {
		listaQuartoData.add(q);
	}
	
	public static String listar() {
		String lista = "";
		for(QuartoData q: listaQuartoData)
			lista.concat(q.toString());
		return lista;
	}
	
	public static QuartoData buscar(Hotel hotel, LocalDate data) {
		QuartoData q = null;
		for(QuartoData quarto: listaQuartoData) {
			if (quarto.getHotel().equals(hotel) & quarto.getData().equals(data)) {
				q = quarto;
				break;
			}
		}
		return q;
	}

	
	public static boolean excluir(Hotel hotel, LocalDate data){
		QuartoData q = buscar(hotel, data);
		if (q != null) {
			listaQuartoData.remove(q);
			return true;
		}
		else 
			return false;
	}
}
