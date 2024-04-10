package udiDecola;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DAOCompra {
		
		private static HashMap<Integer,Compra> listaCompra;
		static AtomicInteger nextId = new AtomicInteger();

		public static void inicializar() {
			if (listaCompra == null) 
				listaCompra = new HashMap<Integer,Compra>();
		}
		
		public void cadastrar(Compra c) {
			int id = nextId.incrementAndGet();
			listaCompra.put(id, c);
		}
		
		public String listar() {
			String lista = "";
			for(HashMap.Entry<Integer, Compra> compra : listaCompra.entrySet())
				lista.concat(compra.getValue().toString());
			return lista;
		}
		
		public Compra buscar(int id) {
			Compra c = listaCompra.get(id);
			return c;
			}

		
		public boolean excluir(int id){
			Compra c = this.buscar(id);
			if (c != null) {
				listaCompra.remove(id);
				return true;
			}
			else 
				return false;
		}
}

