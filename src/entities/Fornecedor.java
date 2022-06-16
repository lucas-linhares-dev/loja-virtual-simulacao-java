package entities;

public class Fornecedor extends Pessoa {
	private Produto produto;
	private boolean disponivel;


	public Fornecedor(String nome, int documento, Produto produto, boolean disponivel) {
		super(nome, documento);
		this.produto = produto;
		this.disponivel = disponivel;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	
	
}
