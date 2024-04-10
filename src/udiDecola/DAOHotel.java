package udiDecola;

import java.util.ArrayList;

public class DAOHotel{
	
	private static ArrayList<Hotel> listaHotel;
	
	public static void inicializar() {
		if (listaHotel == null)
			listaHotel = new ArrayList<Hotel>();
	}
	
	public static void cadastrar(Hotel h) {
		listaHotel.add(h);
	}
	
	public static String listar() {
		String lista = "";
		for(Hotel h: listaHotel)
			lista.concat(h.toString());
		return lista;
	}
	
	public static Hotel buscar(String cnpj) {
		Hotel h = null;
		for(Hotel hotel: listaHotel) {
			if (hotel.getCnpj().equals(cnpj)) {
				h = hotel;
				break;
			}
		}
		return h;
		}

	
	public static boolean excluir(String cnpj){
		Hotel h = buscar(cnpj);
		if (h != null) {
			listaHotel.remove(h);
			return true;
		}
		else 
			return false;
	}
}
