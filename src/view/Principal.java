package view;

import java.util.ArrayList;
import java.util.Scanner;

import model.Dados;

public class Principal {

	static Scanner teclado = new Scanner(System.in);
	
public static void InserirCliente(){
		
		
		
		ArrayList <Dados> bd = new ArrayList<Dados>();
		
		
		int opc=0;
		int idP=0;
		int id=0;
		String nome = null;
		String morada=null;
		int telefone = 0;
		int nif=0;
		boolean estado=true;
		
		System.out.println("QUANTOS REGISTOS DESEJA EFETUAR?");
		int num = teclado.nextInt();
		
		
		for(int i=0; i<num; i++){
			id=(i+1);
			System.out.println("INSIRA O NOME DO ALUNO: ");
			teclado.nextLine();
			nome = teclado.nextLine();
			System.out.println("INSIRA A SUA MORADA: ");
			morada = teclado.nextLine();
			System.out.println("INSIRA O SEU TELEFONE: ");
			telefone = teclado.nextInt();
			System.out.println("INSIRA O SEU NIF: ");
			nif = teclado.nextInt();
			System.out.println("ESTADO CLIENTE: ");
			System.out.println("  CONFIANCA  ");
			System.out.println(" SIM(1)NAO(2)");
			if(opc==1){
				estado=true;
			}else{
				estado=false;
			}
			
 			Dados dados = new Dados(id, nome,morada,telefone,nif, estado);
 			bd = dados.addAluno(bd, dados);
 			
		}
		
		System.out.println("\tINSIRA O CODIGO REGISTO QUE PROCURA: ");
		idP = teclado.nextInt();
		idP-=1;
		new Dados().listarDados(bd,idP);
		
		
		
	}



	public static void menuCli(){
		
		System.out.println(" - - - - - - BEM VINDO AO CHINISE - - - - - - ");
		System.out.println();
		System.out.println();
		System.out.println("             1 - REGISTAR CLIENTE             ");
		System.out.println();
		System.out.println("             2 - VERIFICAR CLIENTE            ");
		System.out.println();
		System.out.println("             3 - SAIR                         ");
		System.out.println();
		System.out.println("             ESCOLHA UMA OPCAO ");
		
	}
	
	
	public static void menuPro(){
		
		System.out.println(" - - - - - - BEM VINDO AO CHINISE - - - - - - ");
		System.out.println();
		System.out.println();
		System.out.println("             1 - REGISTAR PRODUTO             ");
		System.out.println();
		System.out.println("             2 - VERIFICAR PRODUTO            ");
		System.out.println();
		System.out.println("             3 - SAIR                         ");
		System.out.println();
		System.out.println("             ESCOLHA UMA OPCAO ");
		
	}
	
	
	public static void menuLoja(){
		
		System.out.println(" - - - - - - BEM VINDO AO CHINISE - - - - - - ");
		System.out.println();
		System.out.println();
		System.out.println("             1 - VERIFICAR PRODUTO             ");
		System.out.println();
		System.out.println("             2 - COMPRAR PRODUTO               ");
		System.out.println();
		System.out.println("             3 - SAIR                         ");
		System.out.println();
		System.out.println("             ESCOLHA UMA OPCAO ");
		
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opc;
		teclado.nextLine();
		opc = teclado.nextInt();
		switch(opc){
		case 1:
			menuCli();
			InserirCliente();
		
		}
			
	
	}
	
}