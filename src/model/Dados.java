package model;

import java.util.ArrayList;

public class Dados {
	
	public int id;
	public String nome;
	public String morada;
	public int telefone;
	public int nif;
	public boolean estado; 
	

	public Dados(int id, String nome, String morada, int telefone, int nif, boolean estado) {
		super();
		this.id = id;
		this.nome = nome;
		this.morada = morada;
		this.telefone = telefone;
		this.nif = nif;
		this.estado = estado;
	}
	
	public Dados(){
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMorada() {
		return morada;
	}
	public void setMorada(String morada) {
		this.morada = morada;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getNif() {
		return nif;
	}
	public void setNif(int nif) {
		this.nif = nif;
	}
	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	

	
	public ArrayList<Dados> addAluno(ArrayList<Dados> dados, Dados dados1){
		
		dados.add(dados1);
		
		return dados;
	}
	
	public void listarDados(ArrayList<Dados> dados, int id){
		
		if(id==getId()){
			for(int i=0; i<dados.size();i++){
				System.out.println("REGISTO Nº: "+ dados.get(i).getId());
				System.out.println("NOME: "+ dados.get(i).getNome());
				System.out.println("MORADA: " + dados.get(i).getMorada());
				System.out.println("TELEFONE: " + dados.get(i).getTelefone());
			}
		}else{
			System.out.println("ID NAO ENCONTRADO..");
		}
	}
	
	
	public void verificaCliente(ArrayList<Dados> dados, String nome){
		
		if(nome==getNome()){
			if(estado==true){
				System.out.println("CLIENTE E COMPRIDOR...");
			}else{
				System.out.println("CLIENTE NAO E COMPRIDOR...");
			}
		}
		
		
	}
	
	
	
}
