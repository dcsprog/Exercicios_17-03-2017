package model;

import java.util.ArrayList;

public class Produtos {
	
	
	public int idProduto;
	public String nomeProduto;
	public float precoProduto;
	public int stockProduto;
	
	
	public Produtos(int idProduto, String nomeProduto, float precoProduto, int stockProduto) {
		super();
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.stockProduto = stockProduto;
	}


	public int getIdProduto() {
		return idProduto;
	}


	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}


	public String getNomeProduto() {
		return nomeProduto;
	}


	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}


	public float getPrecoProduto() {
		return precoProduto;
	}


	public void setPrecoProduto(float precoProduto) {
		this.precoProduto = precoProduto;
	}


	public int getStockProduto() {
		return stockProduto;
	}


	public void setStockProduto(int stockProduto) {
		this.stockProduto = stockProduto;
	}
	
	public ArrayList<Produtos> addProduto(ArrayList<Produtos>produtos, Produtos produto){
		
		produtos.add(produto);
		
		return produtos;
	}
	
	public void listarProdutos(ArrayList<Produtos> produtos, int id){
		
		if(id==getIdProduto()){
			for(int i=0; i<produtos.size();i++){
				System.out.println("Nº DE REGISTO DO PRODUTO: "+ produtos.get(i). getIdProduto());
				System.out.println("NOME DO PRODUTO: "+ produtos.get(i).getNomeProduto());
				System.out.println("PRECO DO PRODUTO: " + produtos.get(i).getPrecoProduto());
				System.out.println("STOCK EXISTENTE: " + produtos.get(i).getStockProduto());
			}
		}else{
			System.out.println("ID NAO ENCONTRADO..");
		}
	}
	
	
	
}
