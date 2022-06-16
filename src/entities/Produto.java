package entities;

public class Produto {
	private String nome;
	private double valor;
	private int quantidade;
	private int id;
	
	
	public Produto(String nome, double valor, int quantidade, int id) {
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
		this.id = id;
	}
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public boolean comprar(int quantidade) {
		if(this.quantidade>0) {
			if(quantidade<=this.quantidade) {
				this.quantidade -= quantidade;
				return true;
			}
			else {
				System.out.println("QUANTIDADE NAO DISPONÍVEL!");
				return false;
			}
		}
		else {
			System.out.println("PRODUTO ESGOTADO!");
			return false;
		}
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return  valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
