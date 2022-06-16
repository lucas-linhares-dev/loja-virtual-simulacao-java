package entities;

public class Pessoa {    // FISICA E JURIDICA
	private String nome;
	private int documento;
	
	
	public Pessoa(String nome, int documento) {
		this.nome = nome;
		this.documento = documento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getDocumento() {
		return documento;
	}


	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
	
}
