package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class AgenciaBancaria {
	
	static Scanner input = new Scanner(System.in);
	static ArrayList<Conta> ContasBancarias;
	private static Conta[] contasBancarias;
	
	public static void main(String[] args) {
		ContasBancarias = new ArrayList<Conta>();
		operacoes();
	}
	
	public static void operacoes() {
		
		System.out.println("-------------------------------------------------------");
		System.out.println("-----------Bem vindos a nossa Agência------------");
		System.out.println("-------------------------------------------------------");
		System.out.println("****Selecione a operação que deseja realizar****");
		System.out.println("-------------------------------------------------------");
		System.out.println("|    Opção 1 - Criar conta   |");
		System.out.println("|    Opção 2 - Depositar     |");
		System.out.println("|    Opção 3 - Sacar            |");
		System.out.println("|    Opção 4 - transferir     |");
		System.out.println("|    Opção 5 - Listar           |");
		System.out.println("|    Opção 6 - Sair              |");
		
		int operacao = input.nextInt();
		
		switch(operacao) {
		case 1: 
			criarConta();
			break;
		case 2: 
			depositar();
		    break;
		case 3:
			sacar();
			break;
		case 4:
			transferir();
			break;
		case 5:
			listar();
			break;
		case 6:
			System.out.println("Obrigado por utilizar nossa Agência!");
			System.exit(0);
			
		default:
			System.out.println("Opção Inválida");
			operacoes();
			break;
			
			
		}
		
	}
	
	public static void criarConta() {
		
		System.out.println("\nNome: ");
		String nome = input.next();
		
		System.out.println("\nCPF: ");
		String cpf = input.next();
		
		System.out.println();
		String email = input.next();
		
		Cliente cliente = new Cliente(nome, cpf, email);
		
		Conta conta = new Conta(cliente);
		
		ContasBancarias.add(conta);
		System.out.println("Sua conta foi criada com sucesso!");
		
		operacoes();
	}
	
	
	private static Conta encontrarConta(int numeroConta) {
		Conta conta = null;
		if(ContasBancarias.size() > 0) {
			for(Conta c : contasBancarias) {
				if(c.getNumeroConta() == numeroConta);
				conta = c;
			}
		}
		return conta;
	}
	
}
		
