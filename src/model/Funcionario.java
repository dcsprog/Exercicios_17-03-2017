package model;

public class Funcionario extends Dados {

	public String senha;

	public Funcionario(int id, String nome, String morada, int telefone, int nif, boolean estado, String senha) {
		super(id, nome, morada, telefone, nif, estado);
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean login(String pass){
		
		if(pass==getSenha()){
			return true;
		}else{
			return false;
		}
		
	}
	
	
	
}
