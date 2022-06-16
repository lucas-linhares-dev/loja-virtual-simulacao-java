package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Carrinho;
import entities.Cliente;
import entities.Estoque;
import entities.Fabricante;
import entities.Fornecedor;
import entities.Loja;
import entities.Produto;

public class TesteLojaVirtual {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		Loja loja = new Loja("Pão de açucar", 34345465);
		
		
		Produto banana = new Produto("banana",2,10,1);
		Produto maca = new Produto("maça",1.5,10,2);
		Produto carne = new Produto("carne",10,10,3);
		Produto cerveja = new Produto("cerveja",5,10,4);
		Produto leite = new Produto("leite",2.5,10,5);
		Produto pao = new Produto("pao",0.50,10,6);
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(banana);
		produtos.add(maca);
		produtos.add(carne);
		produtos.add(cerveja);
		produtos.add(leite);
		produtos.add(pao);
		
		Estoque estoque = new Estoque(produtos);
		
		Fabricante fabricanteBanana = new Fabricante("fabricante de banana",12312,banana,true);
		Fabricante fabricanteMaca = new Fabricante("fabricante de maça",5435,maca,true);
		Fabricante fabricanteCarne = new Fabricante("fabricante de carne",3213,carne,true);
		Fabricante fabricanteCerveja = new Fabricante("fabricante de cerveja",1111,cerveja,true);
		Fabricante fabricanteLeite = new Fabricante("fabricante de leite",23323,leite,true);
		Fabricante fabricantePao = new Fabricante("fabricante de pão",21432,pao,true);
		
		Fornecedor fornecedorBanana = new Fornecedor("fornecedor de banana",12312,banana,true);
		Fornecedor fornecedorMaca = new Fornecedor("fornecedor de maça",5435,maca,true);
		Fornecedor fornecedorCarne = new Fornecedor("fornecedor de carne",3213,carne,true);
		Fornecedor fornecedorCerveja = new Fornecedor("fornecedor de cerveja",1111,cerveja,true);
		Fornecedor fornecedorLeite = new Fornecedor("fornecedor de leite",23323,leite,true);
		Fornecedor fornecedorPao = new Fornecedor("fornecedor de pão",21432,pao,true);
		
		System.out.println("Seja bem vindo ao Pão de Açucar!");
		System.out.println();
		System.out.println("Infome seu nome:");
		String nome = scr.nextLine();
		System.out.println("Informe seu documento:");
		int documento = scr.nextInt();
		
		Cliente cliente1 = new Cliente(nome,documento);
		Carrinho carrinho = new Carrinho(cliente1);
		List<Produto> produtosCarrinho = new ArrayList<>();
		
		double totalCompra = 0;
		
		while(true) {
		
			System.out.println("Os produtos da loja são:"
					+ " \n 1 - Banana - "+banana.getQuantidade()
					+ " \n 2 - Maça - "+maca.getQuantidade()
					+ " \n 3 - Carne - "+carne.getQuantidade()
					+ " \n 4 - Cerveja - "+cerveja.getQuantidade()
					+ " \n 5 - Leite - "+leite.getQuantidade()
					+ " \n 6 - Pao - "+pao.getQuantidade()
					+ " \n Escolha o produto que deseja adicionar no carrinho de acordo com a numeração."
					+ " \n\n 7 - Encerrar compra e realizar pagamento");
			
			int produto = scr.nextInt();
			
			if(produto == 7) {
				System.out.println();
				System.out.println("Pagamento recebido! Compra encerrada.");
				System.out.println();
				System.out.println("Nota fiscal:");
				System.out.println();
				System.out.println( ""
						+ "Cliente: "+cliente1.getNome()+" - "+cliente1.getDocumento()
						+ " \n\n 1 - Banana: \n"+" Quantidade - "+(10-banana.getQuantidade())+"\n Valor - "+((10-banana.getQuantidade())*banana.getValor())
						+ " \n\n 2 - Maça: \n"+" Quantidade - "+(10-maca.getQuantidade())+"\n Valor - "+((10-maca.getQuantidade())*maca.getValor())
						+ " \n\n 3 - Carne: \n"+" Quantidade - "+(10-carne.getQuantidade())+"\n Valor - "+((10-carne.getQuantidade())*carne.getValor())
						+ " \n\n 4 - Cerveja: \n"+" Quantidade - "+(10-cerveja.getQuantidade())+"\n Valor - "+((10-cerveja.getQuantidade())*cerveja.getValor())
						+ " \n\n 5 - Leite: \n"+" Quantidade - "+(10-leite.getQuantidade())+"\n Valor - "+((10-leite.getQuantidade())*leite.getValor())
						+ " \n\n 6 - Pao: \n"+" Quantidade - "+(10-pao.getQuantidade())+"\n Valor - "+((10-pao.getQuantidade())*pao.getValor()));
						
				System.exit(0);
			}
			
			System.out.println("Informe a quantidade que deseja:");
			
			int quantidade = scr.nextInt();
			
			if(produto == 1) {
				boolean disponivel = banana.comprar(quantidade);
				if(disponivel) {
					totalCompra+=banana.getValor()*quantidade;
					produtosCarrinho.add(banana);
				}

			}
			else if(produto == 2) {
				boolean disponivel = maca.comprar(quantidade);
				if(disponivel) {
					totalCompra+=maca.getValor()*quantidade;
					produtosCarrinho.add(maca);
				}
				
			}
			else if(produto == 3) {
				boolean disponivel = carne.comprar(quantidade);
				if(disponivel) {
					totalCompra+=carne.getValor()*quantidade;
					produtosCarrinho.add(carne);
				}
				
			}
			else if(produto == 4) {
				boolean disponivel = cerveja.comprar(quantidade);
				if(disponivel) {
					totalCompra+=cerveja.getValor()*quantidade;
					produtosCarrinho.add(cerveja);
				}
		
			}
			else if(produto == 5) {
				boolean disponivel = leite.comprar(quantidade);
				if(disponivel) {
					totalCompra+=leite.getValor()*quantidade;
					produtosCarrinho.add(leite);
				}
				
			}
			else if(produto == 6) {
				boolean disponivel = pao.comprar(quantidade);
				if(disponivel) {
					totalCompra+=pao.getValor()*quantidade;
					produtosCarrinho.add(pao);
				}
				
			}
			
			
			System.out.println("Total da compra: "+totalCompra);
			System.out.println();
			
		}
		
		
		

	}

}
