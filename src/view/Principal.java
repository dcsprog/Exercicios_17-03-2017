package view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import model.Dados;
import model.Produtos;
import view.Menu;

public class Principal {

	static Scanner teclado = new Scanner(System.in);
	static ArrayList <Dados> bd = new ArrayList<Dados>();
	static ArrayList <Produtos> bdProduto = new ArrayList<Produtos>();
	static Menu m = new Menu();
	static int idC;
	static int idP;
	
	
public static void InserirCliente(){
		
		
		int opc=0;
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
		
		/**System.out.println("\tINSIRA O CODIGO REGISTO QUE PROCURA: ");
		idP = teclado.nextInt();
		idP-=1;
		new Dados().listarDados(bd,idP);*/
		
		
	}

public static void inserirProduto(){
	
	
	int opc=0;
	int idProduto=0;
	String nomeProduto = null;
	float precoProduto = 0;
	int stockProduto=0;

	
	
	System.out.println("QUANTOS REGISTOS DESEJA EFETUAR?");
	int quant = teclado.nextInt();
	
	
	for(int i=0; i<quant; i++){
		idProduto=(i+1);
		System.out.println("INSIRA O NOME DO PRODUTO: ");
		teclado.nextLine();
		nomeProduto = teclado.nextLine();
		System.out.println("INSIRA O PRECO DO PRODUTO: ");
		precoProduto = teclado.nextFloat();
		System.out.println("INSIRA A QUANTIDADE EXISTENTE: ");
		stockProduto = teclado.nextInt();
		
			Produtos produto = new Produtos(idProduto, nomeProduto,precoProduto, stockProduto);
			bdProduto = produto.addProduto(bdProduto, produto);
			
	}
	
	/**System.out.println("\tINSIRA O CODIGO REGISTO QUE PROCURA: ");
	idP = teclado.nextInt();
	idP-=1;
	new Dados().listarDados(bd,idP);*/
	
	
}

	public static void listarCli(){
		System.out.println("\tINSIRA O CODIGO REGISTO QUE PROCURA: ");
		idC = teclado.nextInt();
		idC-=1;
		new Dados().listarDados(bd,idC);
	}

	
	public static void listarPro(){
		System.out.println("\tINSIRA O CODIGO DO PRODUTO: ");
		idP = teclado.nextInt();
		idP-=1;
		new Produtos().listarProdutos(bdProduto,idP);
	}

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcPrincipal=0, opcCliente=0, opcProduto=0, opcFuncionario=0;
		boolean verMenuCli=true, verMenuPro=true, verMenuPri=true, verMenuFunc=true;
		
		do{
		
			m.menuLoja();
			//teclado.nextLine();
			opcPrincipal = teclado.nextInt();
			switch(opcPrincipal){
			case 1:
				do{
				
					m.menuFuncionario();
					teclado.nextLine();
					opcFuncionario = teclado.nextInt();
					switch(opcFuncionario){
						case 1:
						do{
						
							m.menuCli();
							teclado.nextLine();
							opcCliente = teclado.nextInt();
							switch(opcCliente){
								case 1:InserirCliente();break;
								case 2:listarCli();break;
								case 3:verMenuCli=false;break;
								default:System.out.println("Opcao invalida...");
							}
						}while(verMenuCli);
						break;
						case 2:
							do{
						
								m.menuPro();
								teclado.nextLine();
								opcProduto = teclado.nextInt();
								switch(opcProduto){
									case 1:inserirProduto();break;
									case 2:listarPro();break;
									case 3:verMenuPro=false;break;
									default:System.out.println("Opcao invalida...");
								}
							}while(verMenuPro);
							break;
						case 3:verMenuFunc=false;break;
						default:System.out.println("Opcao invalida...");
						}
				}while(verMenuFunc);
			break;
			case 2:
				System.out.println("INSIRA O NUMERO DO PRODUTO QUE PRETENDE COMPRAR: ");
				break;
			case 3:System.out.println("Encerrando o programa...");
			verMenuPri=false;
			break;
			default:System.out.println("Opcao invalida...");
			}
		}while(verMenuPri);
	
	}
	
}

///http://www.guj.com.br/t/gravar-arraylist-em-arquivo-txt/71441/4
/// FILES 