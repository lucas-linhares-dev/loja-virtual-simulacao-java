package entities;

public class Loja extends Pessoa {
	private Cliente clientes;

	public Loja(String nome, int documento) {
		super(nome, documento);
	}

	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}
	
	
	
	
}
