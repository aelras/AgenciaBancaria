package Programa;

import Utilitarios.Utils;

public class Conta {
	
	private static int contadorDeContas = 1; // Cada conta criada será atribuído o número em ordem crescente

	private int numeroConta;
	private Cliente cliente;
	private Double saldo = 0.0;
	
	public Conta(Cliente cliente) {
		this.numeroConta = contadorDeContas;
		this.cliente = cliente;
		contadorDeContas += 1;
	}

	public static int getContadorDeContas() {
		return contadorDeContas;
	}

	public static void setContadorDeContas(int contadorDeContas) {
		Conta.contadorDeContas = contadorDeContas;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "\nNúmero da conta: " + this.getNumeroConta() +
		"\nNome: " + this.cliente.getNome() +
		"\nCPF: " + this.cliente.getCpf() +
		"\nEmail: " + this.cliente.getEmail() +
		"\nsaldo: " + Utils.doubleToString(this.getSaldo()) +
		"\n";
		
	}
		
			public void depositar(Double valor) {
				if(valor > 0) {
					setSaldo(getSaldo() + valor);
					System.out.println("Seu depóssito foi realizado com sucesso!");
				}else {
					System.out.println("Não foi possível realizar o depósito");
				}
			}
			
			public void sacar(Double valor) {
				if(valor > 0 && this.getSaldo() >= valor) {
					setSaldo(getSaldo() - valor);
					System.out.println("Saque foi realizado com sucesso!");
				}else {
					System.out.println("Não foi possível realizar o saque!");
				}
			}
			public void transferir(Conta contaParaDeposito, Double valor) {
				if(valor > 0 && this.getSaldo() >= valor) {
					setSaldo(getSaldo() - valor);
					
					contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
					System.out.println("Transferência realizada com sucesso!");
				}else {
					System.out.println("Não foi possível realizar a transferência");
				}
			}
			
}
	
	
	
