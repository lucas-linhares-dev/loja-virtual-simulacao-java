package entities;

public class Cliente extends Pessoa {
	private Carrinho carrinho;

	
	public Cliente(String nome, int documento) {
		super(nome, documento);
	}
	
	
	public Carrinho getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	
	
	
	
}
