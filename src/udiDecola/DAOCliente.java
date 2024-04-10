package udiDecola;

import java.io.IOException;
import java.util.ArrayList;

public class DAOCliente{
	
	private static ArrayList<Cliente> listaCliente;
	
	public static void inicializar() {
		if (listaCliente == null)
			listaCliente = new ArrayList<Cliente>();
			try {
				listaCliente = (ArrayList<Cliente>)Persistencia.recuperar("cliente.dat");
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void cadastrar(Cliente c) {
		AcessoBanco a = new AcessoBanco();
		listaCliente.add(c);
		Persistencia.gravar(listaCliente, "cliente.dat");
		if(c.getDataVip() == null) 
			a.inserirBanco("insert into \"udiDecola\".\"Cliente\" "+ "VALUES ('" + c.getEmail() + "',"  + null + 
							",'" + c.getNroCompras() +"','" +  c.getNome() + "',"+  c.getCpf() + ",'" + java.sql.Date.valueOf(c.getDataNasc()) + 
							"','" + java.sql.Date.valueOf(c.getDataCadas())+ "','" + c.getEndereco() + "'," + c.getVip() + "," + c.ehFunc() + ")");
		else
			a.inserirBanco("insert into \"udiDecola\".\"Cliente\" "+ "VALUES ('" + c.getEmail() + "\',\'"  + java.sql.Date.valueOf(c.getDataVip()) + 
					"','" + c.getNroCompras() +"','" +  c.getNome() + "',"+  c.getCpf() + ",'" + java.sql.Date.valueOf(c.getDataNasc()) + 
					"','" + java.sql.Date.valueOf(c.getDataCadas())+ "','" + c.getEndereco() + "'," + c.getVip() + "," + c.ehFunc() + ")");
	}
	
	public static String listar() {
		String lista = "";
		for(Cliente c: listaCliente)
			lista.concat(c.toString());
		return lista;
	}
	
	public static Cliente buscar(String cpf) {
		Cliente c = null;
		for(Cliente cliente: listaCliente) {
			if (cliente.getCpf() != null) {
				if (cliente.getCpf().equals(cpf)) {
					c = cliente;
					break;
				}
			}
		}
		return c;
		}

	public static boolean excluir(String cpf){
		Cliente c = buscar(cpf);
		if (c != null) {
			listaCliente.remove(c);
			return true;
		}
		else 
			return false;
	}
}
