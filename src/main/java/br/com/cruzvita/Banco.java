package br.com.cruzvita;

public class Banco {

	public String nomeBanco;
	public Cliente cliente;
	public Conta conta;
	//atributos

	//construtor
	public Banco(String nomeBanco, Cliente cliente) {
		this.nomeBanco = nomeBanco;
		this.cliente = cliente;

	}

	//metodos
	public void depositar(double valor) {
		conta.saldo = conta.saldo + valor;
	}

	public void sacar(double valor) {
		conta.saldo = conta.saldo - valor;
	}

	public void transferir(Conta conta1, Conta conta2, double valor) {
		conta1.saldo = conta1.saldo - valor;
		conta2.saldo = conta2.saldo + valor;
	}
}
