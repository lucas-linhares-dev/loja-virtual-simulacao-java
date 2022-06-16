package entities;

import java.util.List;

public class Estoque {
	private List<Produto> produtos;

	public Estoque(List<Produto> produtos) {
		this.produtos = produtos;
	}


	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	


	
}
