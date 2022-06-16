package entities;

import java.util.List;

public class Carrinho {
	private List<Produto> produtos;
	private double valorTotal;
	private Cliente cliente;

	
	
	
	public Carrinho(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
